use db1;

create table 고객 (
id int primary key auto_increment,
name varchar(20),
age int,
grade varchar(10),
job varchar(10),
savem int);
desc 고객;
insert into 고객
values (null, '정소화',20,'gold','학생',1000);
insert into 고객
values (null, '고명석',28,'gold','교사',4500);
insert into 고객
values (null, '김선우',25,'VIP','간호사',2500);
insert into 고객
values (null, '김용욱',22,'silver','학생',0);
insert into 고객
values (null, '성원용',35,'gold','회사원',5000);
insert into 고객
values (null, '오형준',null,'silver','의사',5000);
insert into 고객
values (null, '채광주',31,'silver','회사원',500);
insert into 고객
values (null, '홍길동',null,'VIP','교사',2000);
insert into 고객
values (null, '홍승언',30,'VIP','의사',4000);
insert into 고객
values (null, '김쿠키',37,'silver','교사',2200);
insert into 고객
values (null, '이자바',18,'silver','학생',4600);
show tables;

select 제품번호, sum(수량) as 총주문수량 from order1
group by 제품번호 ;

select 제조업체, count(*) as 제품갯수,max(단가)as 최고가 from product
group by 제조업체;

select 제조업체, count(*) as 제품갯수,max(단가)as 최고가 from product
group by 제조업체 having count(*) >=3 ;

select 제품번호, 주문상품, sum(수량) 총주문수량 from order1
group by 제품번호,주문상품;
select* from 고객;
select product.* from 고객, product, order1
where 고객.name = '정소화43' and 고객.id = order1.주문번호 and product.제품번호=order1.주문번호;

select order1.제품번호, order1.주문일자 from 고객 inner join order1 on 고객.id = order1.주문번호
where 고객.age>=30;

select * from 고객 inner join order1 on 고객.id = order1.주문번호
where 고객.age>=30;

select * from 고객
left outer join order1 on 고객.id = order1.주문상품;

select 제품명,단가 from product
where 제조업체 = ( select 제조업체 from product where 제품명 = '달콤비스킷');

select 제품명, 단가 from product where 제조업체 = '롯데제과';

select name,savem from 고객 
where savem = (select max(savem) from 고객);

select 제품명, 제조업체 from product
where 제품번호 in (1,4,6);

select 제품명, 제조업체 from product
where 제품번호 not in (select 주문제품 from order1 where 주문번호 = '5');

select 제품명, 단가, 제조업체 from product
where 단가 > all (select 단가 from product where 제조업체 = '대한식품');

select 단가 from product where 제조업체 = '대한식품';

update product
set 단가 = 4000
where 제품번호  = 2;

select*from product;
use db1;
update product
set 단가 = 단가 * 1.1;
select*from product;

update 고객
set savem = savem * 1.1;

update order1
set 수량 = 5
where 주문번호 in (select id from 고객 where name = '정소화' );

select *from order1;
select * from 고객;
select *from norder1;

create table norder1 as select * from order1;

delete from norder1 where 주문일자 = '2024-03-21';
select * from norder1;

delete from norder1 where 주문번호 in (
select id from 고객 where savem < 2000);

create table newProduct as select 제품번호,제품명,재고량 from product;
select*from newProduct;

create table new고객 as select*from 고객;

select job, count(*) as '직업,등급별 인원 수' from 고객
group by job
union
select grade, count(*) from 고객
group by grade;

select job, sum(savem) as '직업,등급 별 savem ' from 고객
group by job
union
select grade, sum(savem) from 고객 
group by grade;

