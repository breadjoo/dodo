<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action tag</title>
</head>
<body>
	<p>오늘의 날짜 및 시각</p>
	<p><%=(new java.util.Date()).toLocaleString() %>
	

</body>
</html> 