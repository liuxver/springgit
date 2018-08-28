<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/29
  Time: 16:43
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
    <title>showGoodsUser</title>
    <style type="text/css">

    </style>
</head>


                                    <body background="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525427969514&di=67961a76982a7e887da459bc29461ce7&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F15%2F88%2F32%2F10q58PICGW8_1024.jpg">
                                                                                                                                                                                                                                                                                                       <div class="vertical-align-middle">
                                                                                                                                                                                                                                                                                                                                         </div>
<h3 align="middle">hello,${uname}!</h3>
<h3 align="middle">你想买什么东西？</h3>
<h1 align="middle">商品展示：</h1>
<table align="middle" width="100%">
    	<c:forEach items="${goodsList }" var="item">
    	<tr align="middle">
			<td width="200px" align="middle">
            	<div style="float: none;clear: both;">
                <c:if test="${item.pic !=null}">
                    <img src="/pic/${item.pic}" width=300 height=280 align="middle"/>
                    <br/>
                </c:if>   
                </div>
             <details>
             	<summary>商品详细信息</summary>
             <li>商品名称 ${item.name }</li>
             <li>商品价格 ${item.price }</li>

             <li>商品卖家 ${item.seller}</li>

             <li>商品信息 ${item.information}</li>
             <li>操作 <a href="${pageContext.request.contextPath }/orders/buy?name=${item.name}&uname=${uname}&seller=${item.seller}">购买</a>
             </li>
             </details>
			</td>
			</tr>
    	</c:forEach>
</table>


</body>

</html>
