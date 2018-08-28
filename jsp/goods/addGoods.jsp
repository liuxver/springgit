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
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/goods/insert?uname=${uname}" method="post"  enctype="multipart/form-data">
    添加商品信息：
    <table width="100%" border=1>
        <tr>
            <td>商品名字</td>
            <td>
                <input type="text" name="name"/></td>
            </td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td>
                <input type="text" name="price"/></td>
            </td>
        </tr>
        <tr>
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
        <tr>
            <td>商品图片</td>
            <td>
               <!-- <c:if test="${items.pic !=null}">
                    <img src="/pic/${items.pic}" width=100 height=100/>
                    <br/>
                </c:if>-->
                <input type="file" name="goods_pic"/>
            </td>
        </tr>
        <tr>
            <td>商品信息</td>
            <td>
                <textarea rows="3" cols="30" name="information"></textarea>
            </td>
        </tr>




        <tr>
            <td colspan="2" align="center"><input type="submit" value="添加留言"/>
            </td>
        </tr>
    </table>

</form>

</body>
</html>
