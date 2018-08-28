<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/28
  Time: 17:58
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
    <title>showOrders</title>
		<style type="text/css">
    	body{
    		background-image: url(../pic/bj2.jpg);
    	}
    </style>
</head>
<div class="vertical-align-middle">
	<img src="../pic/logo.png" alt="旭旭的网上二手交易平台">
</div>
<style type="text/css">
footer,h1{
text-align: center;
}
</style>
<body>
<br/>
<h1>订单列表：</h1>
<table width="100%" border=2 bgcolor="blanchedalmond">
    <tr>
        <td>商品名称</td>
        <td>卖家</td>
        <td>买家</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${ordersList }" var="item">
        <tr>
            <td>${item.name }</td>
            <td>${item.seller }</td>
            <td>${item.buyer }</td>


            <td><a href="${pageContext.request.contextPath }/orders/delete?name=${item.name}&uname=${uname}">删除</a></td>

        </tr>
    </c:forEach>

</table>
</body>
<footer class='foot_info_met_16_1 met-foot p-y-20 border-top1' m-id='6' m-type='foot'>
	<div class="container text-xs-center">
        <p>Email:liuxver444@gmail.com</p>
        <div class="powered_by_metinfo">
            Powered by 1007全体同学 <b><a href=http://www.liuxv.cn target=_blank>www.liuxv.cn</a></b> &copy;2008-2018 &nbsp;<a href=http://www.liuxv.cn target=_blank>www.liuxv.cn</a>		</div>
        <ul class="met-langlist p-0">
		    		    	    </ul>
	</div>
</footer>
</html>
