package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FourServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "http://www.baidu.com?username=mike";
        //通过响应对象,将地址赋值给响应头中的location属性
        response.sendRedirect(str);//[响应头 location="http://www.baidu.com"]
    }
    /**
     * 浏览器在接收到响应包之后，如果发现响应头中存在location属性，会自动通过地址栏向location所
     * 指定的网站发送请求
     *
     * sendRedirect方法远程控制浏览器请求行为【请求地址，请求方式，请求参数】
     */
}
