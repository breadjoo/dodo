
MySQL 2일차
# select를 이용한 다양한 검색방법

### [select 찾을 항목1,2,3 from 테이블명] 이 기본.

### order by OOO asc,desc // 오름차순, 내림차순 정렬
    select name, age, grade from customer // customer 테이블에서 name, age, grade 를 검색,
    order by age DESC; // 나이에서 내림차순 정렬
    order by age ASC; // 나이에서 오름차순 정렬
    select*from customer // cumstomer 테이블에서 전체 검색,
    
### where ooo >= 조건 
    where age>30 order by age ASC ; // 나이 30이상, 오름차순 정렬 
### where ooo in ('객체1,객체2,객체3') // 객체1,2,3 이 포함된 검색
    where job in ('회사원','연예인','의사') //  회사원,연예인,의사만 찾아서 정렬
### where ooo like '%O' // O이 포함된 검색 ( 앞 뒤 중간 모두 가능)
    where name like '%순'; // 이름에서 ~~순 찾아서 정렬
    '%순%','순%' // 중간에 '순' 들어간것, 처음에 '순' 들어간것
### where ooo is null // null 값 출력 or 제외 출력
    where grade is null // 등급 항목에서 null값 출력
    in not null // null 이 아닌값 출력
### select ooo as 바뀐이름 from 테이블명 // 해당 이름 바꿔서 출력
    select 제품명, 단가 as 가격 from product; //  product 테이블에서 단가 항목을 가격으로 변경하여 출력
    select 제품명,단가+500 as 조정단가 from product ; //
    product 테이블에서 단가 항목 전체 +500 하고 조정단가로 항목 변경하여 출력

### select count(ooo) as 바뀐이름 from 테이블명 // 객체 갯수 세기 
    select count(id) as 전체고객수 from customer; // customer 테이블의 전체 고객수
    select count(id) as 회사원수 from customer
    where job = '회사원' ; // job이 회사원인 사람의 수
### select distinct ooo from 테이블명 
    select distinct 주문상품 from order1; // 결과 테이블의 중복을 허용하지 않음
    select count(distinct 제조업체) as 제조업체수(중복x) from product; // 제조업체수 중복제외

### union 합집합
    select*from product where 제조업체 = '대한식품'
    union
    select*from product where 제조업체 = '한빛제과'; // 합집합 구하기, union all 하면 중복이어도 2번 출력함

    
