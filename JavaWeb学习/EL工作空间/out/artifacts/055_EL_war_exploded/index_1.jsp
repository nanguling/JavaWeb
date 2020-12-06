<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/4
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
http://localhost:8080/myweb/index_1.jsp?userName=mike&password=123
-->
来访者姓名:${param.userName}<br>
来访者密码:${param.password}
${paramValues}