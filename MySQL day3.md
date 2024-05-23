MySQL 3일차

### group by : 특정 속성의 값이 같은 튜플데이터를 모아 그룹을 만들고, 그룹별 검색
    select 주문제품, sum(수량) as 총주문수량 from order1
    group by 주문제품; // 주문제품의 중복부분과 수량의 중복부분을 더해서 주문제품 p01 의 총수량 : xx 로 보여준다

### having : 그룹에 대한 조건 
    select 제조업체, count(*) as 제품갯수, max(단가) as 최고가 from product1
    group by 제조업체 having count(*) >=3 ; //
    제조업체별로 제조한 제품의 개수, 단가가 가장비싼것만 검색, 제품갯수가 3이상인것만 나열
    having => 조건

## table 복사하기
    create table newTable as select * from ogTable; // ogTable을  newTable로 복사한다.
    create table newTable as select 항목1,항목2,항목3 from ogTable; // ogTable의 항목들(스키마) 중 필요한 것들만 복사해서 newTable 생성

## 필드 삭제하기
    delete from newTable where id in (select id from 고객 where name = '홍길동'); // newTable에 있는 id 1개 삭제 ,
    삭제할 id 정보 : 고객 테이블의 홍길동 이름을 갖고있는 사람.
    delete from 고객 where name ='변사또' ; // 고객 테이블의 변사또 이름 필드 전부 삭제


## 릴레이션
< 속성(행) , 스키마 > / <투플(열), 인스턴스>
1. 속성은 단일 값을 가짐
2. 속성은 서로 다른 이름을 가짐
3. 한 속성의 값은 모두 같은 도메인 값을 가짐
4. 속성의 순서는 상관없음
5. 릴레이션 내의 중복된 투플은 허용하지 않음
6. 투플의 순서는 상관없음

## 키
<기본키 : primary key>
<외래키 : foregin key> ( 보통 다른 테이블에서는 기본키 )

