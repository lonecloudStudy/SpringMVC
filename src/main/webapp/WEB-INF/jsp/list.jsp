<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/rest/testRest/1">RESTFUL
		GET</a>
	<form action="${pageContext.request.contextPath }/rest/testRest/1"
		method="post">
		RESTFUL POST
		<button type="submit">POST</button>
	</form>
	<form action="${pageContext.request.contextPath }/rest/testRest/1"
		method="post">
		RESTFUL PUT <input type="hidden" name="_method" value="PUT">
		<button type="submit">PUT</button>
	</form>
	<form action="${pageContext.request.contextPath }/rest/testRest/1"
		method="post">
		RESTFUL delete <input type="hidden" name="_method" value="DELETE">
		<button type="submit">DELETE</button>
	</form>
</body>
</html>