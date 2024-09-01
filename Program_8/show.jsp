<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.webproject.model.Student" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
</head>
<body>
<div class="container">
    <h2>Student List</h2>
    
	<c:if test="${empty listStudent}">
	    <p>No students found.</p>
	</c:if>
        <c:if test="${not empty listStudent}">
		    <table class="table table-bordered">
		        <thead>
		            <tr>
		                <th>ID</th>
		                <th>First Name</th>
		                <th>Last Name</th>
		                <th>Email</th>
		                <th>Actions</th>
		            </tr>
		        </thead>
		       <tbody>
        <%
            List<Student> listStudent = (List<Student>) request.getAttribute("listStudent");
            for (Student student : listStudent) {
        %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getFname() %></td>
            <td><%= student.getLname() %></td>
            <td><%= student.getEmail() %></td>
            <td><%= student.getMobile() %></td>
            <td><%= student.getGender() %></td>
            <td>
                <a href="StudentServlett?action=EDIT&id=<%= student.getId() %>" class="btn btn-primary">Edit</a>
                <a href="StudentServlett?action=DELETE&id=<%= student.getId() %>" class="btn btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
            </td>
        </tr>
        <%
            }
        %>
        </tbody>
		    </table>
		</c:if>
</div>
</body>
</html>