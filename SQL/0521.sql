create database db1;
use db1;

create table table1 (
id int primary key,
name varchar(20),
age int,
tel varchar(20)
);
desc table1;

Alter table table1 Add addr varchar(30);
describe table1;

use sakila;
desc actor;
desc city;
desc address;
desc store;

alter table table1 modify age varchar(5);
alter table table1 modify tel varchar(20);
alter table table1 add no int;
create table table2(
no int primary key,
tel varchar(10),
addr varchar(20)
);
show tables;

alter table table1 drop addr;
desc table1;
alter table table1 drop no;
insert into table1(id,name,age,tel,addr)
values (8,'김스벅','17','010-1234-5678','서울시 송파구');

select*from address;

alter table info change name NAME varchar(20);

select city_id, address,address2 from address;

rename table newtable to info;
show tables;

alter table info rename ntable1;
rename table ntable1 to info;
create database db2;
use db2;
show tables;
drop table table1;

use db1;
create table nTable(
id int(10) not null auto_increment,
pw varchar(20),
name varchar(7),
age int,
addr varchar(30),
primary key(id)
);

insert into nTable(pw,name,age,addr)
values ('1234','빵빵이',53,"서울");

update ntable set name = '옥지얌' where id= 3;
select*from ntable;

create table customer (
id int(10) not null auto_increment,
name varchar(10),
age int(4),
grade varchar(10),
job varchar(5),
tel varchar(17),
addr varchar(30),
primary key(id));
select*from customer;

insert into customer(name,grade,job,addr)
values ('소지섭','silver','회사원','서울시 용산구');

select*from customer
where age>30 order by age ASC;

select*from customer
where job in ('연예인','회사원','개발자');

select*from customer
where name like '%길%';

select name, age, grade from customer
order by age DESC;

create table product (
제품번호 int not null auto_increment primary key,
제품명 varchar(20),
재고량 int,
단가 int,
제조업체 varchar(20));
desc product;

insert into product
values (null,'쌀국수',4450,2600,'민국푸드');
select*from product;
insert into product
values (null,'맛콜릿',1550,1500,'한빛제과');
insert into product
values (null,'얼큰라면',3200,1200,'대한식품');
insert into product
values (null,'통통우동',1000,1550,'민국푸드');

show tables;
select 제품명,단가 as 가격 from product;
select 제품명 as 제품명명 ,단가+500 as 조정단가 from product ;

select 제품명,재고량,단가 from product
where 제조업체 in ('롯데제과');

select * from product
where 2500>=재고량 order by 단가 DESC; 

create table order1(
주문번호 int primary key auto_increment,
주문고객 varchar(20),
주문제품 varchar(5),
수량 int,
배송지 varchar(30),
주문일자 date);
desc order1;
insert into order1
values(null,'apple','p03',10,'서울시 마포구',20240201);
insert into order1
values(null,'melon','p01',5,'서울시 도봉구',20240217);
insert into order1
values(null,'grape','p07',2,'서울시 도봉구',20240321);
insert into order1
values(null,'banana','p06',2,'인천시 계양구',20240121);
insert into order1
values(null,'pear','p12',6,'강원도 춘천시',20240211);
insert into order1
values(null,'strawberry','p11',11,'서울시 강남구',20240217);
select *from order1;
alter table order1 change 주문제품 제품번호 varchar(5);

select * from order1
where 주문상품 in ('apple');
select * from order1
where 주문상품 = 'banana' and 수량 >=2 ;
select * from order1
where 주문상품 = 'strawberry' or 수량>=8 ;
show tables;

select*from product
where 단가>=1100 and 단가<=2000 order by 재고량 asc;

select*from order1
where 수량>=7 order by 제품번호 asc, 수량 desc;

update order1 set 수량 = 12 where 주문번호 = 17;

select*from product
where 제조업체 = '한빛제과';

select sum(재고량) as 재고량합계 from product 
where 제조업체 = '한빛제과';

select*from customer;
select count(id) as 고객수 from customer;

select count(id) as 회사원수 from customer
where job = "회사원";

select*from product;
select count(distinct 제조업체) as 제조업체수 from product;

select count(제품번호) as 악성재고수 from product
where 재고량 >3000 ; 

select *from product
where 제조업체 = '대한식품'
union
select *from product
where 제조업체 = '한빛제과';

select*from product
where 제조업체 = '대한식품'
union
select*from product
where 제조업체 = '한빛제과'
union
select*from product
where 제조업체 = '롯데제과'
order by 단가 asc;



