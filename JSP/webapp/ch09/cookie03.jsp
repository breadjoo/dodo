<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Cookie</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	for(int i=0;i<cookies.length;i++){
		cookies[i].setMaxAge(0);
		response.addCookie(cookies[i]);
	}
//	response.sendRedirect("cookie02.jsp"); // 둘 다 가능
%>
<jsp:include page="cookie02.jsp"></jsp:include>

<%--쿠키 삭제
1) 쿠키의 유효 기간을 결정하는 setMaxAge()메소드에 
	유효기간을 0으로 설정하여 쿠키를 삭제할 수 있음
	void setMaxAge(int age)
2) setMaxAge() 메소드 사용 예
	Cookie cookie = new Cookie("memberID","admin");
	cookie.setMaxAge(0);
	response.addCookie(cookie);

 --%>
</body>
</html>