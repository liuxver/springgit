<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/29
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>showTalksUser</title>

</head>
<body background="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525427969514&di=67961a76982a7e887da459bc29461ce7&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F15%2F88%2F32%2F10q58PICGW8_1024.jpg">
<h1><font size="5" color="B5B5B5">Welcome，${uname}</font></h1>
<a href="/user/backhome?name=${uname}" >回到主页面</a>
<h2 class="agileits w3 wthree w3-agile w3-agileits agileinfo agile"> <font size="4.5" color="B5B5B5">留言</font></h2>
<div class="content-w3ls agileits w3 wthree w3-agile w3-agileits agileinfo agile">
    <form action="${pageContext.request.contextPath }/talks/addTalks?uname=${uname}"  method="post" class="form-agileits" enctype="multipart/form-data">
        <h3>LEAVE MESSAGE</h3>

        <textarea id="words" name="words" placeholder="YOUR MESSAGE" title="Please enter Your Comments"></textarea>
        <input type="submit" class="sign-in" value="提交">
    </form>


       <table width="100%" style="border-style:none" border=hidden bgcolor="blanchedalmond" margin=auto>
           留言列表
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



               </tr>
           </c:forEach>

       </table>
</div>
</table>
</body>
</html>
