<%--
  Created by IntelliJ IDEA.
  User: lonecloud
  Date: 17/4/17
  Time: 下午7:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="10" cellspacing="0">
    <tr>
    <th>id</th>
    <th>名字</th>
    <th>年龄</th>
    <th>操作</th>
    </tr>
    <tbody>
    <c:forEach items="${employee}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td><a href="${ctx}/edit/${e.id}"></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
