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

        String sql = "DELETE FROM student WHERE id=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();

            out.println("Student deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("Error deleting student!");
        }
    %>
    <a href="viewStudent.jsp">Back to Student List</a>
</body>
</html>
