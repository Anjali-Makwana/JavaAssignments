<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<%@ page import="com.reg.model.*" %>
<%
    User user = (User) session.getAttribute("userdtls");
	if (user == null) {
    	response.sendRedirect("login.jsp");
    	return;
	}
%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
     	<h2>Welcome, <%= user.getFname() %> <%= user.getLname() %>!</h2>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="index.jsp">Home</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="SendMessage.jsp">Send Message</a>
                     </li>
                    <li class="nav-item">
                        <a class="nav-link" href="inbox.jsp">View Messages</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="LogoutServlet">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>
        
         <!-- User Details Section -->
        <div class="card mt-4">
            <div class="card-header">
                Your Details
            </div>
            <div class="card-body">
                <h5 class="card-title">Name: <%= user.getFname() %> <%= user.getLname() %></h5>
                <p class="card-text">Email: <%= user.getEmail() %></p>
                <a href="ProfileServlet" class="btn btn-primary">Edit Profile</a>
            </div>
        </div>
    </div>
    </div>
</body>
</html>
