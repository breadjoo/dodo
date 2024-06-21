<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 수정 </title>
</head>
<body>
<%
String num = request.getParameter("num");
%>

<center><font size='3'><b>비밀번호 확인</b></font>
<table border='0' width='600' cellpadding='0' cellspacing='0'>
    <TR>
		<TD><hr size='1' noshade>
		</TD>
 	</TR>
</table>

<Form Action='modify_input.jsp' Method='post'>
<input type='hidden' name='num' value='<%=num %>'>

<table border='0' width='300' align='center'>
  <TR>
    <TD align='center'>
      <font size=2><B>비밀번호</B></font>
    </TD>
    <TD>
      <input type='password' name='pass' size=20 maxlength=20>
      <input type='submit' value=' 확 인 ' 
             style='background-color:cccccc; font-weight:bolder'>
    </TD>
  </TR> 
</table>

<table border='0' width='600' cellpadding='0' cellspacing='0'>
   <TR>
      <TD> <hr size='1' noshade> </TD>
   </TR>
</table>

<a href='listboard.jsp'>[목록 보기]</a>

</Form>

</body>
</html>