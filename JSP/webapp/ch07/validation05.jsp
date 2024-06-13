<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Validation</title>
</head>

<body>

<script type="text/javascript">
function checkMember() {
	var regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
	var regExpName = /^[가-힣]*$/;
	var regExpPasswd = /^[0-9]*$/;
	var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;
	var regExpEmail = 
		/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
		
	//var form = document.forms['member'];
	var form = document.member;
	var id = form.id.value;
	var name = form.name.value;
	var passwd = form.passwd.value;
	var phone = form.phone1.value+"-" + form.phone2.value+ "-" + form.phone3.value;
	var email = form.email.value;
	
	if((!regExpId.test(id))||(regExpId.test(null))){
		alert("아이디는 문자로 시작해주세요.");
		form.id.select();
		return;
	 }if (!regExpName.test(name)) {
		alert("이름은 한글만 입력 가능합니다.");
		return;
	} if(!regExpPasswd.test(passwd)){
		alert("비밀번호는 숫자로 구성할수있습니다.");`
		return;
	} if(!regExpPhone.test(phone)){
		alert("xxx-xxxx-xxxx 형태로 입력해주세요");
		return;
	} if(!regExpEmail.test(email)){
		alert("abcd@abc.com 형태로 입력해주세요");
		return;
	} form.submit();
}
</script>
<h3>회원가입</h3>
<form action="validation05_process.jsp" name="member" method="post">
	<p>아 이 디 : <input type="text" name="id">
	<input type="button" value="아이디 중복 검사"></p>
	<p>비밀번호 : <input type="password" name="passwd"></p>
	<p>이    름 : <input type="text" name="name"></p>
	<p>연 락 처 : <select name="phone1">
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="016">016</option>
				<option value="017">017</option>
				<option value="019">019</option>	
	</select> 
			-<input type="text" maxlength="4" size="4" name="phone2"> -
			 <input type="text" maxlength="4" size="4" name="phone3"></p>
	<p>성  별 : <input type="radio" name="sex" value="남성" checked>남성
			<input type="radio" name="sex" value="여성" checked>여성</p>
	<p>취  미 :독서 <input type ="checkbox" name="hobby" value="독서">
			 운동 <input type ="checkbox" name="hobby" value="운동">
			 영화 <input type ="checkbox" name="hobby" value="영화"></p>
	<p>이 메 일 : <input type="text" name="email"></p>
	<p> <input type="button" value="가입하기" onclick="checkMember()">
		<input type="reset" value="다시쓰기"> </p>
</form>
</body>
</html>