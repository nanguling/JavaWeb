package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class TwoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.通过请求对象获得当前【请求头】中[所有请求参数】的名称
        Enumeration paraNames = request.getParameterNames();//将所有请求参数名称保存到一个枚举对象进行返回
        while (paraNames.hasMoreElements()) {
            String paraName = (String) paraNames.nextElement();
            //2.通过请求对象读取指定的请求参数的值
            String value = request.getParameter(paraName);
            System.out.println("当前请求参数名称:" + paraName + " 当前请求参数的值:" + value);
        }
    }
}
