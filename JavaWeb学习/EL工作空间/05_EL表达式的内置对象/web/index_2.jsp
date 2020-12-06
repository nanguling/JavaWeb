<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/4
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
    http://localhost:8080/myweb/index_2.jsp?pageNo=1&pageNo=2&pageNo=3
-->
第一个值:${paramValues.pageNo[0]}<br>
第二个值:${paramValues.pageNo[1]}<br>
第三个值:${paramValues.pageNo[2]}