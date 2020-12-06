package com.mystudy.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext appliaction = request.getServletContext();

        appliaction.setAttribute("key1",100);//新增共享数据

        appliaction.setAttribute("key1",200);//更新共享数据

        appliaction.removeAttribute("key1");//删除共享数据

    }
}
