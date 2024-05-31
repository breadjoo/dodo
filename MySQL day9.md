
## trigger : insert, update, delete 할 때 자동으로 동작
    주의 : 같은 테이블안에 수정,insert는 안됨, 이러한 것은 procedure를 활용

## Trigger usertbl1에 update를 할 때 마다 백업테이블에 수정날짜,수정한사람 저장해주는 트리거 
    drop trigger if exists backUserTbl_upadateTrg1;
    delimiter $$
    create trigger backUserTbl_upadateTrg1
    after update
    on usertbl1
    for each row
    begin
    	insert into backup_usertbl1 values(old.id, old.name, old.birthYear, old.addr, old.height, old.grade,
     '수정', curdate(), current_user());
    end $$
    delimiter ;

## Trigger usertbl1에 삭제를 할 때 마다 백업테이블에 삭제날짜,삭제한사람 저장해주는 트리거 
    drop trigger if exist backUserTbl_deleteTrg1;
    delimiter $$
    create trigger backUserTbl_DeleteTrg1
    after delete
    on usertbl1
    for each row
    begin
      insert into backup_usertbl1 values(old.id, old.name, old.birthYear, old.addr, old.height, old.grade, '삭제',
      curdate(), current_user());
    end $$
    delimiter ;

## 다중 트리거


## order테이블에 insert 할 때 product테이블의 물건갯수 자동 차감
    drop trigger if exists orderTrg;
    delimiter $$
    create trigger orderTrg
    	after insert
        on ordertbl
        for each row
    begin
    	update prodtbl set account = account - new.orderamount
        where prodName = new.prodName;
    end $$
    delimiter ;

## product테이블에 update할 때 delivery테이블에 물건이름,물건갯수 저장
    drop trigger if exists prodTrg;
    delimiter $$
    create trigger prodTrg
    	after update
        on prodtbl
        for each row
    begin
    	declare orderAmount int;
        set orderAmount = old.account - new.account;
        insert into delivertbl(prodName,account)
        values (new.prodname, orderAmount);
    end $$
    delimiter ;

## trigger와 procedure를 이용해서 포인트 적립해보기 (미완성형이라 다시 해봐야함)

## order테이블에 insert하면 가격,갯수 곱해서 합계 자동으로 입력하는 procedure
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

## order테이블에 insert하면 고객테이블에 총합 * 0.02 해서 포인트 적립해주는 trigger
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
    
