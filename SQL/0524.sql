use db1;
show tables;
create table nproduct as select*from product;
select * from nproduct;

truncate table nproduct;
drop table nproduct;

select*from 고객;
select*from 고객 where grade = 'vip';
select*from 고객 where name like '김%';
select*from 고객 where id2 like '_____';

select*from 고객;
insert into 고객(id, name, grade)
values (20,'변사또','vip')
on duplicate key update name = '성춘향';

create table N고객 as select*from 고객;
select*from n고객;
truncate table n고객;

insert into n고객 select*from 고객 where grade = 'vip';

select*from n고객 limit 2,5;

select*from order1 where 배송지 like '%서울%';
select*from 고객;
select avg(age) as 평균나이 from 고객;

select avg(age)as 평균나이 from 고객
where exists ( select * from order1 where 배송지 like '%서울%');

select * from customer where grade = 'gold';
select sum(age) as 나이 from customer where grade = 'gold';
select sum(age) as 나이 from customer where exists(
select * from customer where grade = 'gold');


create view goldView (id,name,grade)
as select id,name,grade from customer where grade = 'gold';

select*from goldView;
select *from 고객;
select *from 고객 where exists (select *from 고객 where job = '학생');

select coalesce(null, null, 10) as 값;
create table tab1(
id int primary key auto_increment,
c1 int,
c2 int,
c3 int);
insert into tab1
values (null, null,null,3);

select*from tab1;
update tab1 set c2 = 2 where id = 2;

select sum(coalesce(c1,c2,c3))  from tab1;

create table SQLD39_50_1 (
id int primary key auto_increment,
s1 int,
s2 int);

create table SQLD39_50_2 (
id int primary key auto_increment,
s1 int,
s2 int,
s3 int);

insert into SQLD39_50_2
values (null,130,550,4000);
select * from SQLD39_50_1;
select * from SQLD39_50_1 A where (A.s1, A.s2) 
in (select b.s1, b.s2 from SQLD39_50_2 B where b.s3>2000);

select * from SQLD39_50_1 A where 
 exists (select * from SQLD39_50_2 B
 where A.s1 = B.s1
 and A.s2 = B.s2
 and B.s3 > 2000);
 
 
select avg(age)as 평균나이 from 고객
where exists ( select * from order1 where 배송지 like '%서울%');

select avg(age) as 평균나이 from 고객 A
where exists ( select * from order1 B
 where 배송지 like '%서울%' 
 and A.id2 = B.주문고객 );
 
 select *from order1;
 

set @seq:=0; 
select(@seq:=@seq+1) as 순번, 주문고객, 배송지 from order1
where @seq<5;

select * from 고객;

set @seq:=0;
select(@seq:=@seq+1) as 순번, id2, name from 고객
where @seq<11;

 select 주문번호,주문고객,배송지 from order1; 