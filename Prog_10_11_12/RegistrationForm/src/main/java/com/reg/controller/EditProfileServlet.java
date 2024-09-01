package com.reg.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reg.utils.DbConnection;

@WebServlet("/EditProfileServlet")
public class EditProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("user");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");

        try {
            Connection conn = DbConnection.createConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET fname = ?, lname = ? WHERE email = ?");
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.executeUpdate();
            response.sendRedirect("dashboard.jsp?success=Profile updated successfully.");
        } catch(Exception e) {
            e.printStackTrace();
            response.sendRedirect("profile.jsp?error=Something went wrong, please try again.");
        }
    }
}
