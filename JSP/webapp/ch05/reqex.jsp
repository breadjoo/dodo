<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>

<title>Implicit Objects</title>
</head>
<body>

<%
	String hostValue = request.getHeader("host");
	String alValue = request.getHeader("accept-language");
	
	out.print("호스트 명 : " + hostValue+ "<br>");
	out.print("설정된 언어 : " + alValue+ "<br>");
%>

</body>
</html>