<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("id");
		String passWord = request.getParameter("passwd");
	%>
	<p>아이디 : <%=userId%></p>
	<p>비밀번호 : <%=passWord%></p>
</body>
</html>