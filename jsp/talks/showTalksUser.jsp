<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/29
  Time: 20:46
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
    <title>showTalksUser</title>

</head>
<body>
<h3>welcome，${uname}</h3>

<form id="talksForm" action="${pageContext.request.contextPath }/talks/addTalks?user=${uname}" method="post"  enctype="multipart/form-data">
    添加留言信息：
    <table width="100%" border=1>
        <tr>
            <td>留言内容</td>
            <td>
                <textarea rows="3" cols="30" name="words"></textarea>
            </td>
        </tr>

        <tr>
            <td colspan="2" align="center"><input type="submit" value="添加留言"/>
            </td>
        </tr>
    </table>

</form>




留言列表：
<table width="100%" border=1>
    <tr>
        <td>留言编号</td>
        <td>留言人</td>
        <td>留言日期</td>
        <td>留言内容</td>
    </tr>
    <c:forEach items="${talksList }" var="item">
        <tr>
            <td>${item.id }</td>
            <td>${item.talkerName }</td>
            <td>${item.date }</td>
            <td>${item.words}</td>


        </tr>
    </c:forEach>

</table>
</body>
</html>
