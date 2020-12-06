
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String id =(String) request.getParameter("id");
%>
<center>
    <form action="/myweb/question/update" method="get">
        <table border="2">
            <tr>
                <td>题目编号：</td>
                <td><input type="text" name="id" value="<%=Integer.valueOf(id)%>" readonly></td>
            </tr>
            <tr>
                <td>题目：</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>A：</td>
                <td><input type="text" name="optionA"></td>
            </tr>
            <tr>
                <td>B：</td>
                <td><input type="text" name="optionB"></td>
            </tr>
            <tr>
                <td>C：</td>
                <td><input type="text" name="optionC"></td>
            </tr>
            <tr>
                <td>D：</td>
                <td><input type="text" name="optionD"></td>
            </tr>
            <tr>
                <td>正确答案</td>
                <td><input type="radio" name="answer" value="A">A
                    <input type="radio" name="answer" value="B">B
                    <input type="radio" name="answer" value="C">C
                    <input type="radio" name="answer" value="D">D
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="更新试题"></td>
                <td><input type="reset"></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
