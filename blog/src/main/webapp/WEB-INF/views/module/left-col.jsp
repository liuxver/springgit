<%--
  Created by IntelliJ IDEA.
  User: 444
  Date: 2018/5/10
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="left-col">
    <div class="overlay"></div>
    <div class="intrude-less">
        <header id="header" class="inner">
            <a href="${pageContext.request.contextPath}" class="profilepic">
                <img src="http://tva3.sinaimg.cn/crop.0.0.750.750.180/69f4eca0jw8fa118uqadsj20ku0kuab0.jpg">
            </a>
            <hgroup>
                <h1 class="header-author"><a href="${pageContext.request.contextPath}">liuxv</a></h1>
            </hgroup>
            <p class="header-subtitle">生命本是一场孤独的旅行。</p>
            <ul class="nav nav-pills nav-stacked">
                <li><a href="${pageContext.request.contextPath}">主页</a></li>
                <li><a href="/instagram">相册</a></li>
                <li><a href="/archives">资源</a></li>
            </ul>

            <nav class="header-smart-menu" id="tools-cols">
                <div class="panel">
                    <a class="js-smart-menu" data-toggle="collapse"
                       data-parent="#tools-cols" href="#tools-wrap1">文章列表</a>
                    <div id="tools-wrap1" class="collapse"></div>

                    <a class="js-smart-menu" data-toggle="collapse"
                       data-parent="#tools-cols" href="#tools-wrap2">标签</a>
                    <div id="tools-wrap2" class="collapse"></div>

                    <a class="js-smart-menu" data-toggle="collapse"
                       data-parent="#tools-cols" href="#tools-wrap3">关于我</a>
                    <div id="tools-wrap3" class="collapse"></div>
                </div>
            </nav>
            <div class="header-nav">
                <div class="social">
                    <a class="glyphicon glyphicon-envelope " style="font-size: xx-large;margin-right: 10px;"
                       target="_blank"
                       href="mailto:liuxver444@gmail.com" data-toggle="tooltip" title="email"></a>
                    <a class="glyphicon glyphicon-cloud" style="font-size: xx-large;margin-right: 10px;"
                       target="_blank"
                       href="http://github.com/liuxver" data-toggle="tooltip" title="github"></a>
                    <a class="glyphicon glyphicon-book" style="font-size: xx-large" target="_blank"
                       href="javascript:void(0)" data-toggle="tooltip" title="book"></a>
                </div>
            </div>
        </header>
    </div>
</div>

