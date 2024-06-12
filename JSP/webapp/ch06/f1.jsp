<%@ page contentType="text/html; charset=utf-8" %>


웹 브라우저에서 서버로 파일을 전송하기 위해 JSP 페이지에 폼 태그를 작성할 때 중요한 규칙

1)form 태그의 method 속성은 반드시 post방식으로 설정
2)form 태그의 enctype 속성은 반드시 multipart/form-data로 설정
3)from 태그의 action 속성은 파일 업로드를 처리할 JSP 파일로 설정
4)파일 업로드를 위해 input 태그의 type 속성은 file로 설정

--형식--
<form action="JSP파일" method="POST" enctype="multipart/form-action">
	<input type="file" name="요청 파라미터 이름">
</form>