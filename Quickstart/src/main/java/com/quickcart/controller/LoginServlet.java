package com.quickcart.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hardcoded credentials
        if (email.equals("manoj@gmail.com") && password.equals("1234")) {

            // Redirect to ProductServlet
            response.sendRedirect("ProductServlet");

        } else {

            // Forward to error.jsp
            request.setAttribute("errorMessage", "Invalid email or password!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    // Optional: handle GET request (when user directly opens URL)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("login.jsp");
    }
}