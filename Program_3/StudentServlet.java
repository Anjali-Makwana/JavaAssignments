package com.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitStudent")
public class StudentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	 @Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	        String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");

	        System.out.println("First Name: " + fname);
	        System.out.println("Last Name: " + lname);
	        System.out.println("Email: " + email);
	        System.out.println("Mobile: " + mobile);
	        System.out.println("Gender: " + gender);
	        System.out.println("Password: " + password);

	        response.setContentType("text/html");
	        response.getWriter().println("<h3>Student information submitted successfully!</h3>");
	        
	        request.setAttribute("fname", fname);
	        request.setAttribute("lname", lname);
	        request.setAttribute("email", email);
	        request.setAttribute("mobile", mobile);
	        request.setAttribute("gender", gender);
	        request.setAttribute("password", password);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("displayStudent.jsp");
	        dispatcher.forward(request, response);
	    }
	 
}// access via url - http://localhost:8080/WebProject/studentForm.jsp