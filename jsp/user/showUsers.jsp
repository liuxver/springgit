<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/28
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户列表</title>

</head>
<body>


    用户列表：
    <table width="100%" border=1>
        <tr>
            <td>名称</td>
            <td>密码</td>
            <td>用户类型</td>

            <td>操作</td>
        </tr>
        <c:forEach items="${usersList }" var="item">
            <tr>
                <td>${item.name }</td>
                <td>${item.password }</td>
                <td>${item.userType }</td>

                <td><a href="${pageContext.request.contextPath }/user/delete?name=${item.name}">删除</a></td>

            </tr>
        </c:forEach>

    </table>
</body>

</html>