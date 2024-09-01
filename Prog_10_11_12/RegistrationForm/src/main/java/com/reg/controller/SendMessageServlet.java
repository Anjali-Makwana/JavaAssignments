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

@WebServlet("/SendMessageServlet")
public class SendMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String sender_email = (String) session.getAttribute("user");
        String recipient_email = request.getParameter("toEmail");
        String message = request.getParameter("message");

        try {
            Connection conn = DbConnection.createConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO messages(sender_email, recipient_email, message) VALUES(?, ?, ?)");
            ps.setString(1, sender_email);
            ps.setString(2, recipient_email);
            ps.setString(3, message);
            ps.executeUpdate();
            response.sendRedirect("inbox.jsp?success=Message sent successfully.");
        } catch(Exception e) {
            e.printStackTrace();
            response.sendRedirect("sendMessage.jsp?error=Something went wrong, please try again.");
        }
    }
}
