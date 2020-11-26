package com.wangbowen.controller;

import com.wangbowen.entity.Users;
import com.wangbowen.util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class selectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String ID = request.getParameter("ID");
        try {
            JdbcUtil jdbcUtil = new JdbcUtil();
            Users users = jdbcUtil.select(ID);
            if(users != null){
                request.setAttribute("s","学号："+users.getID()+"\n姓名："+users.getName()+"\n性别："+users.getSex()+"\n生日："+users.getBirthdate()+"\n状态："+ users.getState()+"");
                request.getRequestDispatcher("SelectSuccess.jsp").forward(request, response);
            }
            else{
                response.sendRedirect("SelectFail.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("SelectWrong.jsp");
        }
    }
}
