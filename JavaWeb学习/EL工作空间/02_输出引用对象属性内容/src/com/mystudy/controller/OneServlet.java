package com.mystudy.controller;

import com.mystudy.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建引用类型实例对象
        Student student = new Student(10,"mike");
        //2.将引用类型对象存入到请求作用域对象中，作为共享数据
        request.setAttribute("key",student);
        //3.请求转发向tomcat申请调用index_1.jsp
        request.getRequestDispatcher("/index_1.jsp").forward(request,response);
    }
}
