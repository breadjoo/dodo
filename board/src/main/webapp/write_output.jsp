<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<%@ page import = "java.sql.*, java.util.*" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
<title>게시판</title>
</head>
<body>
<%
	String num = request.getParameter("num");
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url ="jdbc.mysql://localhost:3306/test";
	
	Class.forName(driver);
	Connection connection = DriverManager.getConnection(url);
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		String sql = "select*from tblboard where num = ?";
		pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(num));
		rs = pstmt.executeQuery();
		rs.next();
		
		String name = rs.getString("name");
		String title = rs.getString("title");
		String email = rs.getString("email");
		String contents = rs.getString("contents").trim();
		String writedate = rs.getString("writedate");
		String pass = rs.getString("pass");
		int readcount = rs.getInt("readcount");
		
%>
<center> <font size="3"><b>게 시 판</b></font></center>

<table border="0" width="600" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			<hr size="1" noshade>
		</td>
	</tr>
</table>
<table>
	<tr>
		<td align="left">
			<font size="2"> 작성자 : <%=name %></font>
		</td>
		<Td align="right">
			<font size="2"> 작성일 : <%=writedate %>,조회수 : <%=readcount %></font>
		</Td>
	</tr>
</table>

<table border="0" cellspacing="3" cellpadding="3" width="600">
	<tr bgcolor="cccccc">
		<td align ="center">
			<font size="3"><b><%=title %></b></font>		
		</td>
	</tr>
</table>
<table border="0" cellspacing="5" cellpadding="10" width="600">
	<tr bgcolor="ededed">
		<td>
			<font size="2"><%=contents %></font>
		</td>
	</tr>
</table>
<table border="0" width="600">
	<tr>
		<td align="right">
		<font size="2"><br></font>
		</td>
	</tr>
</table>
<table border="0" width="600" cellpading="0" cellspacing="0">
	<tr>
		<td>
			<hr size="1" noshade>
		</td>
	</tr>
</table>
<table border="0" width="600">
	<tr>
		<td align="right">
			<a href="write.jsp">[글쓰기]</a>
			<a href="listboard.jsp">[목록보기]</a>
		</td>
	</tr>
</table>
<%
	String sql2 = "update tblboard set readcount = readcount+1 where num = ? ";
	pstmt = connection.prepareStatement(sql2);
	pstmt.setInt(1, Integer.parseInt(num));
	pstmt.executeUpdate();
	
	}catch (SQLException e){
		out.print("SQL에러 : " +e.getMessage());
	}catch (Exception e){
		out.print("JSP에러 : " + e.getMessage());	
	}finally{
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(connection!=null)
			connection.close();
	}
	
%>

</body>
</html>