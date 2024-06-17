<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("passwd");
	
	if(user_id.equals("admin")&& user_pw.equals("1234")){
		Cookie cookie_id = new Cookie("userID",user_id);
		Cookie cookie_pw = new Cookie("userPW",user_pw);
		response.addCookie(cookie_id);
		response.addCookie(cookie_pw);
		out.println("쿠키 생성이 성공했습니다<br>");
		out.println(user_id+"님 환영합니다");
	}else {
		out.println("쿠키 생성이 실패했습니다.");
	}
%>
<%-- 쿠키 생성
1) Cookie() 메소드 사용
2) 쿠키를 생성한 후에는 반드시 response 내장 객체의
addCookie()메소드로 쿠키를 설정해야 함
3) 형식
Cookie cookie(String name,String value)
- name : 쿠키 식별 이름
- value : 쿠키 값
4)Cookie()메소드 사용 예
Cookie cookie = new Cookie("memberID","admin");
response.add(cookie);
 --%>
</body>
</html>