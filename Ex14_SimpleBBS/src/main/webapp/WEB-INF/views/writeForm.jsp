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
		<form action="write" method="post">
			<tr>
				<td>�ۼ���</td>
				<td><input type="text" name="writer" size="100" /></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="title" size="100" /></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="content" size="100" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="�Է�" /> &nbsp;
					&nbsp; <a href="list">��Ϻ���</a></td>
			</tr>
		</form>
	</table>
</body>
</html>