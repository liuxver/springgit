<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/6/16
  Time: 0:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %><html>
<head>
    <title>checkOrders</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
			body{
    		background-image: url(../../pic/bj.jpg); size: 100%;
    	}
    	li,form,div{
			text-align: center;
			}
			</style>
</head>
<body>

订单列表：
<table width="100%" border=2 bgcolor="66ccff">
    <tr>
        <td>订单id</td>
        <td>工具id</td>
        <td>用户id</td>
        <td>订单日期 </td>
        <td>订单状态</td>

        <td>操作</td>
    </tr>
    <c:forEach items="${list }" var="item">
        <tr>
            <td>${item.id }</td>
            <td>${item.btoolid }</td>
            <td>${item.uid}</td>
            <td>${item.data }</td>
            <td>${item.status }</td>

                <c:if test="${item.status==0}"><td>待审核</td></c:if>

            <td><a href="${pageContext.request.contextPath }/orders/checkPass?id=${item.id}&user=${user.id}">通过审核</a></td>

        </tr>
    </c:forEach>

</table>

<div class="product_list_met_16_1 met-index-body text-xs-center     bgcolor" m-id='3'>
	<div class="container">
		<h2 class="m-t-0 font-weight-300 invisible" data-plugin="appear" data-animate="slide-top" data-repeat="false">Homework for software architecture!</h2>
		<p class="desc m-b-0 font-weight-300 invisible" data-plugin="appear" data-animate="fade" data-repeat="false"></p>
			<div class='nav-tabs-horizontal nav-tabs-inverse nav-tabs-animate' data-plugin="tabs">
			</div>
			
</div>

        <footer class='foot_info_met_16_1 met-foot p-y-20 border-top1' m-id='6' m-type='foot'>
	<div class="container text-xs-center">
		    		<p></p>
				    		    		    		<div class="powered_by_metinfo">
			Powered by 1007大家伙 <b><a></a></b> &copy;2008-2018 &nbsp;<a></a>		</div>
		<ul class="met-langlist p-0">
		    		    	    </ul>
	</div>
</footer>
<script src="https://show.metinfo.cn/m/mui109/382/public/ui/v2/static/js/basic.js"></script>
<script src="https://show.metinfo.cn/m/mui109/382/templates/mui109/file/templates/mui109/cache/index.js?1523527621"></script>
</body>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?cc82bbdc50ef2041ec5336024c24d11a";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
</html>
