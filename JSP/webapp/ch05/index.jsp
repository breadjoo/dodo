<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Form processing</title>
</head>
<body>
<h3>취미 선택</h3>
<form action="process2.jsp" method="post">
<p>
	독서<input type="checkbox" name="reading">
	운동<input type="checkbox" name="exercise">
	영화<input type="checkbox" name="movie">
</p><p>
	<input type="submit" value="전송"> </p>
</form>

</body>
</html>