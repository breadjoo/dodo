<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
</head>
<body>
<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	Class.forName(driver);
	Connection connection = DriverManager.getConnection(url,"root","1234");
	
	Statement stmt = connection.createStatement();
	
	String sql = "select*from tblboard";
	ResultSet rs = stmt.executeQuery(sql);
%>
<center><font size="3"><b>게시판</b></font></center>
<table border="0" width="600" cellpadding="0" cellspacing="0">
	<tr>
		<td><hr size="1" noshade> </td>
	</tr>
</table>
<table border="0" cellspacing="1" cellpadding="2" width="600">
	<tr bgcolor="cccccc">
		<td><font size="2"><center><b>번  호</b></center></font></td>
		<td><font size="2"><center><b>글 제목</b></center></font></td>
		<td><font size="2"><center><b>작성자</b></center></font></td>
		<td><font size="2"><center><b>작성일</b></center></font></td>
		<td><font size="2"><center><b>조  회</b></center></font></td>
	</tr>

<%
while(rs.next()){
	int num = rs.getInt("num");
	String name = rs.getString("name");
	//String pass = rs.getString("pass");
	String email = rs.getString("email");
	String title = rs.getString("title");
	//String contents = rs.getString("contents");
	String writedate = rs.getString("writedate");
	int readcount = rs.getInt("readcount");
%>
<tr bgcolor="ededed">
	<td align = "center"><font size="2"><%=num %></font></td>
	<td align = "left">
		<a href="write_output.jsp?num=<%=num %>">
		<font size="2"><<%=title %>/font></a></td>
	<td align ="center">
		<a href="<%=email %>">
		<font size="2"><%=name %></font></a></td>
	<td align = "center"><font size="2"><%=writedate %></font></td>
	<td align = "center"><font size="2"><%=readcount %></font></td>
</tr>
<%}%>
</table>

<table border="0" width="600" cellpadding="0" cellspacing="0">
	<tr>
		<td><hr size="1" noshade></td>
	</tr>
</table>
<table>
	<tr>
		<td align="left"></td>
		<td align="right">
		<a href="write.jsp">[등록]</a>
	</tr>
</table>
<%
rs.close();
stmt.close();
connection.close();
%>
</body>
</html>