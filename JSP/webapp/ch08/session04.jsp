<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Session</title>
</head>
<body>
<h4>--------- 세션을 삭제하기 전 ----------</h4>
<%
	String user_id = (String) session.getAttribute("userID");
	String user_pw = (String) session.getAttribute("userPW");

	out.println("설정된 세션의 속성 값 [1] : " + user_id+"<br>");
	out.println("설정된 세션의 속성 값 [2] : " + user_pw+"<br>");
	
	session.removeAttribute("userID");
%>
<h4>--------- 세션을 삭제한 후 ----------</h4>
<%
	user_id = (String) session.getAttribute("userID");
	user_pw = (String) session.getAttribute("userPW");
	
	out.println("설정된 세션의 속성 값 [1] : " + user_id+"<br>");
	out.println("설정된 세션의 속성 값 [2] : " + user_pw+"<br>");

%>
<%-- 단일 세션 삭제하기
1) 세션에 저장된 하나의 세션 속성 이름을 삭제하려면
removeAttribute() 메소드를 사용
2) 형식 
void removeAttribute(String name)
- 매개변수 name : 세션에 저장된 세션 속성 이름
 --%>
</body>
</html>