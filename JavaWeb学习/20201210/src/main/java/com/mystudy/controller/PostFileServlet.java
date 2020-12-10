package com.mystudy.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

@MultipartConfig
public class PostFileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Part namePart = request.getPart("userName");
        InputStream is = namePart.getInputStream();
        Scanner sc = new Scanner(is,"utf-8");
        String res = sc.next();
        System.out.println(res);

        Part imagePart = request.getPart("image");
        InputStream input = imagePart.getInputStream();
        OutputStream out = new FileOutputStream("D:\\biteJAVA\\JavaWeb\\20201210\\output.txt");

        byte[] buffer = new byte[1024];
        while (true) {
            int n = input.read(buffer);
            if (n == -1) {
                break;
            }
            out.write(buffer);
        }
        out.close();
    }

}
