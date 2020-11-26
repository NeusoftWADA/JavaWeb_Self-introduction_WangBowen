package com.wangbowen.controller;

import com.wangbowen.util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class deleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String ID = request.getParameter("ID");
        try {
            JdbcUtil jdbcUtil = new JdbcUtil();
            jdbcUtil.test();
            jdbcUtil.delete(ID);
            response.sendRedirect("DeleteSuccess.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("DeleteFail.jsp");
        }
    }
}
