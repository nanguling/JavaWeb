package com.mystudy.comtroller;

import com.mystudy.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student(10,"mike");
        request.setAttribute("key",student);
        request.getRequestDispatcher("index_1.jsp").forward(request,response);
    }
}
