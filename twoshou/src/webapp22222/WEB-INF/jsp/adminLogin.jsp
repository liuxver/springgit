<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/29
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>adminLogin</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css.css"/>
		<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<div class="vertical-align-middle">
	<img src="pic/logo2.png" alt="旭旭的网上二手交易平台">
</div>
<style type="text/css">
form,summary,footer{
text-align: center;
}
</style>
<body>
	<div id = 'test'></div>
<style>
#test{
    width：300px;

    height:500px;

    background:url('pic/gw4.jpg')no-repeat;
}
</style>
<br />
<details>
	<summary><font color="black" size="5">**************************管理员登陆请点击此处*************************</font></summary>
<form action="${pageContext.request.contextPath }/user/adminLogin" method="post">
    <div>
        <label><font color="blueviolet" size="5">管理员用户名:</font></label>
        <input class="form-control" type="text" name="name" value="${user.name }"/><br/>
    </div>
    <div>
        <label><label><font color="blueviolet" size="5">管理员密码:</font></label>
        <input class="form-control" type="password" name="password" value="${user.password }"><br/>
    </div>
    <input  type="submit" value="登陆"/>
    <br>

</form>
</details>

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
