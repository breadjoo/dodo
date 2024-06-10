<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action tag</title>
</head>
<body>
<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request"></jsp:useBean>
<p>아이디 : <%=person.getId() %>
<p>이 름 : <%=person.getName() %>

<%
	person.setId(20240610);
	person.setName("빵빵이");
%>
<jsp:include page="useBean03.jsp"></jsp:include>

<%-- 외부 파일 useBean03.jsp의 내용을 포함하여 출력하도록 include 액션 태그의 page 속성을 작성함 --%>
</body>
</html>