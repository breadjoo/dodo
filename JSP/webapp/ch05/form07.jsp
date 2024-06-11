<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Form processing</title>
</head>
<body>
<h3>회원가입</h3>
<form action="form07_process.jsp" name="member" method="post">
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
	<p>취  미 : 독서 <input type ="checkbox" name="hobby" value="독서">
			 운동 <input type ="checkbox" name="hobby" value="운동">
			 영화 <input type ="checkbox" name="hobby" value="영화"></p>
	<p><textarea name="comment" cols="30" rows="3" placeholder="가입인사를 입력해주세요"></textarea></p>
	<p> <input type="submit" value="가입하기">
		<input type="reset" value="다시쓰기"> </p>
		
</form>

</body>
</html> 