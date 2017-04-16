<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${test }</p>
	<form action="${pageContext.request.contextPath }/testUser" method="post">
		用户名：<input name="username"><br>
		密码：<input name="password"><br>
		年龄：<input name="age"><br>
		address：<input name="address.city"><br>
		<button type="submit">提交</button>
	</form>
	<p>修改用户</p>
	<form action="${pageContext.request.contextPath }/testError" method="post">
		用户名：<input name="username" value="${user.username }"><br>
		密码：<input name="password" value="${user.password }"><br>
		年龄：<input name="age" value="${user.age }"><br>
		address：<input name="address.city" value="${user.address.city }"><br>
		<button type="submit">提交</button>
	</form>
</body>
</html>