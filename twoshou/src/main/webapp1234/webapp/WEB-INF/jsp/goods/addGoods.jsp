<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/29
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addGoods</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
    	body{
    		background-image: url(../pic/bj2.jpg);
    	}
    </style>
</head>
<div class="vertical-align-middle">
	<img src="../pic/logo2.png" alt="旭旭的网上二手交易平台">
</div>
<style type="text/css">
footer,h1{
text-align: center;
}
</style>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/goods/insert?uname=${uname}" method="post"  enctype="multipart/form-data">
    <h1>添加商品信息：</h1>
    <table width="100%" border=2 bgcolor="blanchedalmond">
        <tr id="tr1">
            <td>商品名字</td>
            <td>
                <input type="text" name="name"/></td>
            </td>
        </tr>
        <tr id="tr2">
            <td>商品价格</td>
            <td>
                <input type="text" name="price"/></td>
            </td>
        </tr>
        <tr id="tr3">
            <td>商品类型</td>
            <td>
                <select name="typeId">
                    <option>--请选择商品类型--</option>
                    <option value="1" selected="selected">高端消费品</option>
                    <option value="2" >低端消费品</option>
                    <option value="3">网游代练</option>
                    <option value="4">手游代练</option>

                </select>
            </td>
        </tr>
        <tr id="tr4">
            <td>商品图片</td>
            <td>
               <!-- <c:if test="${items.pic !=null}">
                    <img src="/pic/${items.pic}" width=100 height=100/>
                    <br/>
                </c:if>-->
                <input type="file" name="goods_pic"/>
            </td>
        </tr>
        <tr id="tr5">
            <td>商品信息</td>
            <td>
                <textarea rows="3" cols="30" name="information"></textarea>
            </td>
        </tr>




        <tr id="tr6">
            <td colspan="2" align="center"><input type="submit" value="添加留言"/>
            </td>
        </tr>
    </table>

</form>

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
