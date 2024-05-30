use db1;
show tables;
select*from customer;

insert into customer( id, name, age, job)
values ( null, '퍼블리싱', 34, '자영업자');

select @@autocommit;
set autocommit = 0;
show variables like 'autocommit%';
commit;
rollback;

delete from customer where id = 24;

update customer set grade = 'vip' where id = 23 ;

update customer set addr = '서울시 구로구' where addr is null;

create table norder2 select*from order1;
select*from norder2;
insert into norder2 (주문번호,주문고객,주문제품,수량,배송지,주문일자)
values (13,'tomato','p00',5,'경기도 군포시',20240223)
on duplicate key update 주문번호 = 14, 주문고객 = 'tomato1';

create table norder2 like order1;
insert into norder2 select*from order1;

desc usertbl;
alter table usertbl drop primary key;
alter table usertbl add primary key(id);

select*from norder2;
