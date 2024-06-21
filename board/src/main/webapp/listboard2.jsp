<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*, java.util.*" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE> 게시판 </TITLE>

<style type='text/css'>
<!--
	a:link		{font-family:"";color:blue;text-decoration:none;}
	a:visited	{font-family:"";color:blue;text-decoration:none;}
	a:hover		{font-family:"";color:blue;text-decoration:underline;}
-->
</style>

</HEAD>
<BODY>

<%
String pageNum = request.getParameter("pageNum");
if(pageNum == null){
	pageNum = "1";
}

int listSize = 5;
int currentPage = Integer.parseInt(pageNum);
int startRow = (currentPage - 1) * listSize + 1;
int endRow = currentPage * listSize;
int lastRow = 0;
int i = 0;
int num[] = {0};

String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://127.0.0.1:3306/Test";

Class.forName(driver);
Connection conn = DriverManager.getConnection(url,"root","1234");

Statement stmt = conn.createStatement();

String strSQL = "SELECT * FROM tblboard";
ResultSet rs = stmt.executeQuery(strSQL);

while(rs.next()){
	num[i] = rs.getInt("num");
}
lastRow = num[0];
%>

<center><font size='3'><b> 게시판 </b></font></center>
                                    
<TABLE border='0' width='600' cellpadding='0' cellspacing='0'>
	<TR>
		<TD><hr size='1' noshade>
		</TD>
 	</TR>
</TABLE>              
                    
<TABLE border='0' cellspacing=1 cellpadding=2 width='600'>      

	<TR bgcolor='cccccc'>      
		<TD><font size=2><center><b>번호</b></center></font></TD>      
		<TD><font size=2><center><b>글 제목</b></center></font></TD>      
		<TD><font size=2><center><b>작성자</b></center></font></TD>      
		<TD><font size=2><center><b>작성일</b></center></font></TD>      
		<TD><font size=2><center><b>조회</b></center></font></TD>      
	</TR>   
	
<%
if(lastRow > 0) {
	strSQL = "SELECT * FROM tblboard WHERE num BETWEEN " + startRow + " and " + endRow;
	rs = stmt.executeQuery(strSQL);

	for (i = 0; i < listSize; i++){		
		if(rs.next()){

		int listnum = rs.getInt("num");
		String name = rs.getString("name");
		String email = rs.getString("email");
		String title = rs.getString("title");
		String writedate = rs.getString("writedate");
		int readcount = rs.getInt("readcount");
%>

	<TR bgcolor='ededed'>     
		<TD align=center><font size=2 color='black'>
                                    <%=listnum %></font></TD>     
		<TD align=left>
			<a href="write_output.jsp?num=<%=listnum %>">
			<font size=2 color="black"><%=title %></font></a>
		</TD>
		<TD align=center>    
			<a href="<%=email %>">
			<font size=2 color="black"><%=name %></font></a>     
		</TD>     
		<TD align=center><font size=2><%=writedate %></font>
		</TD>     
		<TD align=center><font size=2><%=readcount %></font>     
	</TR>  
	   	
<%     
		}
	}	
%>

</TABLE>     
                
<TABLE border='0' width='600' cellpadding='0' cellspacing='0'>
	<TR>
		<TD><hr size='1' noshade>
		</TD>
 	</TR>
</TABLE>                    

<TABLE border=0 width=600>
	<TR>
		<TD align=left>		
		</TD>

		<TD align='right'>		
		<a href='write.jsp'>[등록]</a>				
		</TD>
	</TR>
</TABLE>
	                   
<%
rs.close();
stmt.close();
conn.close();
}

if(lastRow > 0) {
	int setPage = 1;
	int lastPage = 0;
	if(lastRow % listSize == 0)
		lastPage = lastRow / listSize;
	else
		lastPage = lastRow / listSize + 1;

	if(currentPage > 1) {
%>
		<a href="listboard.jsp?pageNum=<%=currentPage-1%>">[이전]</a>	
<%	
	}
	while(setPage <= lastPage) {
%>
		<a href="listboard.jsp?pageNum=<%=setPage%>">[<%=setPage%>]</a>
<%
		setPage = setPage + 1;
	}
	if(lastPage > currentPage) {
%>
		<a href="listboard.jsp?pageNum=<%=currentPage+1%>">[다음]</a>
<%
	}
}
%>  
                  
</BODY>                     
</HTML>