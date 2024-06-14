<%@ page contentType="text/html; charset=utf-8" %>

<세션(session)>
- 클라이언트와 웹 서버 간의 상태를 지속적으로 유지하는 방법
- [예] 웹 쇼핑몰의 장바구니, 주문 처리와 같은 회원 전용 페이지
- 웹 서버에서만 접근이 가능하므로 보안 유지에 유리하며 데이터를 저장하는 데 한계가 없음
- 오직 웹 서버에 존재하는 객체로 웹 브라우저마다 하나씩 존재하므로 웹 서버의 서비스를 제공받는 사용자를 구분하는 단위가 됨
- 웹 브라우저를 닫기 전까지 웹 페이지를 이동하더라도 사용자의 정보가 웹 서버에 보관되어 있어 사용자 정보를 잃지 않음

<session 내장객체 메소드>
1)getAttribute(attr) : 문자열 attr로 설정된 세션 값을 java.lang.Object 형태로 반환
해당되는 속성 이름이 없을 때는 null 반환
2)getAttributeName() : 세션 속성 이름을 Enumration 객체 타입으로 반환
3)getCreatingTime() : 세션 생성 시간을 반환
January 1. 1970년 1월1일 0시0분0초 현재 세션이 생성된 시간까지 경과한 시간을 long 형 밀리세컨드 값으로 반환
4)getId(): 각 접속에 대한 세션에 할당된 고유의 ID를 문자열 형태로 반환
5)getLastAccessedTime() : 현재 세션에 클라이언트가 마지막으로 request를 보낸 시간을 반환
6)getMaxInactiveInterval() : 해당세션을 유지하기 위해 세션 유지시간을 초로 반환, 세션의 유효시간 알수있음
7)isNew() : 해당 세션의 생성 여부를 반환. 처음 생성된 세션이면 true를 반환, 이전에 생성됐으면 false
8)removeAttribute(String name) : 세션 속성 이름이 name인 속성을 제거
9)setAttribute(String name, Object value)
세션 속성 이름이 name인 속성에 value를 할당
10)setMaxInactiveInterval(int t)
세션의 유효 시간을 t에 설정된 초 값으로 설정
11)invalidate():현재 세션을 종료, 세션과 관련된 값들은 모두 지워짐 현재 세션에 저장된 모든 세션 속성을 제거


<세션 생성>
session 내장 객체의 setAttribute()메소드를 사용
- setAttribute()메소드를 이용하여 세션의 속성을 설정하면 계속 세션상태 유지
- 만약 동일한 세션의 속성 이름으로 세션을 생성하면 마지막에 설정한 것이 세션 속성값이 됨
- 사용 형식
void setAttribute(String name,Object value)
1) 첫 번째 매개변수 name : 세션으로 사용할 세션 속성 이름을 나타내며,
세션에 저장된 특정 값을 찾아오기 위한 키로 사용됨
2) 두 번째 매개변수 valuje : 세션의 속성 값
(세션 속성 값은 Object 객체 타입만 가능하기 때문에 int,double,char 등의 기본타입은 사용불가)
- setAttribute()메소드 사용 예
session.setAttribute("memberId","admin");