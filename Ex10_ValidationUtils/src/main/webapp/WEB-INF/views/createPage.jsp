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
		�ۼ���: <input type="text" name="writer" value="${dto.writer}"> <br/>
		����: <input type="text" name="content" value="${dto.content}"> <br/>
		<input type="submit" value="����"> <br/>
	</form>
</body>
</html>