package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends HttpServlet {

    /**
     * 问题描述：浏览器接收到的数据是2，不是50
     * 问题原因：
     *          out.write方法可以将【字符】，【字符串】，【ASCII】码写入到响应体
     *          ASCII码：2 -------- 50
     * 解决方案：实际开发中，都是通过out.print方法将真实数据写入到响应体
     *
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int money = 50;//执行结果

        PrintWriter out = response.getWriter();
        //out.write(money);
        out.print(money);
    }
}
