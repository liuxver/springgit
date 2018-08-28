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

<style type="text/css">
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

--> 
form,summary,footer{
text-align: center;
}
</style>

<body background="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525427969514&di=67961a76982a7e887da459bc29461ce7&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F15%2F88%2F32%2F10q58PICGW8_1024.jpg">

<details>
	<summary><font color="black" size="5">**************************管理员登陆请点击此处*************************</font></summary>
<div id="formwrapper"> 
 
<h1>login</h1>
<h3>Registered account</h3>
<form action="${pageContext.request.contextPath }/user/adminLogin" method="post">
<fieldset> 
        <legend>login</legend>
    <div>
        <label>管理员用户名:</font></label>
        <input class="form-control" type="text" name="name" value="${user.name }"/><br/>
    </div>
    <div>
        <label>管理员密码:</font></label>
        <input class="form-control" type="password" name="password" value="${user.password }"><br/>
    </div>
    <input  type="submit" value="登陆"/>
    <br>

</form>
</details>

</body>
<footer class='foot_info_met_16_1 met-foot p-y-20 border-top1' m-id='6' m-type='foot'>
	<div class="container text-xs-center">
		    		<p></p>
				    		    		    		<div class="powered_by_metinfo">
			Powered by 1007大家伙 <b><a>好人好梦</a></b> &copy;2008-2018 &nbsp;<a>好人好梦</a>		</div>
		<ul class="met-langlist p-0">
		    		    	    </ul>
	</div>
</footer>
</html>
