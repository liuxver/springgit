<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/6/27
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %><html>
<head>
    <title>withdraw</title>
</head>

<body>
<h1>hello,${user},your account ${account.account} have money ${account.money}</h1>
<h3>Enter the money you want:</h3>
<form action="${pageContext.request.contextPath }/user/submit?user=${user}&account=${account.account}" method="post">

    <div>
        <label>money:</label>
        <input class="form-control" type="text" name="m"><br/>
    </div>
    <input  type="submit" value="取款"/>

</form>




</body>
</html>
