<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Send Message</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2>Send Message</h2>
		<form method="post" action="SendMessageServlet">
			<div class="form-group">
				<label for="toEmail">To (Email):</label> <input type="email"
					class="form-control" id="toEmail" name="toEmail" required>
			</div>
			<div class="form-group">
				<label for="message">Message:</label>
				<textarea class="form-control" id="message" name="message" required></textarea>
			</div>
			<button type="submit" class="btn btn-primary">Send</button>
		</form>
	</div>
</body>
</html>