<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2018/9/13
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <base href="<%=basePath%>">
    <title>register</title>
</head>
<body>
    <form id="form"action="register" method="post">
        用户名：<input  name="userName"/>
        <a onclick="document.getElementById('form').submit();return false">注册</a>
    </form>
</body>
</html>
