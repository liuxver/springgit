<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/6/12
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
    	li,form,div{
			text-align: center;
			}
			<!-- 
body { 
    font-family: Arial, Helvetica, sans-serif; 
    font-size:12px; 
    color:#666666; 
    background:#fff; 
    text-align:center; 
 
} 
 
* { 
    margin:0; 
    padding:0; 
} 
 
a { 
    color:#1E7ACE; 
    text-decoration:none;     
} 
 
a:hover { 
    color:#000; 
    text-decoration:underline; 
} 
h3 { 
    font-size:14px; 
    font-weight:bold; 
} 
 
pre,p { 
    color:#1E7ACE; 
    margin:4px; 
} 
input, select,textarea { 
    padding:1px; 
    margin:2px; 
    font-size:11px; 
} 
.buttom{ 
    padding:1px 10px; 
    font-size:12px; 
    border:1px #1E7ACE solid; 
    background:#D0F0FF; 
} 
#formwrapper { 
    width:450px; 
    margin:15px auto; 
    padding:20px; 
    text-align:left; 
    border:1px #1E7ACE solid; 
} 
 
fieldset { 
    padding:10px; 
    margin-top:5px; 
    border:1px solid #1E7ACE; 
    background:#fff; 
} 
 
fieldset legend { 
    color:#1E7ACE; 
    font-weight:bold; 
    padding:3px 20px 3px 20px; 
    border:1px solid #1E7ACE;     
    background:#fff; 
} 
 
fieldset label { 
    float:left; 
    width:120px; 
    text-align:right; 
    padding:4px; 
    margin:1px; 
} 
 
fieldset div { 
    clear:left; 
    margin-bottom:2px; 
} 
 
.enter{ text-align:center;} 
.clear { 
    clear:both; 
} 
body{
    		background-image: url(../../pic/bj.jpg); size: 100%;
    	} 
--> 
			</style>
</head>
<body>
<div id="formwrapper"> 
 
<h1>login</h1>
<h3>Registered account</h3>
<form action="${pageContext.request.contextPath }/user/login" method="post">
	<fieldset> 
        <legend>login</legend>
    <div>
        <label>userId:</label>
        <input class="form-control" type="text" name="id" /><br/>
    </div>
    <div>
        <label>password:</label>
        <input class="form-control" type="password" name="password"><br/>
    </div>
    <input  type="submit" value="用户登录"/>

<br />
</form>
<div class="product_list_met_16_1 met-index-body text-xs-center     bgcolor" m-id='3'>
	<div class="container">
		<h2 class="m-t-0 font-weight-300 invisible" data-plugin="appear" data-animate="slide-top" data-repeat="false">Homework for software architecture!</h2>
		<p class="desc m-b-0 font-weight-300 invisible" data-plugin="appear" data-animate="fade" data-repeat="false">You are best!.</p>
		</div>
			<!--
      <img src="pic/kl.jpg" width="250" height="200" />
			-->
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