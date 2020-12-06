
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%
        //在JSP文件中，只有书写在这个执行标记中内容才会被当作java命令
        //1.声明java变量
        int num1 = 100;
        int num2 = 200;
        //2.声明运算表达式:数学运算，关系运算，逻辑运算
        int num3 = num1 + num2;//数学运算
        int num4 = num1 < num2 ? num1 : num2;//关系运算
        boolean num5 = num1 < num2;//逻辑运算
        //3.声明控制语句
        if (num3 > num1) {

        }else {

        }
        for (int i = 0; i < 10; i++) {

        }
    %>
