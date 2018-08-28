<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/6/27
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>

<body>
<form action="${pageContext.request.contextPath }/user/login" method="post">
    <fieldset>
        <legend>login</legend>
        <div>
            <label>username</label>
            <input type="text" name="name" id="Name" size="18" maxlength="30" value="${user.name }" /><br />
        </div>
        <div>
            <label>password</label>
            <input type="password" name="password" id="password" size="18" maxlength="15" value="${user.password }" /><br />
        </div>
        <input name="login791" type="submit" class="buttom" value="login" />
    </fieldset>
    <a href="/register" name="">register</a>
</form>

</body>
</html>
