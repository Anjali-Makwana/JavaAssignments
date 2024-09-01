<%@page import="com.reg.utils.DbConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inbox</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2>Inbox</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>From</th>
                    <th>Message</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    String userEmail = (String) session.getAttribute("user");
                    Connection conn = DbConnection.createConnection();
                    PreparedStatement ps = conn.prepareStatement("SELECT sender_email, message FROM messages WHERE recipient_email = ?");
                    ps.setString(1, userEmail);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()) {
                %>
                    <tr>
                        <td><%= rs.getString("sender_email") %></td>
                        <td><%= rs.getString("message") %></td>
                    </tr>
                <% 
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>