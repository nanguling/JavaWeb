<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/4
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--传统java命令实现关系运算输出-->
<%
    String age = (String)request.getAttribute("age");
    if (Integer.valueOf(age) < 18) {
%>
欢迎光临<br>
<%
    }else {
%>
滚蛋<br>
<%
    }
%>

EL表达式输出关系运算结果:${age lt 18 ? "欢迎":"滚蛋"}<br>