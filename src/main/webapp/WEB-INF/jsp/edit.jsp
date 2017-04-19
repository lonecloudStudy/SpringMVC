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
<form action="${ctx}/save" method="post">
    <input type="text" name="id" readonly>
    <input type="text" name="name">
    <input type="text" name="age">
</form>
</body>
</html>
