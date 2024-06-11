<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>implicit objects</title>
</head>
<body>
	<p>이 페이지는 5초마다 새로고침 됩니다.</p>
	<%
		response.setIntHeader("Refresh", 5);
	%>
	<p><%=(new Date()) %></p>
	<%-- 응답 HTTP 헤더 관련 메소드
	서버가 웹 브라우저에 응답하는 정보에 헤더를 추가하는 기능을 제공함
	헤더 정보에는 주로 서버에 대한 정보가 저장되어 있음
	
	setIntHeader(String name, int Value) : 설정한 헤더 이름 name에 정수값 value를 설정
	 --%>
</body>
</html>