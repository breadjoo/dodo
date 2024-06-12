<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>File Upload</title>
</head>
<body>

<%
	String path = "C:\\upload";

	DiskFileUpload upload = new DiskFileUpload();

	upload.setSizeMax(1000000); // 업로드할 파일 최대 사이즈(1mb)
	upload.setSizeThreshold(4096); //메모리상 저장할 최대 크기(4096byte)
	upload.setRepositoryPath(path); // 임시저장공간(path폴더)
	
	List items = upload.parseRequest(request);
	Iterator params = items.iterator();
	
	while (params.hasNext()){
		FileItem item = (FileItem) params.next();
		
		if (item.isFormField()) {
			String name = item.getFieldName();
			String value = item.getString("utf-8");
			out.println(name+" : "+value+"<br>");
		} else{
			String fileFieldName = item.getFieldName();
			String fileName = item.getName();
			String contentType = item.getContentType();
			
			fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			long fileSize = item.getSize();
			
			File file = new File(path+"/"+fileName);
			item.write(file);
			
			out.println("요청 파라미터 이름 : " + fileFieldName +"<br>");
			out.println("파일명 : " + fileName +"<br>");
			out.println("유형 : " + contentType +"<br>");
			out.println("파일크기 : " + fileSize +"<br>");
			
			
			
		}
	}
%>



<%--
1)upload.parseRequest(request)
파싱 (구문분석 + 의미분석), items 안에는 파일객체 + 폼 데이터가 섞여있음
2)params.hasNext()
폼 페이지에서 전송된 요청 파라미터가 없을 때까지 반복
3)params.next()
전송된 요청 파라미터의 이름을 가져오도록 Iterator 객체 타입의 next() 메소드 사용
4)item.isFormField()
요청 파라미터가 일반 데이터(text,checkbox,radio..)이면 true 반환
jpg 등 파일을 올리면 false
5)item.getFieldName()
ex) ?id=a001 이면 id가 추출됨
item.getString("utf-8")
ex) ?id=a001 이면 a001이 추출됨
6)item.isFormField()가 false 인 경우
==>폼 페이지에서 전송된 요청 파라미터가 파일(input type='file')인 경우
7)item.getFieldName():요청 파라미터 이름
8)item.getName():저장 파일 이름
9)item.getContentType():저장 콘텐츠 유형
10)fileName.substring(fileName.lastIndexOf("\\")+1) =>폴더경로끝\\+1에해당하는 파일명
11)new File(path+"/"+fileName)
java.io.File-> 파일객체 생성함
12)item.write(file) 여기서 실제파일 생성(복사완료)
 --%>

</body>
</html>