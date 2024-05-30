use db1;

select abs(-78), abs(78);
select round(4.875, 2);
select * from customer;

select id, name, replace(grade, 'gold', 'vip') as 등급 from customer;

select job, char_length(job)as 문자수, length(job) as 바이트수 from customer;

select substr(name,1, 1) as 성, count(*) as 인원 from customer
group by substr(name,1,1);

select adddate('2024-05-23',interval-5 day) as 5일전;
select adddate('2024-05-23',interval 5 day) as 5일후;

select * from order1;
select 주문번호, 주문일자, adddate(주문일자,interval 5 day) as 배송일자 from order1;
select *, adddate(주문일자, interval 5 day) as 배송일자 from order1;

select 주문상품, 제품번호, date_format(주문일자, '%Y/%m /%d')as 주문일자ㅣ from order1;

select str_to_date('20240523', '%Y/%m /%d') as 날자형변환;

alter table order1 add 주문일 varchar(30);

update order1
set 주문일 = 20240505;
select*from order1;

drop table order1;

select sysdate(), date_format(sysdate(),'%Y/%m/%d %a--  %h:%i:%s'); 
set @seq:=0;
select(@seq:=@seq+1) as 순번,name,job from customer
where @seq<7;

select* from customer where job ='회사원';

create view v1_customer
as select* from customer where job ='회사원';

select * from v1_customer;

create view view_gold_customer as select*from customer where grade = 'gold';
select * from view_gold_customer;
drop view view_gold_customer; 

select lpad('database','20','#'), rpad('database','20','*') ;

select left('SQL 완전정복',3), right('SQL 완전정복', 4),
substr('SQL 완전정복',2,5), substr('SQL 완전정복', 2);

select concat('SQL 완전정복', 'DataBase'), concat_ws('-', 'SQL 완전정복','DataBase');
select concat_ws('/','2024','05','23');
select substring_index('서울시 동작구 흑석로', ' ', 2);
select substring_index('서울시 동작구 흑석로', ' ', -2);

select * from customer
order by name asc limit 5;

select * from 고객 where savem between 3000 and 4000;
select * from 고객 where savem >=3000 and savem <=4000;

create table order1 (
주문번호 int primary key auto_increment,
주문고객 varchar(10),
주문제품 varchar(5),
수량 int,
배송지 varchar(20),
주문일자 varchar(25));

insert into order1
values (null,'apple','p01',5,'경기도 군포시','2024-01-01');
insert into order1
values(null,'tomato','p02',10,'서울시 마포구',20240201);
insert into order1
values(null,'melon','p03',5,'서울시 도봉구',20240217);
insert into order1
values(null,'grape','p04',2,'서울시 도봉구',20240321);
insert into order1
values(null,'banana','p05',2,'인천시 계양구',20240121);
insert into order1
values(null,'pear','p07',6,'강원도 춘천시',20240211);
insert into order1
values(null,'strawberry','p08',11,'서울시 강남구',20240217);
select * from order1;

select * from 고객
where savem > all ( select savem from 고객 where job = '간호사');

select savem from 고객
where job  ='학생';

alter table 고객 add id2 varchar(20);

update 고객 set id2 = 'apple' where id = 16;

select*from customer;

delete from 고객 where name ='변사또' ;

insert into 고객(id2, name, grade)
values('pear1','변사또','gold')
on duplicate key update name = '이몽룡';

create table ncustomer as select * from customer;
select * from ncustomer;

insert into customer(id, name) select id, name from ncustomer
where job = '회사원';

insert into ncustomer(id,name) values (20, '오라클');
select id, name from ncustomer where name = '오라클';
insert into customer select * from ncustomer where name = '오라클';

create table 수강 ( 
수강번호 int primary key auto_increment,
수강년도 char(4) not null,
수강학기 varchar(20) not null check(수강학기 IN('1학기','2학기','여름학기')),
학번 char(5) not null,
과목번호 char(5) not null,
성적 Numeric(2,1) check(성적 between 0 and 4.5),
foreign key (학번) references 학생(학번), 
foreign key (과목번호) references 과목(과목번호)
);
select*from customer;
create view 우수고객 as select id, name, age, grade from customer
where grade = 'gold' with check option;
select*from 우수고객;


select repeat('*',10);
select reverse('olleH');

select avg(savem) from 고객;
select job, count(*) as 인원수, avg(savem) as 평균적립금 from 고객
 group by job with rollup ;
 
 
