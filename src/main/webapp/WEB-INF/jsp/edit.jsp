<%--
  Created by IntelliJ IDEA.
  User: lonecloud
  Date: 17/4/19
  Time: 下午4:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/head.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/emp/emp" method="post">
    <input type="hidden" name="_method" value="PUT">
    id: <input type="text" name="id" readonly value="${employee.id}"><br>
    名字: <input type="text" name="name" value="${employee.name}"><br>
    年龄:<input type="text" name="age" value="${employee.age}"><br>
    <button type="submit">修改</button>
</form>
</body>
</html>
