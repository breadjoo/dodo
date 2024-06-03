
## db파일 있는것 다운받아 사용하기

    windows powershell(작업관리자) 버젼으로 키고
    setx path "C:program files\mysql\mysql server 8.0\bin;%path%"
    입력 (환경변수 설정에서 확인해보기)
    폴더 경로는 my sql server 찾아가서 확인하기
    shutdown -r -t 0 // 재부팅

    다시 키면 cd명령어를 이용해서 다운받은 폴더경로까지 찾아간 후 밑에 내용을 폴더에서 차례대로 실행
    mysql -u root -p 
    source employees.sql;
    show databases;
    exit

## 프로시저와 트리거 복습

## 기본 프로시저 ( 해당 grade 찾아서 출력하기 )
    drop procedure if exists uProc1;
    delimiter $$
    create procedure uProc(
    in userGrade char(10))
    begin
    	select*from usertbl where grade = userGrade;
    end $$
    delimiter ;
    
    call uProc('green');

## cursor를 이용해 평균값 출력하는 프로시저
    drop procedure if exists uProc2;
    delimiter $$
    create procedure uProc2()
    begin
      declare total int default 0;
        declare cnt int default 0;
        declare uBirthYear int default 0;
        declare age int default 0;
        declare agetotal int default 0;
        declare endOfRow boolean default false;
        declare userCursor cursor for
    		select birthYear from usertbl;
        declare continue handler 
    		for not found set endOfRow = true;
        
      open userCursor;
        cursor_loop : loop
        fetch userCursor into uBirthYear;
        if endOfRow then leave cursor_loop;
        end if;
        set cnt = cnt+1;
        set age = 2025 - ubirthYear;
        set agetotal = agetotal + age;
        set total = total + uBirthYear;
      end loop cursor_loop;
        select (agetotal/cnt) as '평균나이', (total/cnt) '평균년생';
        close userCursor;
    end $$
    delimiter ;
    call uProc2();

## -- 프로시저와 트리거를 이용해 유기적인 테이블만들어보기  --

## customer테이블
    create table customer(
    id char(10) primary key,
    name char(10),
    addr char(10));
    insert into customer values( 'YHJ','유환주','서울');
    insert into customer values( 'JYJ','장용준','경기');
    insert into customer values( 'HSH','한수현','인천');
    insert into customer values( 'JSY','진성영','인천');
    insert into customer values( 'PYH','표영훈','경기');
    insert into customer values( 'KJH','김정환','경기');
    insert into customer values( 'LDJ','이동준','서울');
    insert into customer values( 'KBS','김반석','서울');

## product테이블
    create table product(
    pNum char(5) primary key,
    product char(20),
    pAmount int);
    insert into product values( 'p01','딸기','1000');
    insert into product values( 'p02','사과','1000');
    insert into product values( 'p03','배','1000');
    insert into product values( 'p04','포도','1000');
    insert into product values( 'p05','메론','1000');
    insert into product values( 'p06','레몬','1000');
    insert into product values( 'p07','바나나','1000');
    insert into product values( 'p08','수박','1000');

## order1테이블
    create table order1(
    oNum char(5) primary key,
    pNum char(5),
    orderID char(10),
    product char(20),
    orderAmount int,
    orderDate date,
    price int,
    total int,
    deliverDate date,
    foreign key (pNum) references product(pNum));

## order1에 insert할 때 product,customer 테이블에서 정보를 가져와 자동 입력 하는 프로시저
    drop procedure if exists insertProc;
    delimiter $$
    create procedure insertProc(
    in prOnum char(5),
    in prPnum char(5),
    in prOrderID char(10),
    in prOrderAmount int,
    in prOrderDate date)
    begin
    	insert into order1 (oNum,pNum,orderID,orderAmount,orderdate)
        values ( prOnum,prPnum,prOrderID,prOrderAmount,prOrderDate);
        update order1 as o join product as j
        set o.product = j.product, 
    		o.price = j.price,
            o.total = (o.orderAmount*j.price)
            where o.pnum=j.pnum;
            // order테이블의 pnum과 product 테이블의 pnum을 비교해서 일치하는 데이터 자동입력
        update order1 as o join customer as j
        set o.name = j.name,
    		o.deliverDate = date_add(o.orderdate, interval 5 day)
        where o.orderID = j.id;
        // order테이블의 orderid와 customer 테이블의 id를 비교해서 일치하는 데이터 자동입력
    end $$
    delimiter ;

## procedure를 이용해서 order에 insert할 때 ! customer에 자동 업데이트 해주는 트리거
        drop trigger if exists pointTrg;
        delimiter $$
        create trigger pointTrg
        after insert
        on order1
        for each row
        begin
        	update customer set point = point+ new.total*0.02 where id=new.orderid;    
        -- update customer as o join order1 as j
        --  set o.point =(j.orderAmount*j.price*0.02)+o.point where o.id = j.orderID; // 이것도 가능은함
        end $$
        delimiter ;
## procedure를 이용해서 order에 insert할 때 ! product에 남은 물량 빼주는 트리거
        drop trigger if exists productAmountTrg;
        delimiter $$
        create trigger productAmountTrg
        	after insert
            on order1
            for each row
        begin
        	update product set pAmount = pAmount-new.orderAmount where pNum=new.pNum;
        end $$
        delimiter ;

## trigger문에서 point적립이 잘 안된 이유와 해결방법
        1. 내가만들어둔 프로시저는 insert 후에 update를 하므로 트리거에서 new키워드를 받아서 사용할 수 없다.
        2. 현재로써 아는 방법은 프로시저 입력할 때 amount와 price까지 같이 입력을 해서 두가지 다 new키워드로 받으면 된다.
        3. 실제로는 가격과 갯수를 직접 수작업으로 입력하는것이 아니라 버튼 등으로 할것이기 때문에 나쁜방법은 아닌것같다.
