<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>implicit objects</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("id");
	String passWord = request.getParameter("passwd");
%>
<p>아 이 디 : <% out.println(userId); %>
<p>비밀번호 : <% out.println(passWord); %>

</body>
</html>