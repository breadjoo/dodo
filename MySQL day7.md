

## 인덱스 보기
    show index from table; // index 확인하기(key)
    create table tb1(
    a int primary key, // 클러스터 인덱스
    b unique,          // 보조 인덱스
    c unique,
    d int);

    create table tb2(
    a int unique not null, // 클러스터형 인덱스로 지정되어 자동 정렬
    b int unique,
    c int unique);

## if exists
    create table if not exists testdb; // 해당 db가 없으면 생성한다고 한다.
    그냥 만들어도 db있으면 생성이 안되는데 무슨 의미가 있는거지?

## 갑자기 다시 문자열


  ## if : 1번 비교 후 참이면 2, 거짓이면 3 반환
    select if( 100<200, '참이다', '거짓이다');
  ## ifnull : 1번 null 참이면 null / 거짓이면 2번 반환
    select ifnull(null, 'null입니다.'), ifnull(100,'null입니다.');
  ## nullif : 비교자 둘의 값이 같으면 null 반환 // 
    select nullif(100, 100), ifnull(200,100);
  ## case : switch문과 비슷
    select case 10
      when 1 then '일'
      when 5 then '오'
      when 10 then '십'
      else '모름'
      end as 'case 연습';
## 문자열 길이 확인
    select bit_length('abc'), char_length('abc'), length('abc');
## 문자열 위치or문자열 찾는 명령어
    select elt(2,'하나','둘','셋'), field('둘','하나','둘','셋'),
    find_in_set('둘','하나,둘,셋'), instr('하나둘셋','둘'), locate('둘','하나둘셋');
    ---------------------------------------------
    | elt  |field  |find_in_set  |instr  |locate|
    | 둘   |2      |2            |3      |3     |
    ---------------------------------------------
## 자리채우기, ~자리 읽기, 대소문자 치환
    select insert('abcedfghi', 3,4,'@@@@'), insert('abcdefghi',3,2,'@@@@');
    select left('abcdefghi',3), right('abcdefghi',3);
    select lower('abcdEFGH'), upper('abcdEFGH');

## delimiter , if 명령문 만들기
    drop procedure if exists ifproc; // ifproc 존재확인 후 삭제.(초기화)
    delimiter $$ // 세미콜론이 많이 사용되기 때문에 다음까지는 $$로 문장의 끝을 알림
    create procedure ifProc()
    begin
    	declare var1 int;
        set var1 = 100;
        if var1 = 100 then select '백';
        else select 'not백';
        end if;
    end $$ // 문장의 끝을 알림
    delimiter ; // 다시 세미콜론으로 사용하겠다.
    call ifProc(); // 명령문 실행

## delimiter , if 명령문 만들기 2
    drop procedure if exists ifProc3; //초기화
    delimiter $$ // $$ 사용 초기화
    create procedure ifProc3() // ifProc3()생성
    begin
    declare hireDate Date ; // 필드 선언
    declare curDate date;
    declare days int;
    
    select hire_date into hireDate
    from db1.employess
    where emp_no = 3; // 테이블에서 값 찾아서 변수에 넣기(into)
    set curDate = current_date(); // 시스템 현재 날짜
    set days = datediff(curDate, hireDATE); // 날짜의 차이(day기준)
    if (days/365)>= 5 then // 5년이상이면
      select concat('입사한지', days, '일이나 지났습니다.');
      else
      select concat('입사한지', days, '일 밖에 안지나씁니다.');
    end if; // if문 종료
    end $$ 
    delimiter ;
    call ifproc3();
    
