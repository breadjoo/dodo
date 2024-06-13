<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Validation</title>
</head>
<script type="text/javascript">
function checkLogin() {
	var form = document.loginForm;
	for(i=0;i<form.id.value.length;i++){
		var ch= form.id.value.charAt(i);
	
	if ((ch<'a'||ch>'z')&&(ch>'A'||ch<'Z')&&
			(ch>'0'||ch<'9')) {
		alert("아이디는 영문 소문자로만 입력 가능합니다.");
		form.id.select();
		return false;
		}
}  if (isNaN(form.passwd.value)) {
		alert("비밀번호는 숫자로만 입력 가능합니다.");
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
</body>
</html>