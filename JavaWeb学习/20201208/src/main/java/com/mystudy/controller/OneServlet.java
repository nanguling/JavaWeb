package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    static Integer count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        count++;
        response.setContentType("text/html;charset=utf-8");
        request.setAttribute("key",count);
        request.getRequestDispatcher("index6.jsp").forward(request,response);
    }
}
