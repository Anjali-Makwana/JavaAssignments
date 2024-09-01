<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data</title>
</head>
<body>
    <h2>Student Data</h2>
    
    <!-- Use JSTL SQL tag to access the data -->
    <sql:setDataSource var="dataSource" driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/employeedb" user="root" password="root" />
    
    <sql:query var="resultSet" dataSource="${dataSource}">
        SELECT * FROM employee
    </sql:query>

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
                    <td>${row.Empno}</td>
                    <td>${row.Ename}</td>
                    <td>${row.Job}</td>
                    <td>${row.Sal}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
