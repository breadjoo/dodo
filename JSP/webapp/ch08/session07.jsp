<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Session</title>
</head>
<body>
<h4>--------- 세션 유효 시간 변경 전 ----------</h4>
<%
	int time = session.getMaxInactiveInterval()/60;

	out.println("세션 유효 시간 : " + time + "분<br>");
%>
<h4>--------- 세션 유효 시간 변경 후 ----------</h4>
<%

	session.setMaxInactiveInterval(10*60);
	time = session.getMaxInactiveInterval()/60;
	
	out.println("세션 유효 시간 : " + time + "분<br>");
	
%>
<%--세션 유효 시간
- 세션을 유지하기 위한 세션의 일정 시간
- 웹 브라우저에 마지막 접근한 시간부터 일정 시간 내에 반응 없으면 자동 세션 종료
- 세션 유효시간 설정 : session 내장 객체의 setMaxInactiveInterval()메소드 사용
- void setMaxInactiveInterval(int interval)
	매개변수 interval : 세션 유효 시간
	세션 유효 시간의 기본 값 : 1,800초(초 단위 설정) -> 30분
- 세션 유효 시간이 0또는 음수인 경우 : 
session.invalidate() 메소드를 호출하지 않으면 생성된 세션 속성이 웹서버에서 제거되지 않고 유지됨
즉 세션 유효시간이 없는 상태에서 session.invalidate() 메소드를 명시적으로 실행하지 않으면
이 세션 때문에 메모리 부족 현상이 발생할 수 있음
 --%>

</body>
</html>