<!doctype html>
<html>
<head>
<title>message</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Sublime Contact Form Widget Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- fonts -->
<link href="http://fonts.googleapis.com/css?family=Nunito:300,400,700" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Muli:300,400" rel="stylesheet">
<!-- /fonts -->
<!-- css -->
<link href="css/new_file.css" rel='stylesheet' type='text/css' media="all" />
<!-- /css -->
</head>
<body style=
	"background-image:url(https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525427969514&di=67961a76982a7e887da459bc29461ce7&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F15%2F88%2F32%2F10q58PICGW8_1024.jpg);"
>
<h1><font size="5" color="B5B5B5">Welcome，${uname}</font></h1>
<h2 class="agileits w3 wthree w3-agile w3-agileits agileinfo agile"> <font size="4.5"color="B5B5B5">留言</font></h2>
<div class="content-w3ls agileits w3 wthree w3-agile w3-agileits agileinfo agile">
<table width="100%" border=hidden  style="border-style:none">
    <tr>
        <td style="border-style:none">留言编号</td>
        <td style="border-style:none">留言人</td>
        <td style="border-style:none">留言日期</td>
        <td style="border-style:none">留言内容</td>
    </tr>
    <c:forEach items="${talksList }" var="item">
        <tr>
            <td style="border-style:none">${item.id }</td>
            <td style="border-style:none">${item.talkerName }</td>
            <td style="border-style:none">${item.date }</td>
            <td style="border-style:none">${item.words}</td>
            
            <td style="border-style:none"><a href="${pageContext.request.contextPath }/user/delete?name=${item.name}">删除</a></td>


        </tr>
    </c:forEach>

</table>



</div>
</table>
</body>
</html>