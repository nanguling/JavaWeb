<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/4
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //实际开发过程中，pageContext数据油JSTL标签命令写入
    //由于还没有学习，演示中手动通过java命令写入
    //实际开发不存在这种
    pageContext.setAttribute("sex","男");
%>
性别:${pageScope.sex}