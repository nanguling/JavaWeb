package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends HttpServlet {
    //TOD
    private Integer count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //记录访问次数
        this.count++;
        String name = request.getParameter("name");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"utf-8\">\n" +
                "\t\t<title>个人标签</title>\n" +
                "\t\t<link rel=\"stylesheet\" href=\"/myweb/css/style.css\">\n" +
                "\t</head>\n" +
                "\t<body background=\"/myweb/image/薇姐.jpg\">\n" +
                "\t\t<h1 align=\"center\" style=\"font-size: 100px;color: red\">"+name+"</h1>\n" +
                "\t\t<div>访问次数:"+this.count+"</div>\n"+
                "\t\t<div class=\"lll\">\n" +
                "\t\t\t<h2>爱好</h2>\n" +
                "\t\t\t<ol>\n" +
                "\t\t\t\t<li>吃</li>\n" +
                "\t\t\t\t<li>喝</li>\n" +
                "\t\t\t\t<li>玩</li>\n" +
                "\t\t\t</ol>\n" +
                "\t\t</div>\n" +
                "\t\t<div>\n" +
                "\t\t\t<h3>梦想</h3>\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li>摸鱼</li>\n" +
                "\t\t\t\t<li>更好的摸鱼</li>\n" +
                "\t\t\t\t<li>天天摸鱼</li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t\t<div>\n" +
                "\t\t\t<a href=\"http://www.baidu.com\" target=\"_blank\">百度</a>\n" +
                "\t\t</div>\n" +
                "\t</body>\n" +
                "</html>");
        /*String content = template.replace(":name:",name);//替换占位符
        out.println(content);*/
    }
}
