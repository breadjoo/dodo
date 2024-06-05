<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Action tag</title>
</head>
<body>
<h2>이 파일은 first.jsp입니다.</h2>
<jsp:forward page="second.jsp" />
<p> === first.jsp 의 페이지 ===

<%-- forward액션 태그
현재 JSP 페이지에서 다른 페이지로 이동하는 태그
JSP 컨테이너는 현재 JSP 페이지에서 forward 액션 태그를 만나는 경우
그 전까지 출력 버퍼에 저장되어 있던 내용을 모두 삭제함
forward 액션 태그에 설정된 페이지로 프로그램의 제어 이동됨
<jsp:forward page= "파일명" /> : 반드시 끝나는 태그(/)가 있어야함
<jsp:forward page="파일명" > </jsp:forward> <- 이것도 가능한데 그냥 위에가 편리

page  속성 값 : 현재 JSP 페이지에서 이동할 페이지의 외부 파일명
외부 파일은 현재 JSP 페이지와 같은 디렉토리에 있으면 파일명만 설정하고
그렇지 않으면 전체 URL(또는 상대 경로)을 설정해야 함
 --%>


</body>
</html>