package com.reg.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reg.utils.DbConnection;

@WebServlet("/OtpVerificationServlet")
public class OtpVerificationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String otp = request.getParameter("otp");
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");

        try {
            Connection conn = DbConnection.createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT otp FROM users WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                int dbOtp = rs.getInt("otp");
                if(dbOtp == Integer.parseInt(otp)) {
                    PreparedStatement updatePs = conn.prepareStatement("UPDATE users SET verified = true WHERE email = ?");
                    updatePs.setString(1, email);
                    updatePs.executeUpdate();

                    response.sendRedirect("login.jsp");
                } else {
                    response.sendRedirect("otpVerification.jsp?error=Invalid OTP, please try again.");
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
            response.sendRedirect("otpVerification.jsp?error=Something went wrong, please try again.");
        }
    }
}