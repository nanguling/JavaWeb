<%@ page import="com.mystudy.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/4
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--传统写法-->
<%
     Student student = (Student)request.getAttribute("key");
%>
学员编号：<%=student.getId()%><br>
学员姓名：<%=student.getName()%>
<hr/>
学员编号:${requestScope.key.id}<br><!--id来自于Student类属性名，大小写要完全一致-->
学员姓名:${requestScope.key.name}