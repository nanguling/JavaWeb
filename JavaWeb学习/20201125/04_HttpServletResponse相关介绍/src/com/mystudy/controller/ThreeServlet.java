package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ThreeServlet extends HttpServlet {

    /**
     * 问题描述：Java<br/>Mysql<br/>HTML<br/> 浏览器将接收到的响应结果中的<br/>作为文字在窗口中
     *         展示出来，并没有把他当作HTML标签来执行
     * 问题原因：
     *         浏览器在接收到响应包之后，根据【content-type】属性的值，来采用对应编译器对
     *         【响应体中二进制数据】进行编译
     *
     *         在默认的情况下，content-type属性的值是‘text’ content-type = "text"
     *         此时浏览器会采用【文本编译器】对响应体中二进制数据进行编译解析
     * 解决方案：
     *         一定要在得到输出流之前，通过响应对象对响应头中conten-type属性进行一次重新的赋值
     *         指定浏览器采用正确编译器解析
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "Java<br/>Mysql<br/>HTML<br/>";//既有文字信息，又有html标签命令
        String str2 = "红烧排骨<br/>京酱肉丝<br/>麻辣火锅<br/>";
        //设置响应头中content-type属性
        response.setContentType("text/html;charset=utf-8");
        //向tomact索要输出流
        PrintWriter out = response.getWriter();
        //通过输出流写入到响应体中
        out.print(str);
        out.print(str2);
    }
}
