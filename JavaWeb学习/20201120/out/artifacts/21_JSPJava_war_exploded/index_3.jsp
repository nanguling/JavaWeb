
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int n1 = 100;
    int n2 = 200;
%>

<!--在JSP文件，通过输出标记，通知JSP将java变量的值写入到响应体中-->
变量n1的值是：<%=n1%><br>
变量n2的值是：<%=n2%><br>
<!--执行标记还可以通知JSP将运算结果写入到响应体中-->
n1+n2 = <%=n1+n2%><br>