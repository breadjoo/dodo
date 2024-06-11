<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
	%>
	<p> 이 름 : <%=name%>
	<%-- 
	request.setCharacterEncoding("utf-8");
	한글 입력 처리를 위해 필요
	getParameter(String name)
	파라미터 이름이 name인 값을 전달받음
	요청 파라미터 값이 없으면 null 반환
	 --%>

</body>
</html>