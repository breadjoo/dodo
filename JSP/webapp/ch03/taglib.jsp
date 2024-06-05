<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Taglib</title>
</head>
<body>
	<c:forEach var="k" begin="1" end="10" step="1">
	<c:out value="${k}" />
	</c:forEach>
	
<%-- taglib 지시자를 선언하고, <c:out> 태그로 출력문을 작성 --%>
	
<%-- taglib 디렉티브 태그
현재 JSP페이지에 표현 언어, JSTL, 사용자 정의 태그(custom tag) 태그 라이브러리를 설정하는 태그
<%@ taglib uri ="경로" prefix="태그 식별자" %>
 --%>

</body>
</html>