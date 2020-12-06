<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/4
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--将作用域对象中共享数读取出来相加，将相加的结果写入到响应体中-->
<%
    String key1 =(String) request.getAttribute("key1");
    String key2 =(String) request.getAttribute("key2");
    int num = Integer.parseInt(key1) + Integer.parseInt(key2);
%>
输出结果:<%=key1+key2%><br>