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
	<%
	out.println("Model(Sub): Hello World");
	%>
	<br /> ${ObjectTest}
	<br /> ${list}
	<br />
	<br />
	<c:forEach var="mylist" items="${lists}">
		${mylist} <br />
	</c:forEach>
	<br />
	<br />
	당신의 이름은 ${name} 입니다.
</body>
</html>