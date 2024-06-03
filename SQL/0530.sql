use testdb;

alter table usertbl add height smallint;

update usertbl set height = 185 where height is null;

update usertbl set height = 175 where name like '김%';
alter table usertbl drop column hdight;
select*from usertbl;

drop procedure if exists userProc;
delimiter $$
create procedure userProc(in userName varchar(10))
begin
	select *from usertbl where name = userName;
end $$
delimiter ;

call userProc('성시경');
call userProc('조용필');

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
   
call userProc2(1970, 178);

drop procedure if exists userProc3;
delimiter $$
create procedure userProc3(in txtValue char(10), out outValue int)
begin
	insert into testTbl values(null, txtValue);
    select count(id) into outvalue from testTbl;
end $$
delimiter ;

create table if not exists testTbl (
id int primary key auto_increment,
txt char(10));

call userProc3('사',@myValue);
select*from testtbl;
select concat('현재 입력된 id 값 : ' , @myValue);

drop procedure if exists ifElseProc;
delimiter $$
create procedure ifElseProc(in userName varchar(10))
begin
	declare bYear int;
    select birthYear into bYear from usertbl where name = userName;
    if (bYear>=1980) then select 'MZ하네';
    else select '딸피네';
    end if;
end $$
delimiter ;
call ifelseProc('이승기');
select*from usertbl;

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
insert into usertbl value ('YHJ','유환주',1994,'서울',164);
call caseProc('성시경');
call caseProc('조용필');
call caseProc('유환주');

drop procedure if exists errorProc;
delimiter $$
create procedure errorProc()
begin
	declare continue handler for 1146 select '테이블이 없습니다' as 오류메세지;
    select * from noTable;
end $$
delimiter ;
call errorProc();

drop procedure if exists errorProc1;
delimiter $$
create procedure errorProc1()
begin
	show errors; -- 오류 메시지를 보여줌
    select '오류가 발생하여 작업을 취소합니다.' as 메시지;
    rollback; -- 오류 발생시 작업을 롤백
end ;
insert into usertbl('LSG','이승기',1987,'서울',185); -- 오류 발생을 위해 중복되는 id 입력

end $$
delimiter ;
call errorProc1();
select*from usertbl;

prepare myQuery from 'select * from usertbl where name = "이승기"';

execute myQuery;

drop table if exists guguTBL;
create table guguTBL (txt varchar(100));

drop procedure if exists whileProc;
delimiter $$
create procedure whileProc()
begin
	declare str varchar(100);
    declare i int;
    declare k int;
    set i = 2;
     
     while(i<10) do
     set str = '';
     set k =1;
     while(k<10) do
     set str = concat(str,' ',i,'x',k,'=',i*k); 
     set k= k+1;
     end while;
     set i = i+1;
     insert into guguTBL values(str);
	end while;
    end $$
    delimiter ;
    call whileProc();
    select*from gugutbl;
    
    drop procedure if exists errorproc2;
    delimiter $$
    create procedure errorProc2()
    begin
		declare i int;
        declare sum int;
        declare saveSum int;
        
        declare exit handler for 1264
	begin
		select concat('int 오버플로우 직전의 합계 :', saveSum);
        select concat('1+2+3+4+...+',i,' , i= 오버플로우', saveSum);
	end;
    set i = 1;
    set sum = 0;
    
    while(true) do
		set saveSum = sum;
        set sum = sum+i;
        set i = i+1;
	end while;
    end $$
    delimiter ;
call errorproc2();
select routine_name, routine_definition from information_schema.routines
where routine_schema = 'db1' and routine_type = 'PROCEDURE';

select parameter_mode, parameter_name, dtd_identifier
from information_schema.parameters
where specific_name='userProc3';

show create procedure db1.userProc3;
SET GLOBAL log_bin_trust_function_creators = 1;
drop function if exists getagefunc;
delimiter $$
 create function getagefunc(byear int)
 returns int
 begin
 declare age int;
 set age = year(curdate())- byear;
 return age;
 end $$
 delimiter ;
 select getagefunc(1988) into @getage1988;
 select @getage1988;
 
 select * from usertbl;
select ID, name, getAgeFunc(birthYear)+1 as 한국나이 from usertbl;
 
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
    if endOfRow then leave cursor_loop;
    end if;
    set cnt = cnt +1;
    set totalHeight = totalHeight + userHeight;
end loop cursor_loop;
select concat ('고객 키의 평균 : ' ,  (totalheight/cnt) );
close userCursor;
end $$
delimiter ;

call cursorProc();

desc usertbl;
alter table usertbl drop primary key;
alter table usertbl add primary key(id);

create table buytbl (
num int not null primary key auto_increment,
id char(8) not null,
prodName char(6) not null,
groupName char(4),
price int not null, 
amount smallint not null,
foreign key (id) references usertbl(id));

select*from buytbl;

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
call insertp('KBS','노트북','전자',1000,1);
call insertp('JYP','모니터','전자',200,1);
call insertp('KBS','청바지','의류',50,3);
call insertp('SSK','책','서적',15,5);
call insertp('LSG','모니터','전자',200,5);
call insertp('KKH','운동화',NULL,30,2);

select U.id, sum(price*amount) as 총구매가
from buytbl B right outer join usertbl U on B.id = U.id
group by U.id order by 총구매가 desc;

alter table usertbl add grade varchar(5);
alter table usertbl modify grade char(8); 

drop procedure if exists changeGradeP;
delimiter $$
create procedure changeGradeP()
begin
	declare nid varchar(5);
    declare sum bigint;
    declare nGrade char(8);
    
    declare endOfRow boolean default false;
    declare user_Cursor cursor for
		select U.id, sum(price*amount)
		from buytbl B right outer join usertbl U on B.id = U.id
		group by U.id;
	declare continue handler for not found set endOfRow = true; 
    
open user_Cursor;
cursor_loop : loop
	fetch user_Cursor into nid,sum;
    if endOfrow then leave cursor_loop;
    end if;
    set sum = sum ;
      
    case
    when (sum>=1000) then set nGrade = 'vip';
    when (sum>=500) then set nGrade = 'gold';
    when (sum>=200) then set nGrade = 'silver';
    else set nGrade = 'green';
    end case;

	update usertbl set grade = nGrade where id= nid;
    end loop c7ursor_loop;
    close user_Cursor;

end $$
delimiter ;
call changeGradeP();
select * from usertbl;