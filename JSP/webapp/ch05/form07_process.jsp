<%@page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Form processing</title>
</head>
<body>
<table border="1">
	<tr>
		<th>요청 파라미터 이름</th>
		<th>요청 파라미터 값</th>
	</tr>

<% 
	request.setCharacterEncoding("utf-8");

	Enumeration paraNames = request.getParameterNames();
	while (paraNames.hasMoreElements()){
		String name = (String) paraNames.nextElement();
		out.print("<tr><td>" + name + "</td>\n");
		String paramValue = request.getParameter(name);
		out.println("<td>"+paramValue+"</td></tr>\n");
	}
%>
</table>
<%-- 폼 데이터의 일괄 처리 메소드
1) getParameterNames()	
모든 입력 양식의 요청 파라미터 이름을 순서에 상관없이 Enumeration(열거형) 형태로 전달 받음
2) hasMoreElements()
Enumeration(열거형) 요소가 있으면 true를 반환하고, 그렇지 않으면 false
3) nextElement() : Enumeration(열거형) 요소를 반환함 --%>
	
</body>
</html>