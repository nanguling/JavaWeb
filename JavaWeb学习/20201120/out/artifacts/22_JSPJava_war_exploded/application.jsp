<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/2
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
    ServletContext application：全局作用域对象
    同一个网站中Servlet与JSP，都可通过当前网站中全局作用域对象实现数据共享
    JSP文件中内置对象：application
-->

<%
    application.setAttribute("key1","HelloWorld");
%>