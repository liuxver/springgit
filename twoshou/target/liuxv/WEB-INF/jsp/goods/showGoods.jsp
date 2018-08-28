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
    <style type="text/css">

    </style>
</head>
<div class="vertical-align-middle">

</div>
<style type="text/css">
footer,h1{
text-align: center;
}
</style>
<body background="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525427969514&di=67961a76982a7e887da459bc29461ce7&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F15%2F88%2F32%2F10q58PICGW8_1024.jpg">

<br/>
<h1>商品列表：</h1>
<table width="100%" border=2 bgcolor="blanchedalmond">
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
            <c:if test="${item.status==1}"><td>未出售</td>
                <td>${item.information}</td>
                <td><a href="${pageContext.request.contextPath }/goods/delete?name=${item.name}">删除</a></td>
            </c:if>
            <c:if test="${item.status==2}"><td>已经售出</td>
            <td>${item.information}</td>
            <td>不可删除</td>
            </c:if>

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
