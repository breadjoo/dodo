<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import = "java.sql.*, java.util.*" %>
<% request.setCharacterEncoding("UTF-8"); %>

<%
int num = Integer.parseInt(request.getParameter("num"));
String name = request.getParameter("name");
String pass = request.getParameter("pass");
String email = request.getParameter("email");
String title = request.getParameter("title");
String contents = request.getParameter("contents");

String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://127.0.0.1:3306/Test";

Class.forName(driver);
Connection conn = DriverManager.getConnection(url,"root","1234");

PreparedStatement pstmt = null;

Calendar dateIn = Calendar.getInstance();
String indate = Integer.toString(dateIn.get(Calendar.YEAR))+"-";
indate = indate + Integer.toString(dateIn.get(Calendar.MONTH)+1)+"-";
indate = indate + Integer.toString(dateIn.get(Calendar.DATE))+" ";
indate = indate + Integer.toString(dateIn.get(Calendar.HOUR_OF_DAY))+":";
indate = indate + Integer.toString(dateIn.get(Calendar.MINUTE))+":";
indate = indate + Integer.toString(dateIn.get(Calendar.SECOND));

String strSQL="UPDATE tblboard SET name=?, pass=?, email=?, title=?, contents=?, writedate=? WHERE num=?";
pstmt = conn.prepareStatement(strSQL);
pstmt.setString(1, name);
pstmt.setString(2, pass);
pstmt.setString(3, email);
pstmt.setString(4, title);
pstmt.setString(5, contents);
pstmt.setString(6, indate);
pstmt.setInt(7, num);
pstmt.executeUpdate();

pstmt.close();
conn.close();

response.sendRedirect("listboard.jsp");
%>