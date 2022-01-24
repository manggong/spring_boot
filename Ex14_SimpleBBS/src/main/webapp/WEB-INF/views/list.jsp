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
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>삭제</td>
		</tr>
		<tr>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.id}</td>
					<td>${dto.writer}</td>
					<td><a href="view?id=${dto.id}">${dto.title}</a></td>
					<td><a href="delete?id=${dto.id}">X</a></td>
				</tr>
			</c:forEach>
		</tr>
	</table>

	<p>
		<a href="writeForm">글작성</a>
	</p>
</body>
</html>