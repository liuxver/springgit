<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" /> 
<title>register</title> 
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
 
<body> 
<div id="formwrapper"> 
 
<h1>register</h1> 
<h3>Unregistered account</h3> 
    <form action="${pageContext.request.contextPath }/user/register" method="post"> 
    <fieldset> 
        <legend>register</legend> 
        <div> 
            <label>username</label> 
            <input type="text" name="name" id="Name" size="18" maxlength="30" value="${user.name }" /><br /> 
        </div> 
        <div> 
            <label>password</label> 
            <input type="password" name="password" id="password" size="18" maxlength="15" value="${user.password }" /><br /> 
        </div>     
        <input name="login791" type="submit" class="buttom" value="register" />  
    </fieldset> 
    </form><br /> 
    
   </div>     
</body> 
</html> 