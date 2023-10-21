package com.uok.webapplication.servlet;

import com.uok.webapplication.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "userServlet", value = "/user-servlet")
public class UserServlet extends HttpServlet {
    private User user;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        user = new User();
        PrintWriter pw = response.getWriter();
        String username = request.getParameter("username");
        user.setUsername(username);
        pw.println("Hello " + user.getUsername() + " from get");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        user = new User();
        PrintWriter pw = response.getWriter();
        String username = request.getParameter("username");
        user.setUsername(username);
        pw.println("Hello " + user.getUsername() + " from post");
    }

}
