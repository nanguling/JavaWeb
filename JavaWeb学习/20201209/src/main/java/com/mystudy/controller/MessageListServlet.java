package com.mystudy.controller;

import com.mystudy.dao.MessageDao;
import com.mystudy.test.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MessageListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List list = MessageDao.select();
        String s = Test.fun(list);
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(s);
    }

}
