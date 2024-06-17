<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Cookie</title>
</head>
<body>

<%
Cookie[] cookies = request.getCookies();

out.println("현재 설정된 쿠키의 갯수 : " +cookies.length+"<br>");
out.println("==============================<br>");
for(int i=0;i<cookies.length; i++){
	out.println("설정된 쿠키의 속성 이름 [ "+i+" ] "+cookies[i].getName()+"<br>");
	out.println("설정된 쿠키의 속성 값 [ "+i+" ] "+cookies[i].getValue()+"<br>");
	out.println("-----------------------------<Br>");
		
	}
%>



<%--쿠키 객체 얻기
1) 클라이언트에 저장된 모든 쿠키 객체를 가져오려면 request 내장 객체의 getCookies()메소드 사용
2) 쿠키 객체가 여러개 일 때는 배열 형태로 가져옴
	cookie[] requset.Cookies();
3) getCookies()메소드 사용 예
	Cookie[] cookies = request.getCookies();

<쿠키 객체의 정보 얻기>
- 쿠키 객체에 저장된 쿠키 이름과 값을 가져오기 위해 getName,getValue 메소드 사용
- String getName()
- String getValue(;

-- JSESSIONID란?
- 톰캣 컨테이너에서 세션을 유지하기 위해 발급하는 키
- HTTP 프로토콜은 statless하다 요청시마다 새로운 연결이 생성되고,
	응답 후 연결은 끊기게 되므로 상태를 유지할 수 없다.
- 따라서, 상태를 저장하기 위해 톰캣은 JSESSIONID 쿠키를 클라이언트에게 발급해주고
	이 값을 통해 세션을 유지할 수 있도록 한다.
 --%>
</body>
</html>