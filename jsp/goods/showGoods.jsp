<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/28
  Time: 17:26
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
    <title>showGoods</title>
</head>
<body>

商品列表：
<table width="100%" border=1>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品图片</td>
        <td>商品类型</td>
        <td>商品卖家</td>
        <td>商品状态</td>
        <td>商品信息</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${goodsList }" var="item">
        <tr>
            <td>${item.name }</td>
            <td>${item.price }</td>
            <td>
                <c:if test="${items.pic !=null}">
                    <img src="/pic/${items.pic}" width=100 height=100/>
                    <br/>
                </c:if>
            </td>
            <td>${item.typeId}</td>
            <td>${item.seller}</td>
            <td>${item.status}</td>
            <td>${item.information}</td>

            <td><a href="${pageContext.request.contextPath }/goods/delete?name=${item.name}">删除</a></td>

        </tr>
    </c:forEach>

</table>

</body>
</html>
