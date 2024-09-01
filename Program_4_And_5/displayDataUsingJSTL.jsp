<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- Connect to the database -->
    <sql:setDataSource var="dataSource"
                       driver="com.mysql.cj.jdbc.Driver"
                       url="jdbc:mysql://localhost:3306/employeedb"
                       user="root"
                       password="root" />

    <!-- Execute the query to retrieve all students -->
    <sql:query dataSource="${dataSource}" var="resultSet">
        SELECT * FROM employee;
    </sql:query>

    <!-- Display the data in a table -->
    <h2>Student List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Emp No</th>
                <th>Ename</th>
                <th>Job</th>
                <th>Sal</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="row" items="${resultSet.rows}">
                <tr>
                    <td><c:out value="${row.Empno}" /></td>
                    <td><c:out value="${row.Ename}" /></td>
                    <td><c:out value="${row.Job}" /></td>
                    <td><c:out value="${row.Sal}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>