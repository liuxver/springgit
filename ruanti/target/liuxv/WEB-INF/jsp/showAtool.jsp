
<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/6/12
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>showEtools</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
			body{
    		background-image: url(../../pic/bj.jpg); size: 100%;
    	}
    	li,h1,h2{
			text-align: center;
			}
			</style>
</head>
<body>

<h1>${list.size()}</h1>
<h2>商品列表：</h2>
<table width="100%" border=2 bgcolor="66ccff">
    <tr>
        <td>商品名字</td>
        <td>商品部门</td>

        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.name }</td>

                <c:if test="${item.type==1}"><td>大型建筑设备修理（Construction Device Repair）</td></c:if>
                <c:if test="${item.type==2}"><td>汽车修理（Automobile Repair）</td></c:if>
                <c:if test="${item.type==3}"><td>家电修理（Appliance Repair）</td></c:if>
                <c:if test="${item.type==4}"><td>计算机修理（Computer Repair）</td></c:if>




            <td><a href="${pageContext.request.contextPath }/Atoolorder/insert?user=${user.id}">注销</a></td>

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
