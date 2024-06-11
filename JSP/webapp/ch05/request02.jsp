<%@page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>

<title>Implicit Objects</title>
</head>
<body>

<%
	Enumeration en = request.getHeaderNames();
	while(en.hasMoreElements()) {
		String headerName = (String) en.nextElement();
		String headerValue = request.getHeader(headerName);
	
%>
<%=headerName %> : <%=headerValue %><br>
<%
	}
%>

<%-- 요청 HTTP 헤더
웹 브라우저는 HTTP 헤더에 부가적인 정보를 담아 서버로 전송함

getHeader(String name) : 설정한 name의 헤더값을 가져옴
getHeaders(String name) : 설정한 name의 헤더 목록값을 가져옴
getHeaderNames() : 모든 헤더 이름을 가져옴

	while(en.hasMoreElements()) 
	hasMoreElements()메소드를 통해 저장된 헤더 이름이 있을 때까지 반복
	en.nextElement() 메소드로 현재 헤더 이름을 가져옴
	request.getHeader(headerName)
	getHeader()메소드로 설정된 헤더 이름의 값을 가져옴


 
 --%>
 

</body>
</html>