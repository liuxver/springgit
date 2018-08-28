<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/29
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>adminLogin</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/user/adminLogin" method="post">
    <div>
        <label>管理员用户名:</label>
        <input class="form-control" type="text" name="name" value="${user.name }"/><br/>
    </div>
    <div>
        <label>管理员密码:</label>
        <input class="form-control" type="password" name="password" value="${user.password }"><br/>
    </div>
    <input  type="submit" value="登陆"/>
    <br>

</form>


</body>
</html>
