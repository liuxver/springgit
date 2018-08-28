<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/28
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/user/login" method="post">
    <div>
        <label>userName:</label>
        <input class="form-control" type="text" name="name" value="${user.name }"/><br/>
    </div>
    <div>
        <label>password:</label>
        <input class="form-control" type="password" name="password" value="${user.password }"><br/>
    </div>
    <input  type="submit" value="login"/>
    <br>
    <a href="/register" name="">注册</a>
    <a href="/adminLogin" >管理员登陆</a>
</form>


</body>
</html>
