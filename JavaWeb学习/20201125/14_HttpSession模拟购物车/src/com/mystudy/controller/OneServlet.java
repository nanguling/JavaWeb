package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.通过请求对象读取请求参数信息（得到商品名称）
        String goodsName = request.getParameter("goodsName");
        //2.向tomcat索要当前用户的私人储物柜HTTPsession
        HttpSession session = request.getSession();
        //3.将商品添加的私人储物柜即添加到购物车
        //由于要显示购物车里商品个数，首先要做个判断，是否为第一次放入该商品
        if (session.getAttribute(goodsName) == null) {
            //第一次添加该商品
            session.setAttribute(goodsName,1);
        }else {
            //不是第一次添加，则在上一次基础上数量加一
            int count = (int)session.getAttribute(goodsName)+1;
            session.setAttribute(goodsName,count);
        }
    }
}
