<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/29
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>userHome</title>
</head>
<body>
<h3>hello,${name}!</h3>
<h4>欢迎来到我们的二手商品交易平台！</h4>

<h5>
    <a href="/goods/write?uname=${name}">我要卖货</a>
</h5>



<h1>正在卖出的商品</h1>
<a href="/goods/findGoodsListByType?id=1&uname=${name}">高端消费品</a>
<a href="/goods/findGoodsListByType?id=2&uname=${name}">低端消费品</a>
<a href="/goods/findGoodsListByType?id=3&uname=${name}">网游代练区</a>
<a href="/goods/findGoodsListByType?id=4&uname=${name}">手游代练区</a>

<h1>我的订单</h1>
<a href="/orders/findOrdersByUser?uname=${name}">查看关于我的订单</a>


<h1>平台留言</h1>
<a href="/talks/showTalksUser?uname=${name}">查看所有的留言</a>


</body>
</html>
