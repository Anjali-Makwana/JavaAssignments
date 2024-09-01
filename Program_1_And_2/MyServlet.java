package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    private String username;
    private String password;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        username = config.getInitParameter("username");
        password = config.getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	ServletContext context = getServletContext();
        
        // Fetch context parameters
        String dbURL = context.getInitParameter("dbURL");
        String dbUser = context.getInitParameter("dbUser");
        String dbPassword = context.getInitParameter("dbPassword");
    	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>ServletConfig Program 1</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        
        out.println("<h2>ServletContext Program 2</h2>");
        out.println("<p>dbURL: " + dbURL + "</p>");
        out.println("<p>dbUser: " + dbUser + "</p>");
        out.println("<p>dbPassword: " + dbPassword + "</p>");
        out.println("</body></html>");
    }
}

