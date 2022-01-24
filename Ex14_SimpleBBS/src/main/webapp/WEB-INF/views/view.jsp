<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ 
	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	내용보기
	<br /> 작성자: ${dto.title}
	<br /> 제목: ${dto.title}
	<br /> 내용: ${dto.content}
	<hr />
	<br />
	<p>
		<a href="list">목록보기</a>
	</p>
</body>
</html>