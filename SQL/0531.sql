use testdb;
show tables;
use db1;
show tables;
alter table employess rename employees;

select*from employees;
desc employees;
create table indexTBL (
last_name varchar(5),
hire_date date);

insert into indexTBL select last_name, hire_date
from employees limit 2;
select*from indextbl;

create index idx_indexTBL on indexTBL(last_name);
select * from customer;

select * from customer where grade = 'vip' or grade = 'gold';
use testdb;
select * from usertbl;


drop procedure if exists whereProc;
delimiter $$
create procedure whereProc(in userGrade char(10))
begin
	select*from usertbl where grade = userGrade;
end $$
delimiter ;
call whereProc('vip');

drop procedure if exists userProc11;
delimiter $$
create procedure userProc11(
in living char(5),
in userHeight int)
begin
select*from usertbl where addr = living and height > userHeight;
end $$
delimiter ;

call userProc11('서울',170);

drop procedure if exists userProc12;
delimiter $$
create procedure userProc12(
in userName char(10))
begin
select*from usertbl where name = userName;
end $$
delimiter ;

call userProc12('유환주');

create table sampletbl(
id int,
txt varchar(10));
insert into sampletbl values(3,'블랙핑크');
select*from sampletbl;

drop trigger if exists testTrg;
delimiter $$
create trigger testTrg -- 트리거 이름
	after delete -- delete 후에 작동하도록 지정
    on sampletbl -- 트리거를 부착할 테이블 이름 지정
    for each row -- 각 행마다 적용
begin
	set @msg = '가수 그룹이 삭제됨';
end $$
delimiter ;

set @msg = '';
insert into sampletbl values(4,'마마무');
select*from sampletbl;
delete from sampletbl where id =4;
select @msg;

create table order2 (
id int auto_increment primary key,
product char(10),
price int,
amount int);
alter table order2 add total int;
select*from order2;
use testdb;

create table customer2(
id int auto_increment primary key,
name varchar(5),
point int);
insert into customer2
values(null,'아이폰',null);

drop trigger if exists pointTrg;
delimiter $$
create trigger pointTrg
	after insert
    on order2
    for each row
begin
	update customer2 set point = new.price*new.amount*0.02 where id = new.id;
end $$
delimiter ;

select*from order2;
select*from customer2;


insert into order2 
values (3, '과자',500,2,null);

drop procedure if exists totalProg;
delimiter $$
create procedure totalProg(
nProduct char(10),
nPrice int,
nAmount int)
begin
	insert into order2(id,product,price,amount) 
    values (null,nProduct,nPrice,nAmount);
    update order2 set total = nPrice * nAmount where product=nproduct;
end $$
delimiter ;

call totalProg('',800,5);

insert into customer values( null, 'YHJ','유환주','서울');
insert into customer values( null, 'JYJ','장용준','경기');
insert into customer values( null, 'HSH','한수현','인천');
insert into customer values( null, 'JSY','진성영','인천');
insert into customer values( null, 'PYH','표영훈','경기');
insert into customer values( null, 'KJH','김정환','경기');
insert into customer values( null, 'LDJ','이동준','서울');
insert into customer values( null, 'KBS','김반석','서울');

insert into product values( 'p01','딸기','1000');
insert into product values( 'p02','사과','1000');
insert into product values( 'p03','배','1000');
insert into product values( 'p04','포도','1000');
insert into product values( 'p05','메론','1000');
insert into product values( 'p06','레몬','1000');
insert into product values( 'p07','바나나','1000');
insert into product values( 'p08','수박','1000');
select * from product;


use db2;
create table customer(
cNum int primary key auto_increment,
id char(10),
name char(10),
addr char(10));

create table product(
pNum char(5) primary key,
product char(20),
pAmount int);

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
alter table order1 add name char(10);
select*from order1;
drop procedure if exists insertProc;
delimiter $$
create procedure insertPorc(
in oNum char(5)
in pNum char(5),
in orderID char(10),
in product char(20),
in orderAmount int,
in orderDate date)




