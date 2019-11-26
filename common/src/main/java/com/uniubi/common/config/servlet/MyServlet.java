package com.uniubi.common.config.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/20
 * @Description: myservlet
 */
//@WebServlet
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = -7065225333955070667L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("这是doget方法！！！");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>大家好，我的名字叫Servlet</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
