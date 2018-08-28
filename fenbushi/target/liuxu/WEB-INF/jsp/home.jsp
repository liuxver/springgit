<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/6/27
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %><html>
<head>
    <title>homd</title>
</head>

<body>
<h1>hello,${user}</h1>
<h1>账号列表：</h1>
<table width="100%" border=2 bgcolor="#a9a9a9">
    <tr>
        <td>账号名</td>
        <td>余额</td>

        <td>操作</td>
    </tr>
    <c:forEach items="${list }" var="item">
        <tr>
            <td>${item.account}</td>
            <td>${item.money }</td>




            <td><a href="${pageContext.request.contextPath }/user/withdraw?account=${item.account}&user=${user}">取款</a></td>

        </tr>
    </c:forEach>

</table>

<hr/>
<form action="${pageContext.request.contextPath }/user/create?user=${user}" method="post">

    <div>
        <label>账号名:</label>
        <input class="form-control" type="text" name="account"><br/>
    </div>
    <input  type="submit" value="创建账户"/>

</form>
</body>
</html>
