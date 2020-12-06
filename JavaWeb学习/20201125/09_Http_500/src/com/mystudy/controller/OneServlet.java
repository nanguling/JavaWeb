package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map map = new HashMap();
        //int tmp = (int) map.get("key1");//抛出空指针异常
        Integer num = (Integer) map.get("key1");
        System.out.println("ssss");
        //int a = null //null不可能赋值给int类型
        Integer a = null;//所有高级引用类型都可以赋值为null
    }
}
