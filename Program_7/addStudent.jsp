<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="db.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Add Student</h2>
    <form action="addStudent.jsp" method="post">
        Name: <input type="text" name="name" required><br>
        Email: <input type="email" name="email" required><br>
        Course: <input type="text" name="course" required><br>
        <input type="submit" value="Add Student">
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String course = request.getParameter("course");

            String sql = "INSERT INTO student (name, email, course) VALUES (?, ?, ?)";

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, course);
                stmt.executeUpdate();

                out.println("Student added successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
                out.println("Error adding student!");
            }
        }
    %>
    <a href="viewStudent.jsp">Back to Student List</a>
</body>
</html>