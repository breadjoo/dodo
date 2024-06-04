use testdb;
drop database if exists triggerdb;
create database if not exists triggerdb;
use triggerdb;

create table ordertbl(
orderNo int auto_increment primary key,
userID varchar(5),
prodName varchar(5),
orderAmount int);

create table prodtbl (
prodName varchar(5),
account int);

create table deliverTbl(
deliverNo int auto_increment primary key,
prodName varchar(5),
account int);

insert into prodtbl values('딸기',100);
insert into prodtbl values('복숭아',100);
insert into prodtbl values('사과',100);
insert into prodtbl values('배',100);
insert into prodtbl values('수박',100);
select * from prodtbl;

drop trigger if exists orderTrg;
delimiter $$
create trigger orderTrg
after insert
on ordertbl
for each row
begin
	update prodtbl set account = account - new.orderAmount where prodName = new.prodName;
    -- update prodtbl set account = account - amount where prodName = new.prodName;
end $$
delimiter ;

drop trigger if exists prodTrg;
delimiter $$
create trigger prodTrg
after update
on prodtbl
for each row
begin
	declare orderAmount int;
    set orderAmount = old.account - new.account;
	-- insert into delivertbl values (null,new.prodName,new.account);
    insert into delivertbl (prodName,account) values (new.prodname,orderAmount);
end $$
delimiter ;

insert into ordertbl values (null, 'john','딸기',10);

select*from ordertbl;
select*from prodtbl;
select*from delivertbl;

drop procedure if exists uproc2;
delimiter $$
create procedure uproc2(
in userAddr char(2),
in userHeight int)
begin
end $$
delimiter ;


