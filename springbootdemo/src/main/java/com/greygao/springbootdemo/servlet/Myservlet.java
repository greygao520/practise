package com.greygao.springbootdemo.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;

/**
 * @class name Myservlet
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/8 23:11
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/servlet",name = "Myservlet")
public class Myservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
        System.out.println("进入了myservlet");
//        super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("hello myservlet");
        writer.flush();
    }
}
