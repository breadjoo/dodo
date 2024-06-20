<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<%@ page import = "java.sql.*, java.util.*" %>

<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String email = request.getParameter("email");
	String title = request.getParameter("title");
	String contents = request.getParameter("contents");
	String writedate = request.getParameter("writedate");

	
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	
	Class.forName(driver);
	Connection connection = DriverManager.getConnection(url,"root","1234");
	
	PreparedStatement pstmt = null;
	
	Calendar dateIn = Calendar.getInstance();
	String indate = Integer.toString(dateIn.get(Calendar.YEAR)) +"_";
	indate = indate + Integer.toString(dateIn.get(Calendar.MONTH)+1)+"_";
	indate = indate + Integer.toString(dateIn.get(Calendar.DATE))+" ";
	indate = indate + Integer.toString(dateIn.get(Calendar.HOUR_OF_DAY))+":";
	indate = indate + Integer.toString(dateIn.get(Calendar.MINUTE))+":";
	indate = indate + Integer.toString(dateIn.get(Calendar.SECOND));
	
	String sql = "insert into tblboard values(null, ?, ?, ?, ?, ?, ?, ?)";
	pstmt = connection.prepareStatement(sql);
	pstmt.setString(1, name);
	pstmt.setString(2, pass);
	pstmt.setString(3, email);
	pstmt.setString(4, title);
	pstmt.setString(5, contents);
	pstmt.setString(6, indate);
	pstmt.setInt(7, 0);
	pstmt.executeUpdate();
	
	pstmt.close();
	connection.close();

	response.sendRedirect("listboard.jsp");
%>
