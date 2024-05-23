MySQL 4일차

## 문자형 데이터타입
### char
    고정길이 문자형 데이터 타입
    지정한 길이보다 데이터 길이가 작으면 빈칸만큼 공백이 들어감
    [예] 고객번호, 주민등록번호
### varchar
    가변길이 문자형 데이터 타입
    데이터의 길이만큼의 메모리만 차지함
    [예] 고객회사명, 주소
## 숫자형 데이터타입 
    정수형 : tinyint ~ bigint 까지
    실수형 : float소수점아래 7자리 double소수점 아래 15자리 decimal 그 외에 큰자리 
## 날짜형 데이터 타입
    date : YYYY-MM-DD
    time : HH:MI:SS
    datetime : YYYY-MM-DD HH:MI:SS
    
## 3000 ~ 4000 사이의 값만 출력하는 2가지 방법  
    select * from 고객 where savem between 3000 and 4000;
    select * from 고객 where savem >=3000 and savem <=4000;
    
## A보다 큰 값을 가진 목록
    select * from 고객
    where savem > any (select savem from 고객 where job = '의사');
    // 고객 테이블의 의사들 중 savem 이 가장 낮은사람 보다 큰 전체 고객 표시
    where savem > all (select savem from 고객 where job = '의사');
    // 고객 테이블의 의사들 중 savem 이 가장 높은사람 보다 큰 전체 고객 표시

## 평균내기
    select avg(savem) from 고객; // 고객테이블의 savem 평균값
    select job, count(*) as 인원수, avg(savem) as 평균적립금 from 고객
     group by job with rollup ; // 직업별로 그룹을 짓고, 그 그룹별 평균 적립금 출력
     // with roolup -> 전체 평균적립금, count된 직업의 인원수 전부 마지막에 나타냄

## 다른 테이블에 있는 내용 그대로 옮겨서 넣기
    insert into customer(id, name) select id, name from ncustomer where name = '홍길동';//
    //ncustomer에 name=홍길동 으로 돼있는 필드를 customer에 복사해서 넣어주는 방식.
    insert into customer select *from ncustomer where name ='홍길동'; //

##  날짜 변경하기
    select adddate('2024-05-23',interval-5 day) as 5일전;
    select adddate('2024-05-23',interval 5 day) as 5일후;
    select *,adddate(주문일자,interval 5 day) as 배송일자 from table //
    주문일자로 부터 5일 뒤 배송일자를 나타내는 필드 추가

## 입력하려는 곳에 데이터가 있다면 변경해서 넣기
    insert into 고객(id2, name, grade)
    values('pear1','변사또','gold')
    on duplicate key update name = '이몽룡'; //
    id(key)가 중복된다면 name 을 변사또->이몽룡 으로 변경해서 입력
## check option
    create view 우수고객 as select id, name, age, grade from customer
    where grade = 'gold' with check option;
    //간단하게 말해서 이렇게 해두면 gold 회원 외에는 추가 입력이 안됨.

## table 만들기 new ver
    create table 수강 ( 
    수강번호 int primary key auto_increment, // 자동키
    수강년도 char(4) not null, // 자릿수 변환 없기 때문에 char사용
    수강학기 varchar(20) not null check(수강학기 IN('1학기','2학기','여름학기')), 
    // 해당 문자열 외에는 입력 불가
    학번 char(5) not null,
    과목번호 char(5) not null,
    성적 Numeric(2,1) check(성적 between 0 and 4.5),
    //numeric(p,s) -> p는 소수점 포함 전체자릿수, s는 소수점이하 자릿수
    foreign key (학번) references 학생(학번),  // 학생 table의 학번을 외부키로 사용
    foreign key (과목번호) references 과목(과목번호) // 과목 table의 과목번호를 외부키로 사용
    );
### 문자열 모음
## abs : 절대값 반환 함수 입력
    select abs(-78), abs(78);
## round : 소수점 반올림 함수 입력
    select round(4.875, 1);
## lpad,rpad : 왼쪽 오른쪽으로부터 ' ' 항목으로 채워넣기
    select lpad('database','20','#'), rpad('database','20','*') ;
## left right substr : 해당위치부터 데이터 읽어내기
    select left('SQL 완전정복',3), right('SQL 완전정복', 4),
    substr('SQL 완전정복',2,5), substr('SQL 완전정복', 2);
## concat_ws : 2가지 이상 데이터 연결고리?
    select concat('SQL 완전정복', 'DataBase'), concat_ws('-', 'SQL 완전정복','DataBase');
    select concat_ws('/','2024','05','23');
## substring_index :  ' ' 안에 내용 반복수 부터 그 이후 데이터 생략
    select substring_index('서울시 동작구 흑석로', ' ', 2);
    select substring_index('서울시 동작구 흑석로', ' ', -2);
## date_format : 날짜표기방식 지정
    select sysdate(), date_format(sysdate(),'%Y/%m/%d %a--  %h:%i:%s'); 
## repeat : ' ' 안에 데이터 지정횟수 반복    
    select repeat('*',10);
## revers : ' ' 안에 데이터 반대로 읽기
    select reverse('olleH');
## set @seq:=0; // 시퀀스 지정 후 반복수행 (for문과 비슷)
    set @seq:=0;
    select(@seq:=@seq+1) as 순번,name,job from customer
    where @seq<7;
