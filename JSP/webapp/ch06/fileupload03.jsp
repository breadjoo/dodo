<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>File Upload</title>
</head>
<body>
<form name="fileForm" method="post" enctype="multipart/form-data"
	action="fileupload03_process.jsp">
	<p>
		이 름 : <input type="text" name="name">
		제 목 : <input type="text" name="subject">
		파 일 : <input type="file" name="filename">
	</p><p><input type="submit" value="upload">
</body>
</html>