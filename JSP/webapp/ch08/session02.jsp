<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Session</title>
</head>
<body>
<%
	String user_id = (String) session.getAttribute("userID");
	String user_pw = (String) session.getAttribute("userPW");

	out.println("설정된 세션의 속성 값 [1] : " + user_id+"<br>");
	out.println("설정된 세션의 속성 값 [2] : " + user_pw);
	
%>

<%-- 단일 세션 정보 얻기
1) 세션에 저장된 하나의 세션 속성 이름에 대한 속성 값을 얻어오려면
	getAttribute()메소드를 사용함
2) getAttribute() 메소드는 반환 유형이 Object형이므로 반드시 형 변환을 상춍해야 함
3) 형식
Object getAttribute(String name)
- 첫 번째 매개변수 name : 세션에 저장된 세션 속성 이름
 해당 속성 이름이 없는 경우 null을 반환함

 --%>


</body>
</html>