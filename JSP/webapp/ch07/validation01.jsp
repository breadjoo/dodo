<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Validation</title>
</head>
<script type="text/javascript">
function checkForm() {
	alert("아이디 : " + document.loginForm.id.value+"\n"+
		"비밀번호 : " +document.loginForm.passwd.value);
}
</script>
<body>
<form action="#" name="loginForm" method="post">
<p>
	아 이 디 : <input type="text" name="id">
</p><p>
	비밀번호 : <input type="password" name="passwd">
</p><p><input type="submit" value="전송" onclick="checkForm()"></p>
</form>

<%--
-- 유효성 검사 (validation)
- 사용자가 폼 페이지에서 입력한 데이터 값이 서버로 전송되기 전에 특정 규칙에 맞게 입력됐는지 검증
- 사용자가 실수로 유효하지 않은 데이터 값을 입력하면 부적합 판단,
다시 폼 페이지로 되돌려 사용자에게 오류가 있음을 알려줌

-- 유효성 검사의 예 
- 입력 데이터가 null인지 확인 검사
- 폼 페이지에서 나이를 입력할 때 숫자를 인식하는 검사
- 회원 가입 시 아이디 중복 검사
- 로그인 인증 시 아이디와 비밀번호 검사

-- 유효성 검사를 위한 핸들러 함수
1) 핸들러 함수
폼 페이지에서 이벤트가 발생했을 때의 유효성 검사를 위해 매핑하는 메소드
2) 자바스크립트를 이용하여 유효성 검사를 위한 코드 작성
- 자바스크립트는 웹 브라우저에서 유효성 검사를 처리함
- 따라서 서버에서 처리하는 것보다 속도가 빠르고 서버에 과부하를 주지 않음
3) 사용자가 폼 페이지에 입력한 데이터 값이 서버로 전송되기 전에 특정 규칙에 맞게 입력되었는지 검사
4) 입력된 데이터가 유효성 검사를 통과하면 서버로 전송하고, 그렇지 않으면
서버 전송을 취소한 뒤 사용자에게 오류 메시지를 보여주는 역할

<script type ="text/javascript">
function 핸들러함수() {
	var str=document.폼이름.입력항목이름.value;}
</script>
<form name = "폼이름">
<input type="submit" onclick="핸들러함수()">
</form>

--유효성 검사를 위해 핸들러 함수를 만드는 과정
1)input 태그의 type속성 값이 submit인 경우 onclick 속성을 이용하여 핸들러 함수를 설정 또는 form 태그의 onsubmit 속성 값에 설정함
2)자바스크립트를 이용하여 <script>..</script> 내에 핸들러 함수를 작성 JSP페이지 어디에 해도 상관없음
3)폼 페이지에서 입력된 데이터 값을 핸들러 함수로 가져오기 위해 form 태그의 name 속성 또는 form 객체 이용

--%>

</body>
</html>