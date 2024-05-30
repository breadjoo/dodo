use db1;

show index from info;
select*from info;

create table tbl1(
a int primary key auto_increment,
b int unique,
c int unique,
d int);

create table tbl2(
a int unique not null,
b int unique,
c int unique);

show index from tbl2;

create table tbl5(
a int unique not null,
b int unique,
c int unique,
d int primary key);

show index from tbl5;

create database if not exists testdb;
use testdb;
create table usertbl(
ID char(8) not null primary key,
name varchar(10) not null,
birthYear varchar(4) not null,
addr nchar(2) not null);
-- nchar(2) 지정 : 한글이든 영문이든 무조건 2글자만 저장 --

insert into usertbl
values('LSG','이승기','1987','서울');
insert into usertbl
values('KBS','김범수','1977','인천');
insert into usertbl
values('KKH','김경호','1971','경기');
insert into usertbl
values('JYP','조용필','1955','서울');
insert into usertbl
values('SSK','성시경','1977','서울');
select*from usertbl;
alter table usertbl drop primary key;
alter table usertbl add constraint pk_name primary key(name);
show index from usertbl;   

set @myVar4 = '가수 이름 ==> ' ;
select @myVar4, name from usertbl;

select if( 100<200, '참이다', '거짓이다');

select ifnull(null, 'null입니다.'), ifnull(100,'null입니다.');

select nullif(100, 100), ifnull(200,100);

select case 10
	when 1 then '일'
    when 5 then '오'
    when 10 then '십'
    else '모름'
    end as 'case 연습';
    
select bit_length('abc'), char_length('abc'), length('abc');
select elt(2,'하나','둘','셋'), field('둘','하나','둘','셋'),
find_in_set('둘','하나,둘,셋'), instr('하나둘셋','둘'), locate('둘','하나둘셋');
-- 문자열 위치or문자열 찾는 명령어 --

select insert('abcedfghi', 3,4,'@@@@'), insert('abcdefghi',3,2,'@@@@');
select left('abcdefghi',3), right('abcdefghi',3);
select lower('abcdEFGH'), upper('abcdEFGH');

drop procedure if exists ifproc;
delimiter $$
create procedure ifProc()
begin
	declare var1 int;
    set var1 = 100;
    if var1 = 100 then select '백';
    else select 'not백';
    end if;
end $$
delimiter ;
call ifProc();


drop procedure if exists ifProc2;
delimiter $$
create procedure  ifProc2()
begin
	declare score int;
    declare grade char(2);
    set score = 78;
    if score>=90 then set grade = 'A'; 
    elseif score>=80 then set grade = 'B'; 
    elseif score>=70 then set grade = 'C'; 
    else set grade = 'D'; 
    end if;
    select score '취득점수', grade '학점';
    end $$
delimiter ;
    call ifProc2();

drop procedure if exists caseProc1;
delimiter $$
create procedure caseProc1()
begin 
	declare score int;
    declare grade char(2);
    set score = 98;
    case 
    when score>=90 then set grade = 'A'; 
    when score>=80 then set grade = 'B';
    when score>=70 then set grade = 'C';
    when score>=60 then set grade = 'D';
    else set grade = 'F';
    end case;
    select score, grade;
	end $$
    delimiter ; 
    call caseproc1;
    
    create table employess (
    emp_no int not null primary key auto_increment,
    birth_date date not null,
    first_name varchar(10) not null,
    last_name varchar(5) not null,
    hire_date date not null);

select * from employess;
insert into employess 
values (null,19980101,'길동','홍', 20150201);
insert into employess 
values (null,19680204,'진경','홍', 20140302);
insert into employess 
values (null,19741106,'호동','강', 20220106);
insert into employess 
values (null,20020404,'재석','유', 20190304);

drop procedure if exists ifProc3;
delimiter $$
create procedure ifProc3()
begin
declare hireDate Date ;
declare curDate date;
declare days int;

select hire_date into hireDate
from db1.employess
where emp_no = 3;
set curDate = current_date();-- 현재 날짜
set days = datediff(curDate, hireDATE); --  날짜의 차이(day기준)
if (days/365)>= 5 then
	select concat('입사한지', days, '일이나 지났습니다.');
    else
    select concat('입사한지', days, '일 밖에 안지나씁니다.');
    end if;
    end $$
    delimiter ;
    call ifproc3();
    
drop procedure if exists whileProc;
delimiter $$
create procedure whileProc()
begin
declare i int;
declare hap int;
set i = 1;
set hap = 0;
mywhile : while (i<=100) do -- while문에 label을 지정
if (i % 7 = 0) then 
	set i = i+1;
	iterate mywhile; -- 지정한 label문으로 가서 계속 반복 진행
	end if;
set hap = hap + i;
if (hap>1000) then
	leave mywhile; -- 지정한 label문을 떠남, while문 종료
	end if;
    set i = i+1;
    end while;
    select hap,i;
end $$
delimiter ;
call whileproc();
