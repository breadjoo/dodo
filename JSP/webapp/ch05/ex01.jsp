<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action tag</title>
</head>
<body>
<%--
자동으로 내장 객체를 멤버 변수, 메소드 매개변수 등의 각종 참조 변수(객체)로 포함
3) JSP 페이지에 별도의 import 문 없이 자유롭게 사용 가능
4) 스크립틀릿 태그나 표현문 태그에 선언을 하거나 객체를 생성하지 않고도 직접 호출하여 사용 가능함

request 내장객체
1)JSP 페이지에서 가장 많이 사용되는 기본 내장 객ㄷ체
2) 웹 브라우저에서 서버의 JSP 페이지로 전달하는 정보ㅓ 저장
폼 페이지로부터 입력된 데이터를 전달하는 요청 파라미터 값을 JSP페이지로 가져올
3) JSP 컨테이너는 웹 브라우저에서 서버로 전달되는 정보를 처리하기 위해
javax.sevlet.http.HttpSewrvletRequest 객체 타입의 request 내장 객체를 사용하여 사용자의 요구 사항을 얻어냄

요청 파라미터
사용자가 폼 페이지에 데이터를 입력한 후 서버에 전송할 때 전달되는 폼 페이지의 입력된 정보 형태
<name=value> 형식으로 웹 브라우저에서 서버의 JSP페이지로 전송된 
--%>

</body>
</html>