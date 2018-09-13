<html>
<body>
<%
    // 重定向到新地址
    String site = new String("article/all");
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
%>

</body>
</html>
