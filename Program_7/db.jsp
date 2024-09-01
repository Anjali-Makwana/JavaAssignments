<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/employeedb";
    String username = "root";
    String password = "root";

    Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
