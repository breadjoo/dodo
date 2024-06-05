<%@ page contentType="text/html; charset=utf-8" %>
<%@ page errorPage="page_errorPage_error.jsp"  %>


<html>
<head>
<title>Directives tag</title>
</head>
<body>

	<%
		String str = null;
		out.println(str.toString());
	%>
<%-- errorPage 속성
JSP 페이지가 실행되는 동안 오류가 발생하면
특정 오류 페이지로 이동하는 데 사용됨
errorPage 속성 사용 예 : 이동할 오류 페이지 MyErrorPage.jsp설정
<%@ page errorPage="MyErrorPage.jsp" %>
 --%>


</body>
</html>

