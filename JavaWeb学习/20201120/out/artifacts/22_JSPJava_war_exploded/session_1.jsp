<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/2
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
    JSP文件内置对象：session
              类型：HttpSession
              作用：JSP文件在运行时，可以通过session指向当前用户的私人储物柜，添加/读取共享数据
-->
<!--
    将共享数据添加到当前用户私人储物柜中
-->
<%
    //JSP执行时会向tomcat索要私人储物柜：HttpSession session = request。getSession();
    session.setAttribute("key1",200);
%>