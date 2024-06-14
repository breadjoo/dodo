<%@page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Session</title>
</head>
<body>
<%
	String name;
	String value;
	
	Enumeration en = session.getAttributeNames();
	int i =0;
	while(en.hasMoreElements()) {
		i++;
		name = en.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("설정된 세션의 속성 이름 [ "+i+" ] " + name +"<br>");
		out.println("설정된 세션의 속성 값 [ "+i+" ] " + value +"<br>");
	}

%>

<%-- 다중 세션 정보 얻기
1) 세션에 저장된 여러 개의 세션 속성 이름에 대한 속성값을 얻어오려면
getAttributeName() 메소드를 사용
2) getAttributeNames() 메소드는 반환 유형이 Enumeration 객체 타입이라
	모든 세션 정보를 얻어오는 데 유용함
	- Enumeration 객체를 사용하려면 java.util.Enumeration을 설정해야 함
 --%>

</body>
</html>