<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/7
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    //声明一个类中属性
    private Integer count = 0;
%>
<%
    this.count++;
%>
<html>
<head>
    <meta charset="utf-8">
    <title>个人标签</title>
    <link rel="stylesheet" href="/myweb/css/style.css">
</head>
<body background="/myweb/image/薇姐.jpg">
<h1 align="center" style="font-size: 100px;color: red">${param.name}</h1>
<div>访问次数：<%=this.count%></div>
<div class="lll">
    <h2>爱好</h2>
    <ol>
        <li>吃</li>
        <li>喝</li>
        <li>玩</li>
    </ol>
</div>
<div>
    <h3>梦想</h3>
    <ul>
        <li>摸鱼</li>
        <li>更好的摸鱼</li>
        <li>天天摸鱼</li>
    </ul>
</div>
<div>
    <a href="http://www.baidu.com" target="_blank">百度</a>
</div>
</body>
</html>