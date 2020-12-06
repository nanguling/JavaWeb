package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 子类继承父类，父类实现A接口
 * 子类也是A接口的实现类
 *
 * 抽象类作用：降低接口实现类与接口之间实现的难度
 *          接口实现类不需要实现的方法交给抽象类来完成
 *          接口实现类只需要实现需要的方法
 * Servlet接口：只有service（）方法有用
 * tomcat根据Servlet规范调用Servlet接口实现类规则：
 *          1.tomcat有权创建Servlet接口实现类实例对象
 *              Servlet oneServlet = new OneServlet();
 *          2.tomcat根据实例对象调用servlet方法处理当前请求
 *              servlet.service();，此时service（）方法中this就是子类实例对象
 * oneServlet继承于HttpServlet（抽象类）继承于GenericServlet（抽象类）实现了Servlet接口
 *
 * 通过父类来决定在何种情况下调用子类中方法---【设计模式种】---模板设计模式
 * HttpServlet：service（）if（请求方式==get）---this.doGet() else if(请求方式==post)---this.doPost
 * OneServlet：doGet  doPost
 * Servlet oneServlet = new OneServlet();
 * servlet.service();
 */
public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送GET请求方式处理");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送POST请求方式处理");
    }
}
