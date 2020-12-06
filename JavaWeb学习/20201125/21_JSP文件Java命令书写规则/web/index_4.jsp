<%@ page import="com.mystudy.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //创建Student类型的对象
    Student student = new Student(10,"tom");
    List list = new ArrayList();
%>

学员编号：<%=student.getId()%><br>
学员姓名：<%=student.getName()%><br>