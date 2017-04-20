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
<a href="${ctx}/emp/emp">添加</a>
<table border="1" cellpadding="10" cellspacing="0">
    <tr>
    <th>id</th>
    <th>名字</th>
    <th>年龄</th>
    <th colspan="2">操作</th>
    </tr>
    <tbody>
    <c:forEach items="${employee}" var="e">
        <tr>
            <td id="id">${e.id}</td>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td><a href="${ctx}/emp/edit/${e.id}">编辑</a></td>
            <td><a id="delete" href="javascript:void(0)" go="${ctx}/emp/emp/${e.id}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>

    <script>
        $(function(){
            $("#delete").click(function () {
                var id=$("#id").text();
                var href=$(this).attr("go");
                $.ajax(
                        {
                            url:href,
                            type:"POST",
                            data:{
                                _method:"DELETE"
                            },
                            success:function(){
                                //alert("删除成功");
                                window.location.reload();
                            },
                            error:function () {
                                alert("删除失败");
                            }

                        }
                );
            });
        });
    </script>
</table>
</body>
</html>
