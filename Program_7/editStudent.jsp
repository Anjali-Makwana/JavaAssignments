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
    <h2>Edit Student</h2>
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        String name = "";
        String email = "";
        String course = "";

        String sql = "SELECT * FROM student WHERE id=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                name = rs.getString("name");
                email = rs.getString("email");
                course = rs.getString("course");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    %>
    <form action="updateStudent.jsp" method="post">
        <input type="hidden" name="id" value="<%= id %>">
        Name: <input type="text" name="name" value="<%= name %>" required><br>
        Email: <input type="email" name="email" value="<%= email %>" required><br>
        Course: <input type="text" name="course" value="<%= course %>" required><br>
        <input type="submit" value="Update Student">
    </form>
</body>
</html>