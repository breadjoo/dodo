8일차 procedure 학습

## Procedure 기본형식
    drop procedure if exists userProc;
    delimiter $$
    create procedure userProc(in userName varchar(10))
    begin
      select *from usertbl where name = userName;
    end $$
    delimiter ;
    call userProc('성시경'); // usertbl에서 name 성시경 찾아서 출력

## Procedure 기본형식 2 조건 검색
    drop procedure if exists userProc2;
    delimiter $$
    create procedure userProc2(
      in userBirth int,
      in userHeight int)
    begin
      select*from usertbl where birthYear > userBirth
      and height > userHeight ;
    end $$
    delimiter ;
    call userProc2(1970, 178); // usertbl에서 1970년생, 키178 이상 찾아서 출력

## Procedure birthYear 별로 띠 만들어주기
    drop procedure if exists caseProc;
    delimiter $$
    create procedure caseProc(in userName varchar(10))
    begin
      declare bYear int;
      declare tti varchar(3);
      declare result int;


    select birthYear into bYear from usertbl where name = userName;
    set result = bYear%12 ;
      case (result)
  		when 0 then set tti = '신';
  		when 1 then set tti = '유';
  		when 2 then set tti = '술';
  		when 3 then set tti = '해';
  		when 4 then set tti = '자';
  		when 5 then set tti = '축';
  		when 6 then set tti = '인';
  		when 7 then set tti = '묘';
  		when 8 then set tti = '진';
  		when 9 then set tti = '사';
  		when 10 then set tti = '오';
  		else set tti = '미';
      end case;
     select userName, tti as '띠' ;
     -- select concat (userName,'의 띠 :', tti);
    end $$
    delimiter ;
    select*from usertbl;

## Procedure 에서 insert into 명령어 만들기
    
    create table if not exists testTbl (
    id int primary key auto_increment,
    txt char(10)); //기본준비 -무시해도됨-
    
    drop procedure if exists userProc3;
    delimiter $$
    create procedure userProc3(in txtValue char(10), out outValue int)
    begin
      insert into testTbl values(null, txtValue);
      select count(id) into outvalue from testTbl;
    end $$
    delimiter ;
    call userProc3('사',@myValue);
    select*from testtbl;
    select concat('현재 입력된 id 값 : ' , @myValue);

## Procedure 에서 insert into 명령어 만들기 (실전편)
    drop procedure if exists insertP;
    delimiter $$
    create procedure insertP(
      in id char(8),
      in prodName char(6) ,
      in groupName char(4),
      in price int , 
      in amount smallint)
    insert into buytbl values
    (null,id,prodName,groupName,price,amount);
    end $$
    delimiter ;  
    select*from buytbl;
    call insertp('KBS','운동화',null,30,2);

## Procedure 에서 cursor 사용하기 **어려움**
     drop procedure if exists cursorProc;
     delimiter $$
     create procedure cursorProc()
     begin 
      declare userHeight int;
      declare cnt int default 0;
      declare totalHeight int default 0;
      
      declare endOfRow boolean default false; -- 행의 끝 여부 (기본값:false)
      declare userCursor cursor for -- 커서 선언
      select height from usertbl;
    declare continue handler -- 행의 끝이면 endOfRow 변수에 true 대입
    	for not found set endOfRow = true;
     
     open userCursor; -- 커서 열기
     cursor_loop: loop
       fetch userCursor into userHeight; -- 고객 height 1개를 대입
         if endOfRow then leave cursor_loop; end if;
         set cnt = cnt +1;
         set totalHeight = totalHeight + userHeight;
        end loop cursor_loop;
    select concat ('고객 키의 평균 : ' ,  (totalheight/cnt) );
    close userCursor;
    end $$ 
    delimiter ;
    
    call cursorProc();
