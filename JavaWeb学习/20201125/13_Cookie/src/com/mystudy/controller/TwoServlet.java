package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends HttpServlet {
    static final int jiaozi = 30;
    static final int miantiao = 20;
    static final int gaifan = 15;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = null,money = null;
        //1.通过请求对象获取请求参数
        String food = request.getParameter("food");
        //2. 通过请求对象读取请求头中cookie
        Cookie[] cardArr = request.getCookies();
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //3.遍历数组得到cookie的共享数据
        int newMoney = 0;
        for (Cookie card:cardArr) {
            String key = card.getName();
            String value = card.getValue();
            if ("userNmae".equals(key)) {
                name = value;
            }else if ("money".equals(key)){
                money = value;
                newMoney = buy(Integer.valueOf(money),food);
                if (newMoney != -1) {
                    out.println(name + "顾客点餐：" + food + "成功! 余额：" + newMoney);
                } else {
                    out.println("余额不足，请充值后点餐！");
                    newMoney = Integer.valueOf(money);
                }
            }
        }
        //4.将余额填写进cookie，替换掉原来的
        Cookie newCard = new Cookie("money",newMoney+"");
        //5.将cooike通过响应对象写入响应头中推回给浏览器
        response.addCookie(newCard);
    }
    public int buy(int money,String food) {
        if ("饺子".equals(food)) {
            if (money < jiaozi) {
                return -1;
            }else {
                return money - jiaozi;
            }
        }else if ("面条".equals(food)) {
            if (money < miantiao) {
                return -1;
            }else {
                return money - miantiao;
            }
        }else if ("盖饭".equals(food)) {
            if (money < gaifan) {
                return -1;
            }else {
                return money - gaifan;
            }
        }
        return -1;
    }
}
