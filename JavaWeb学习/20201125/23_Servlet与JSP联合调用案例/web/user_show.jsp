<%@ page import="com.mystudy.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/2
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //从请求作用域对象得到OneServlet添加进去的共享数据
    List<Student> list = (List) request.getAttribute("key1");
%>
<!--将处理结果写入到响应体中-->
<table border="2" align="center">
    <tr>
        <td>学员编号</td>
        <td>学员姓名</td>
    </tr>
    <%
        for (Student student:list) {
    %>
            <tr>
                <td><%=student.getId()%></td>
                <td><%=student.getName()%></td>
            </tr>
    <%
        }
    %>
</table>