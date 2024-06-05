<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Directives Tag</title>
</head>
<body>

	<%@ include file="include02_header.jsp" %>
	<h4>--------- 현재 페이지 영역 -----------</h4>
		<%@ include file="include02_footer.jsp" %>
	
	
		<%-- include 디렉티브 태그
	현재 JSP 페이지의 특정 영역에 외부 파일의 내용을 포함하는 태그
	현재 JSP 페이지에 포함할 수 있는 외부 파일
	HTML, JSP, 텍스트 파일
	include 디렉티브 태그는 JSP 페이지 어디에서든 선언할 수 있음
	<%@ include file= "파일명" %>
	file 속성 값 : 현재 JSP 페이지에 포함할 내용을 가진 외부 파일명
	 --%>

</body>
</html>