<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Validation</title>
</head>
<body>
<h3>입력에 성공했습니다.</h3>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String passWord = request.getParameter("passwd");
%>
	<p> 아이디 : <%=id %></p>
	<p>비밀번호 : <%=passWord%></p>

</body>
</html>