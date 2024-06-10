<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action tag</title>
</head>
<body>
	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request"></jsp:useBean>
	<jsp:setProperty property="id" name="person" value="20230824" />
	<jsp:setProperty property="name" name="person" value="홍길동"/>
	<p> 아이디 : <% out.println(person.getId()); %>
	<p> 이 름 : <% out.println(person.getName()); %>
<%
	person.setId(20240610);
	person.setName("빵빵이");
%>
<p>아이디 : <%=person.getId() %>
<p>이 름 : <%=person.getName() %>
	
	<%-- useBean 액션 태그의 id 속성 값을 통해
	Person 클래스의 id와 name에 값을 저장하도록 setProperty 액션 태그를 작성함 --%>
	<%-- setProperty 액션 태그
	1)useBean 액션 태그와 함께 자바빈즈의 setter() 메소드에 접근하여 자바빈즈의 멤버 변수인
	프로퍼티의 값을 저장하는 태그
	2)폼 페이지로부터 전달되는 요청 파라미터의 값을 직접 저장하거나
	자바빈즈의 프로퍼티로 변경하여 사용할 수 있음	
	<jsp:setProperty property="id" name="person" value="20230824" />
	<jsp:setProperty property="name" name="person" value="홍길동"/>
	 --%>
</body>
</html>