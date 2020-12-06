package com.mystudy.controller;

import com.mystudy.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OneServlet extends HttpServlet {
    //处理业务，得到结果-----查询学员信息
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student1 = new Student(10,"mike");
        Student student2 = new Student(20,"tom");
        Student student3 = new Student(30,"allen");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        request.setAttribute("key1",list);
        request.getRequestDispatcher("/user_show.jsp").forward(request,response);
    }
}
