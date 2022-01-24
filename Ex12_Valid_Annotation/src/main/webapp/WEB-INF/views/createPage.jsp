<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String conPath = request.getContextPath();
	%>
	
	<form action="<%=conPath%>/create">
		작성자: <input type="text" name="writer" value="${dto.writer}"> <br/>
		내용: <input type="text" name="content" value="${dto.content}"> <br/>
		<input type="submit" value="전송"> <br/>
	</form>
</body>
</html>