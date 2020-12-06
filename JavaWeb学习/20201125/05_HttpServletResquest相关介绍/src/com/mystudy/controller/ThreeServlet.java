package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 问题：以get方式发送中文参数内容时，可以得到正常的结果
 *      当以post方式发送中文参数内容时，得到的结果乱码
 *
 * 原因：浏览器以get方式发送请求，请求参数保存在【请求头】中，在Http服务器请求协议包到达Http服务器之后
 *      第一件事就是进行解码；【请求头】中二进制内容由tomcat负责解码，tomcat默认使用utf-8字符集
 *
 *      浏览器以post方式发送请求，请求参数保存在【请求体】中，在Http服务器请求协议包到达Http服务器之后
 *      第一件事就是进行解码；【请求体】中二进制内容由当前请求对象(request)负责解码，request默认使用
 *      [ISO-8859-1]字符集，此时如果请求体中参数内容是中文，将无法解码只能乱码
 *
 * 解决：post请求方式下，在读取请求体的内容之前，应该通知请求对象采用utf-8字符集对请求体中内容进行
 *      重新解码
 *
 *
 */
public class ThreeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通知请求对象，使用utf-8字符集对请求体中二进制内容进行重新解码
        request.setCharacterEncoding("utf-8");
        //通过请求对象读取【请求体】中参数信息
        String value = request.getParameter("userName");
        System.out.println("从请求体中得到的参数："+value);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过请求对象读取【请求头】中参数信息
        String usrName = request.getParameter("userName");
        System.out.println("从请求头中得到的参数："+usrName);
    }
}
