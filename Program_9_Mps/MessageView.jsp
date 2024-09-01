<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Send Message</title>
</head>
<body>
    <h2>Send Message</h2>
    <form action="MessageController" method="post">
        From: <input type="text" name="from"><br>
        To: <input type="text" name="to"><br>
        Message: <textarea name="msg"></textarea><br>
        User ID: <input type="text" name="uid"><br>
        <input type="submit" value="Send">
    </form>
</body>
</html>
