<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/6/27
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %><html>
<head>
    <title>homd</title>
</head>
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
<body>
<h1>hello,${user}</h1>
<h1>账号列表：</h1>
<table width="100%" border=2 bgcolor="#adff2f">
    <tr>
        <td>账号名</td>
        <td>余额</td>

        <td>操作</td>
    </tr>
    <c:forEach items="${list }" var="item">
        <tr>
            <td>${item.account}</td>
            <td>${item.money }</td>




            <td><a href="${pageContext.request.contextPath }/user/withdraw?account=${item.account}&user=${user}">取款</a></td>

        </tr>
    </c:forEach>

</table>

<hr/>
<form action="${pageContext.request.contextPath }/user/create?user=${user}" method="post">

    <div>
        <label>账号名:</label>
        <input class="form-control" type="text" name="account"><br/>
    </div>
    <input  type="submit" value="创建账户"/>

</form>
</body>
</html>
