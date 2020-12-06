package com.study.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.将数据添加到请求作用域对象中作为共享数据
        request.setAttribute("key1","涮牛肚");
        //2.通过请求转发方案代替浏览器向tomcat申请访问TwoServlet
        request.getRequestDispatcher("/two").forward(request,response);
    }
}
