package com.reg.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reg.utils.DbConnection;
import com.reg.utils.EmailUtil;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);

        try {
            Connection conn = DbConnection.createConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(fname, lname, email, password, otp) VALUES(?, ?, ?, ?, ?)");
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setInt(5, otp);
            ps.executeUpdate();

            EmailUtil.sendEmail(email, "Your OTP", "Your OTP is: " + otp);

            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            response.sendRedirect("otpVerification.jsp");

        } catch(Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?error=Something went wrong, please try again.");
        }
    }
}