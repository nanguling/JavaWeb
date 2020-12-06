package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//定义当前类为Servlet类（服务端java代码提供的Http服务）
//服务路径必须以 / 开头，tomcat启动就会报错
@WebServlet("/login_2")
public class LoginUseSessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        String userName,password;
        userName = req.getParameter("userName");
        password = req.getParameter("password");
        System.out.println("userNmae:"+userName+" password:"+password);
        PrintWriter out = resp.getWriter();
        //模拟用户名密码登录
        if("abc".equals(userName) && "123".equals(password)) {
            //获取Session对象（从服务端）
            //如果方法参数为true，表示如果没有取到已有的随机字符串（通行证），就创建一个
            //如果为false，没有就返回null
            //无参默认为true
            HttpSession session = req.getSession();
            session.setAttribute("user",String.format("userName=%s,password=%s",userName,password));
            out.println("登陆成功");
        }else {
            out.println("登陆失败");
        }

        out.flush();
        //关闭资源
        out.close();
    }
}
