<%@ page import="com.mystudy.entity.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--制造数据-->
<%
    Student student1 = new Student(1,"tom");
    Student student2 = new Student(2,"mike");
    Student student3 = new Student(3,"allen");
    List<Student> list = new ArrayList<>();
    list.add(student1);
    list.add(student2);
    list.add(student3);
%>

<!--数据输出-->
<table border="2" align="center">
    <tr>
        <td>学员编号</td>
        <td>学员姓名</td>
    </tr>
    <%
        for(Student student:list) {
    %>
            <tr>
                <td><%=student.getId()%></td>
                <td><%=student.getName()%></td>
            </tr>
    <%
        }
    %>
</table>