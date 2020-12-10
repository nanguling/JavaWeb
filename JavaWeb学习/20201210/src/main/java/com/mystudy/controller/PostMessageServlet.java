package com.mystudy.controller;

import com.mystudy.dao.MessageDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PostMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //读取请求参数信息
        String who = request.getParameter("who");
        String what = request.getParameter("what");
        //调用Dao执行相关操作
        MessageDao.insert(who,what);
        //通过请求转发向tomcat申请调用index1.html
        request.getRequestDispatcher("/index1.html").forward(request,response);
    }
}
