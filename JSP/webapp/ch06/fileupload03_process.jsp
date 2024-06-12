<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>File Upload</title>
</head>
<body>

<%
	String fileUploadPath = "C:\\upload";
	DiskFileUpload upload = new DiskFileUpload();
	List items = upload.parseRequest(request);
	Iterator params = items.iterator();
	
	while (params.hasNext()) {
		FileItem fileItem = (FileItem) params.next(); 
		if(!fileItem.isFormField()) {
			String fileName = fileItem.getName();
			fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			File file = new File(fileUploadPath + "/" + fileName);
			fileItem.write(file);
		}
	}
%>
<%-- DiskFileUpload upload = new DiskFileUpload();
		//파일 업로드 핸들러 생성
		upload.parseRequest(request)
		//전송된 request 를 parsing 하여 아이템들을 추출 --%>

<%-- Commons-FileUpload(파일 업로드 패키지)
1)서버의 메모리상에서 파일 처리가 가능하도록 지원
2)오픈 라이브러리 commons-fileupload.jar, commons-io.jar 파일을 배포 사이트에서 다운
3)JSP 페이지에 page 디렉티브 태그의 import 속성을 사용,
패키지 org.apache.commons.fileupload.*를 설정

-DiskFileUpload 객체 생성
-DiskFileUpload의 메소드를 이용해 웹 브라우저가 전송한 multipart/form-data 유형의 요청 파라미터 가져옴
-FileItem 클래스 이용해 파일 또는 일반 데이터인지 구분해 업로드 처리

-DiskFileuUpload 클래스 메소드-
1)setRepositoryPath():업로드된 파일을 임시 저장할 디렉토리 설정
2)setSizeMax() : 파일의 최대 크기 설정
3)parseRequest():multipart/form-data 유형의 요청 파라미터 가져오기
4)setSizeThreshold():메모리상에 저장할 최대 크기 설정

-FileItem 클래스 메소드
isFormField():일반 데이터일 경우 true
getFileName():요청 파라미터 이름 가져오기
getName():업로드된 파일 경로 포함한 이름 가져오기
isInMemory():업로드 파일이 메모리에 저장되면 true 반환
getContentType():콘텐츠 유형 반환
write():파일과 관련된 자원 저장
delete():파일과 관련된 자원 삭제

  --%>




</body>
</html>