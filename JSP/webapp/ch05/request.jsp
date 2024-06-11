<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>

<title>Implicit Objects</title>
</head>
<body>
	<form action="process.jsp" method ="post">
	<%--method : get // post 두개 중 하나가 가능,
	get : url에 표시됨
	post : 표시안됨, 보안에좋음 --%>
	<p> 이 름 : <input type= "text" name ="name">
		<input type="submit" value="전송">
	</p>
	</form>

</body>
</html>