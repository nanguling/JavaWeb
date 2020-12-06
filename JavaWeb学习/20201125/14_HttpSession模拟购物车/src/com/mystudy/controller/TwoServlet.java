package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

public class TwoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过当前用户的私人储物柜得到共享数据（得到购物车里商品及数量）
        HttpSession session = request.getSession();
        //将session中所有的key读取出来，存放到一个枚举对象
        Enumeration<String> goodsNames = session.getAttributeNames();
        while (goodsNames.hasMoreElements()) {
            String goodsName = goodsNames.nextElement();
            int count =(int) session.getAttribute(goodsName);
            System.out.println("商品："+goodsName+" 商品数量："+count+"件");
        }
    }
}
