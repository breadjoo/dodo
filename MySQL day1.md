## MySQL 첫 수업

## 1. < 데이터베이스 만들기 >   
    create database db1; // db1 생성  
    use db1; // db1을 사용하겠다.  

## 2. < db1안에서 table 만들기 >  
    create table table1 (  
    id int pirmary key, // id를 pirmary key로 사용하겠다.!!  
    name varchar(20), // name을 varchar형식으로 20바이트 (1글자에 1바이트 정도인데 +1여유가 필요함)  
    age int,  
    tel varchar(20)  
    );  
  
## 3. < 테이블 필드 추가, 제거, 변환 명령어 >  
    insert into table1(id,name,age,tel,addr)  
    values (8,'김스벅','17','010-1234-5678','서울시 송파구');  // table1 안에 목록과 일치하게 항목 집어넣어서 데이터 추가  
    
    alter table table1 add addr varchar(30); // table1에 addr 필드, varchar(30)으로 추가  
    alter table table1 modify age varchar(5); // table1에 age필드를 varchar(5)로 변경  
    alter table table1 rename info // table1를  info로 이름 변경  
    rename table table1 to info // 위와 같은 내용 (변경)  
    drop table table1 // table1 삭제하기  
    update table1 set name = '빵빵이' where id = 1; // table1에 id1번 name을 빵빵이로 변경  



## 4. < 테이블 살펴보기 >   
    use db2 -> 다른 db 사용으로 넘어가기  
    desc city;  
    desc address;  
    desc store; // 해당 테이블 구조 살펴보기  
    show tables; // 테이블의 목록을 살펴보기  
    select*from address; // address 테이블의 데이터까지 전체보기  
    select city_id, address, address2 from address; // address테이블 내의 city_id,address,address2 3가지 내용만 보기  
  
## 5. < table 추가할 때 primary key를 자동으로 바꿔주는 방법 >  
### 5-1. table만들기  
    create table info(  
    id int not null auto_increment,  
    pw varchar(20);  
    name varchar(10);  
    age int(4);  
    addr varchar(30);  
    primary key (id)  
    );  
### 5-2. 데이터 추가하기  
    //!! 자동으로 1부터 증가하기로 한 id는 생략한다. !!  
    insert into info(pw,name,age,addr)  
    values ('383838','유환주','31','서울시');  




