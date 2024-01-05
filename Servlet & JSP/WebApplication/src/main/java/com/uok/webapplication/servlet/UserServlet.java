package com.uok.webapplication.servlet;

import com.google.gson.Gson;
import com.uok.webapplication.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.FileWriter;

import java.io.File;
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
        System.out.println(new Gson().toJson(user));

        // Create an instance of Gson
        Gson gson = new Gson();

        // Convert the object to a JSON string
        String json = gson.toJson(user);

        // Create a FileWriter object
        FileWriter writer = new FileWriter("users.json");

        // Write the JSON string to the file
        writer.write(json);
        // Close the writer
        writer.close();
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        user = new User();
        PrintWriter pw = response.getWriter();
        String username = request.getParameter("username");
        user.setUsername(username);
        pw.println("Hello " + user.getUsername() + " from post");
        System.out.println(new Gson().toJson(user));

        // Create an instance of Gson
        Gson gson = new Gson();

        // Convert the object to a JSON string
        String json = gson.toJson(user);

        // Create a FileWriter object
        FileWriter writer = new FileWriter("users.json");

        // Write the JSON string to the file
        writer.write(json);
        // Close the writer
        writer.close();
    }
    
}
