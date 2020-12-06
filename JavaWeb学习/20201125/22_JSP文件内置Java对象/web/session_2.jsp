<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/2
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
    session_1.jsp与session_2.jsp为同一个用户/浏览器提供相关的服务
    因此可以使用当前用户在服务端的私人储物柜进行数据共享
-->
<%
    Integer res = (Integer) session.getAttribute("key1");
%>
session_2.jsp从当前用户读取的共享数据值是:<%=res%>