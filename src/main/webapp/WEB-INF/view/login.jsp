<%--
  Created by IntelliJ IDEA.
  User: LYY
  Date: 2018-11-23
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<div align="center"><img alt="" src="/img/_ewpt.JPG"></div><br>
<div align="center">${msg}</div>
<div align="center">
    <form action="${pageContext.request.contextPath}/login" method="post" style="align-content: center">
    用户名：<input type="text" name="username"><br>
    密&nbsp;&nbsp;码：<input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</div>
</body>
</html>