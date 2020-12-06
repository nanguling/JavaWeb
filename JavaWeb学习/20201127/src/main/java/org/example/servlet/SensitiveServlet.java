package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SensitiveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //敏感资源需要使用flase，如果没有就返回null
        HttpSession session = request.getSession(false);

        PrintWriter out = response.getWriter();
        if (session == null) {//用户没有登陆
            response.setStatus(401);
            out.println("没有登录，不允许访问");
        }else {
            //伪代码
            /*User user = request.getAttribute("user");
            if (user.允许访问路径的资源不包含当前访问的服务路径) {
                response.setStatus(403);
                out.println("没有权限，禁止访问");
            }else {

            }*/
            out.println("登陆成功");
        }
    }

}
