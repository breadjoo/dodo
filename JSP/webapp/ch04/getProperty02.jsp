<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action tag</title>
</head>
<body>

	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request" ></jsp:useBean>
	<jsp:setProperty property="id" name="person" value="11223344" />
	<jsp:setProperty property="name" name="person" value="빵빵이"/>
	<p> 아이디 : <jsp:getProperty property="id" name="person"/>
	<p> 이 름 : <jsp:getProperty property="name" name="person"/>
	
	<%--useBean 액션 태그의 id 속성 값을 통해
	Person 클래스의 id와 name에 값을 가져와 출력하도록 getProperty 액션 태그를 작성함 
	 --%>
</body>
</html>