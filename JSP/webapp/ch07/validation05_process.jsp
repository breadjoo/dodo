<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Validation</title>
</head>
<body>
<h3>입력에 성공했습니다.</h3>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String passWord = request.getParameter("passwd");
	String name = request.getParameter("name");
	String phone1 = request.getParameter("phone1");
	String phone2 = request.getParameter("phone2");
	String phone3 = request.getParameter("phone3");
	String email = request.getParameter("email");
	String hobby = request.getParameter("hobby");
	String sex = request.getParameter("sex");
	String comment =request.getParameter("comment");
	
%>
	<p> 아이디 : <%=id %></p>
	<p>비밀번호 : <%=passWord%></p>
	<p>이   름 : <%=name%></p>
	<p>성   별 : <%=sex%></p>	
	<p>취   미 : <%=hobby%></p>
	<p>연 락 처 : <%=phone1%>-<%=phone2%>-<%=phone3%></p>
	<p>이 메 일 : <%=email%></p>
	<p>가입인사 : <%=comment %></p>
	
	
	

</body>
</html>