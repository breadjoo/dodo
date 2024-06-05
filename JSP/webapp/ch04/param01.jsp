<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action tag</title>
</head>
<body>
	<h3>param 액션 태그</h3>
	<jsp:forward page="param01_data.jsp">
		<jsp:param value="admin" name="id"/>
		<jsp:param value='<%=java.net.URLEncoder.encode("관리자") %>'
		 name="name"/>
	</jsp:forward>
	<p>Java Server Page	
	
<%-- param 액션 태그
1) 현재 JSP 페이지에서 다른 페에지에 정보를 전달하는 태그
2) 단독으로 사용하지 못하며 <jsp:forward> 또는 <jsp:include> 태그의 내부에 사용함
3) 다른 페이지에 여러 개의 정보를 전송해야 할 때는 다중의 param 액션 태그 사용

<jsp:forward page="파일명">
	<jsp:param value="매개변수값1" name="매개변수명1" />
	<jsp:param value="매개변수값2" name="매개변수명2" />
 --%>

</body>
</html>