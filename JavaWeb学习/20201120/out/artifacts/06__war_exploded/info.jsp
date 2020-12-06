
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
<body style="color:red;font-size: 40px">
    <center>
        <%
            String res =(String) request.getAttribute("info");
        %>
        <%=res%><br>
    </center>
</body>

</head>
