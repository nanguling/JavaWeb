package com.mystudy.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.通过tomcat得到当前网站中全局作用域对象
        ServletContext application = request.getServletContext();
        //2.通过全局作用域对象得到指定关键字对应的共享数据
        String food = (String) application.getAttribute("key1");
    }
}
