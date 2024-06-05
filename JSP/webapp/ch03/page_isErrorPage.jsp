<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page errorPage="page_isErrorPage_error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Directives tag</title>
</head>
<body>
	<%
		String str = null;
		out.println(str.toString());
	%>

<%-- isErrorPage 속성
현재 JSP 페이지가 오류 페이지인지 여부를 설정하는 데 사용됨 
기본값 : false
예외 처리를 위한 내장 객체인 exception 변수를 사용할 수 없음
true로 설정 시 현재 JSP 페이지는 오류 페이지가 됨
isErrorPage 속성 사용 예 : 현재 JSP페이지가 오류페이지가 되도록 true 설정
<%@ page isErrorPage="true" %>
--%>
</body>
</html>