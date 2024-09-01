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
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        String sql = "UPDATE student SET name=?, email=?, course=? WHERE id=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, course);
            stmt.setInt(4, id);
            stmt.executeUpdate();

            out.println("Student updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("Error updating student!");
        }
    %>
    <a href="viewStudent.jsp">Back to Student List</a>
</body>
</html>
