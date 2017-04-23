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
    <form:form action="/emp/emp" method="post" commandName="employee">
        name:<form:input path="name"/> <br>
        age:<form:input path="age"/> <br>
        <form:button>点击</form:button>
    </form:form>
</body>
</html>
