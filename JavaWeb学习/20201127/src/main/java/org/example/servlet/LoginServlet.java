package org.example.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dao.UserDao;
import org.example.entity.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//定义当前类为Servlet类（服务端java代码提供的Http服务）
//服务路径必须以 / 开头，tomcat启动就会报错
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");

        String userName,password;
        userName = req.getParameter("userName");
        password = req.getParameter("password");
        //System.out.println("userNmae:"+userName+" password:"+password);
        //作业：完成用户登录验证，返回JSON格式的数据
        UserDao ud = new UserDao();
        Login login = new Login(ud.login(userName,password));
        ObjectMapper mapper = new ObjectMapper();
        PrintWriter out = resp.getWriter();
        out.println(mapper.writeValueAsString(login));

        out.flush();
        //关闭资源
        out.close();
    }
}
