package com.supremepole.springbootservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * CodeCoderCoding
 */
@WebServlet("/servlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        doPost(req,resp);
        HttpSession httpSession=req.getSession();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("website->"+req.getParameter("website"));
    }
}
