package com.wangbowen.controller;

import com.wangbowen.util.JdbcUtil;
import com.wangbowen.entity.LoginUsers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String ID = request.getParameter("username");
        String PWD = request.getParameter("password");
        try {
            JdbcUtil jdbcUtil = new JdbcUtil();
            jdbcUtil.test();
            LoginUsers users = jdbcUtil.identify(ID, PWD);
            if(users != null){

                response.sendRedirect("Index.html");
            }
            else{
                response.sendRedirect("LoginError.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
