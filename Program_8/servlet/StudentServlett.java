package com.webproject.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webproject.dao.StudentDAO;
import com.webproject.model.Student;

/**
 * Servlet implementation class StudentServlett
 */
@WebServlet("/StudentServlett")
public class StudentServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	    private StudentDAO studentDAO;

	    public void init() {
	        studentDAO = new StudentDAO();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String action = request.getParameter("action");
	        if (action == null) action = "LIST";
	        switch (action) {
	            case "NEW":
	                showNewForm(request, response);
	                break;
	            case "INSERT":
	                insertStudent(request, response);
	                break;
	            case "DELETE":
	                deleteStudent(request, response);
	                break;
	            case "EDIT":
	                showEditForm(request, response);
	                break;
	            case "UPDATE":
	                updateStudent(request, response);
	                break;
	            case "LIST":
	            default:
	                listStudent(request, response);
	                break;
	        }
	    }

	    private void listStudent(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        List<Student> listStudent = studentDAO.getAllStudents();
	        
	        if (listStudent == null) {
	            listStudent = new ArrayList<>();
	        }
	        
	        if (listStudent != null && !listStudent.isEmpty()) {
	            request.setAttribute("listStudent", listStudent);
	        }
	     
	        RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
	        dispatcher.forward(request, response);
	    }

	    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("add_student.jsp");
	        dispatcher.forward(request, response);
	    }

	    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        Student existingStudent = studentDAO.getStudentById(id);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("edit_student.jsp");
	        request.setAttribute("student", existingStudent);
	        dispatcher.forward(request, response);
	    }

	    private void insertStudent(HttpServletRequest request, HttpServletResponse response)
	            throws IOException {
	        String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");

	        Student newStudent = new Student();
	        newStudent.setFname(fname);
	        newStudent.setLname(lname);
	        newStudent.setEmail(email);
	        newStudent.setMobile(mobile);
	        newStudent.setGender(gender);
	        newStudent.setPassword(password);

	        studentDAO.addStudent(newStudent);
	        response.sendRedirect("StudentServlett?action=LIST");
	    }

	    private void updateStudent(HttpServletRequest request, HttpServletResponse response)
	            throws IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");

	        Student student = new Student();
	        student.setId(id);
	        student.setFname(fname);
	        student.setLname(lname);
	        student.setEmail(email);
	        student.setMobile(mobile);
	        student.setGender(gender);
	        student.setPassword(password);

	        studentDAO.updateStudent(student);
	        response.sendRedirect("StudentServlett?action=LIST");
	    }

	    private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
	            throws IOException {
	        String id = request.getParameter("id");
	        studentDAO.deleteStudent(Integer.parseInt(id));
	        response.sendRedirect("StudentServlett?action=LIST");
	    }
}