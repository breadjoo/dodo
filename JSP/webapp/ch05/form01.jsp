<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Form processing</title>
</head>
<body>
<%-- form 태그와 input 태그로 간단한 회원가입 양식 만들기 --%>
<h3>회원가입</h3>
<form action="#" name="member" method="post">
	<p>아 이 디 : <input type="text" name="id">
	<input type="button" value="아이디 중복 검사"></p>
	<p>비밀번호 : <input type="password" name="password"></p>
	<p>연 락 처 : <input type="text" maxlength="4" size="4" name="phone1">
			-<input type="text" maxlength="4" size="4" name="phone2"> -
			 <input type="text" maxlength="4" size="4" name="phone3"></p>
	<p>성  별 : <input type="radio" name="sex" value="남성" checked>남성
				<input type="radio" name="sex" value="여성" checked>여성</p>
	<p>취  미 : 독서 <input type ="checkbox" name="hobby1" checked>
			 운동 <input type ="checkbox" name="hobby2">
			 영화 <input type ="checkbox" name="hobby3"></p>
	<p> <input type="submit" value="가입하기">
		<input type="reset" value="다시쓰기"> </p>
		
</form>
<%-- input 태그
사용자가 텍스트 입력이나 선택 등 다양하게 할 수 있도록 공간을 만드느 태그 종료태그 없이 단독 사용가능
-- input 태그의 기본 속성 --
text : 한줄 텍스트
radio : 동그란 버튼, 1개만 선택가능
checkbox : 다중 선택 가능
password : 암호 입력
hidden : 숨겨서 값을 전송
button : 버튼 출력
reset : 폼에 입력된 값 초기화
submit : 폼에 입력된 값 서버에 전송
--%>



</body>
</html> 