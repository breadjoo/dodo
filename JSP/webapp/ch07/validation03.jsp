<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Validation</title>
</head>
<script type="text/javascript">
function checkLogin() {
	var form = document.loginForm;
	if (form.id.value.length<4 ||
			form.id.value.length>12 ) {
		alert("아이디는 4~12자 이내로 입력가능합니다.");
		form.id.select();
		return false;
	} else if (form.passwd.value.length<4) {
		alert("비밀번호는 4자 이상으로 입력가능합니다.");
		form.passwd.select();
		return false;
	} form.submit();
}
</script>
<body>
<form action="validation02_process.jsp" name="loginForm" method="post">
<p>
	아 이 디 : <input type="text" name="id">
</p><p>
	비밀번호 : <input type="password" name="passwd">
</p><p><input type="button" value="전송" onclick="checkLogin()"></p>
</form>

<%-- 데이터 길이 확인하기
회원 가입 페이지에서 아이디, 비밀번호 등과 같은 입력 데이터의 제한 길이를 검사하는것
document.폼이름.입력양식이름.value.length
 --%>
</body>
</html>