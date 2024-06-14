<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Session</title>
</head>
<body>
<h4>--------- 세션을 삭제하기 전 ----------</h4>
<%
	String user_id = (String) session.getAttribute("userID");
	String user_pw = (String) session.getAttribute("userPW");

	out.println("설정된 세션의 속성 값 [1] : " + user_id+"<br>");
	out.println("설정된 세션의 속성 값 [2] : " + user_pw+"<br>");
	
	if(request.isRequestedSessionIdValid()==true) {
		out.print("세션이 유효합니다.");
	} else {
		out.print("세션이 유효하지 않습니다.");
	}
	session.invalidate();
%>

<%-- 다중 세션 삭제하기
- 세션에 저장된 모든 세션 속성 이름을 삭제하려면
invalidate() 메소드를 사용함
void invalidate()
- 사용예
session.invalidate()
 --%>
</body>
</html>