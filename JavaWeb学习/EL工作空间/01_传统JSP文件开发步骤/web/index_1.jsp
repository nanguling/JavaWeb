<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/4
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Integer id = (Integer) application.getAttribute("sid");
    String name = (String) session.getAttribute("sname");
    String home = (String) request.getAttribute("home");
%>
学员id:<%=id%><br>
学员姓名：<%=name%><br>
学员地址：<%=home%><br>
<hr/>
学员ID:${applicationScope.sid}<br>
学员姓名:${sessionScope.sname}<br>
学院住址:${requestScope.home}<br>