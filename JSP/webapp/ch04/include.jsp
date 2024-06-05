<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>Action tag</title>
</head>
<body>
	<h2>include 액션태그</h2>
	<jsp:include page="include_date.jsp" flush="true" />
	<p> ----------------------------------

<%-- include 액션 태그
현재 JSP 페이지의 특정 영역에 외부 파일의 내용을 포함하는 태그
현재 JSP 페이지에 포함할 수 있는 외부 파일 : HTML,JSP, 서블릿 페이지 등
<jsp:include page="파일명" flush="false" />

1)page 속성 값
현재 JSP 페이지 내에 포함할 내용을 가진 외부 파일명
외부 파일은 현재 JSP 페이지와 같은 디렉터리에 있으면 파일명만 설정하고,
그렇지 않으면 전체 URL(또는 상대 경로)을 설정해야 함

2)flush 속성 값
설정한 외붚 파일로 제어가 이동할 때 현재 JSP 페이지가 지금까지 출력버퍼에 저장한 결과를 처리함
(기본 값 :false)true로 설정하면 외부 파일로 제어가 이동할 때
현재 JSP 페이지가 지금까지 출력 버퍼에 저장된 내용을 웹 브라우저에 출력하고 출력 버퍼를 비움 
 --%>
</body>
</html>