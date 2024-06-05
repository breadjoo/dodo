<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page isELIgnored="true"%>

<html>
<head>
<title>Directives tag</title>
</head>
<body>

<%
	request.setAttribute("RequestAttribute", "request 내장 객체");
%>
${requestScope.RequestAttribute}

<%-- isELIgnored 속성
현재 JSP페이지의 표현 언어 사용 여부를 설정하는 데 사용됨
기본값 : false
true로 설정 시 정적 테스트로 처리함
isELIgnored 속성 사용 예 : 표현 언어를 처리하지 않기 위한 true 설정
//EL : ExpressionLanguage 
<%@ page ieELIgonred="true" %>
 --%>
 
 <%-- isScriptingEnabled 속성
 스크립트 태그(선언문, 스크립틀릿, 표현문) 사용 여부를 설정하는데 사용됨
 isScriptingEnabled 속성 사용 예제: 스크립트 태그를 사용하지 않기 위한 false설정
 <%@ page isScriptingEnabled = "false" %>
  --%>
</body>
</html>
