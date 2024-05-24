MySQL 5잃차
배울건 다 배운것 같다. 복습이 중요

## limit : 보고싶은 튜플의 양을 지정
    select*from customer limit 5; (처음부터 5번째까지)
    select*from customer limit 2,5; ( 2번 인덱스부터 5번째까지) (0번인덱스부터 존재)

## exists : 서브쿼리를 불러 true/false 반환
    select*from customer where exists (select * from order where addr = '%서울%');
    // order.addr 안에 서울 이 들어있는 필드가 있으면 true -> customer 테이블실행
    select*from customer where not exists (select * from order where addr = '%서울%');
    // 같은내용 부정 -> 해당 필드가 있으면 false 

## exists : 서브쿼리를 부르고, 조건을 설정하면 in과 같은 느낌으로 사용가능
    select avg(age) as 평균나이 from 고객 A
    where exists ( select * from order1 B
     where 배송지 like '%서울%'  // 배송지 : 서울 에 해당하면서
     and A.id2 = B.주문고객 ); // A,B를 서로 유기시킴
    // 서울에 사는 주문고객의 평균나이 출력
    // not exists 하면 서울에 안사는 주문고객의 평균나이 출력

## coalesce : null값이 아닌 가장 앞부분 데이터 추출
    [tab1]
    ___________________
    |  c1    c2    c3 |
    |  -------------  |
    |  1     2     3  |
    |  null  2     3  |
    |  null  null  3  |
    ___________________
    select sum(coalesce(c1,c2,c3)) from tab1 ; // 반환값 : 6

## 한번에 여러 데이터 입력하기
    insert into table 
    values ( null,'a','b','c'),
    ( null,'a','b','c'),
    ( null,'a','b','c'),
    ( null,'a','b','c');
    
