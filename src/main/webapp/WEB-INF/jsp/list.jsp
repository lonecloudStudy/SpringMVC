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
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.js"></script>
<%--<script src="${ctx}/asserts/js/jquery.js"></script>--%>
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
            <td id="id">${e.id}</td>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td><a href="${ctx}/emp/edit/${e.id}">编辑</a></td>
            <td><button id="delete">删除</button></td>
        </tr>
    </c:forEach>
    </tbody>

    <script>
        $(function(){
            $("#delete").click(function () {
                var id=$("#id").text();
                $.ajax(
                        {
                            url:"${ctx}/emp/emp",
                            type:"POST",
                            data:{
                                id:id,
                                _method:"DELETE"
                            },
                            success:function(){
                                alert("删除成功");
                            }

                        }
                );
            });
        });
    </script>
</table>
</body>
</html>
