6일차

## commit

    select @@autocommit; // auotocommit 상태 확인하기
    show variables like 'autocommit%'; // autocommit 상태 확인하기 2
    set autocommit = 1 ; //autocommit 활성화
    set autocommit = 0; // autocommit 비활성화
    commit ; // commit 하기
    rollback ; // rollback 하기 
    commit또는rollback 하기 전까지는 다른 작업환경에서 작업 대기, 커밋 후 작업실행

## like : 테이블 복사
    create table newTable as select*from table ; // primary key값 등등이 복사가 안된다. (쓰지마라)
    cretea table newTable like table ; // 형태를 그대로 복사 ( key 등등 다 복사됨 )
    insert into newTable select*from table ; // 필드내용 그대로 복사해서 넣기

## primary key 삭제 및 추가
    alter table user drop primary key ; // key 삭제
    alter table user add primary key(id) ; // id 필드에 key 지정
