<%--
  Created by IntelliJ IDEA.
  User: LYY
  Date: 2018-11-23
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统主页</title>
</head>
<body>
当前用户：${USER_SESSION.username}
<a href="${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>
