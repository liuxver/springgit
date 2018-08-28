<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" /> 
<title>login</title> 
<style type="text/css"> 
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
 
--> 
</style> 
</head>

<body style="background-image:url(https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525427969514&di=67961a76982a7e887da459bc29461ce7&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F15%2F88%2F32%2F10q58PICGW8_1024.jpg);">

<div id="formwrapper"> 
 
<h1>login</h1> 
<h3>Registered account</h3> 
    <form action="${pageContext.request.contextPath }/user/login" method="post"> 
    <fieldset> 
        <legend>login</legend> 
        <div> 
            <label>username</label> 
            <input type="text" name="name" id="Name" size="18" maxlength="30" value="${user.name }" /><br /> 
        </div> 
        <div> 
            <label>password</label> 
            <input type="password" name="password" id="password" size="18" maxlength="15" value="${user.password }" /><br /> 
        </div>     
        <input name="login791" type="submit" class="buttom" value="login" />  
    </fieldset> 
     <a href="/register" name="">register</a>&nbsp&nbsp&nbsp&nbsp
    <a href="/adminLogin">adminLogin</a>
    </form><br /> 
    
   </div>     
</body> 
</html> 