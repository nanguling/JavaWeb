package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.向当前用户session中添加一个共享数据
        HttpSession session = request.getSession();
        //2.向当前session中添加共享数据
        session.setAttribute("key","呜呜呜");
        //3.向当前请求作用域对象添加共享数据
        request.setAttribute("key","嘻嘻嘻");
        //4.请求转发申请调用index_1.jsp
        request.getRequestDispatcher("/index_1.jsp").forward(request,response);
    }
}
