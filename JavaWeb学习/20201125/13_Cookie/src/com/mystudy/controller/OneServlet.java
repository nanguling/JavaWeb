package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用请求对象读取请求头中参数信息
        String name = request.getParameter("userName");
        String money = request.getParameter("money");
        //2.创建cookie对象保存保存共享数据
        Cookie card1 = new Cookie("userName",name);
        Cookie card2 = new Cookie("money",money);
        //3.响应对象将cookie写入到响应协议包响应头中
        response.addCookie(card1);
        response.addCookie(card2);
        //3.通过请求对象请求转发点餐界面给浏览器
        request.getRequestDispatcher("/index2.html").forward(request,response);
    }
}
