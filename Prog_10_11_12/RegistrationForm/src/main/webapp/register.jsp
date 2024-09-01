<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
    <div class="container">
        <h2>Register</h2>
        <form id="registerForm" method="post" action="RegisterServlet">
            <div class="form-group">
                <label for="fname">First Name:</label>
                <input type="text" class="form-control" id="fname" name="fname" required>
            </div>
            <div class="form-group">
                <label for="lname">Last Name:</label>
                <input type="text" class="form-control" id="lname" name="lname" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" required>
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password:</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required>
            </div>
            <button type="submit" class="btn btn-primary" id="registerButton">Register</button>
        </form>
        <div id="emailExistsMsg" class="text-danger mt-3" style="display:none;">Email already exists!</div>
    </div>

	<script>
	$(document).ready(function() {
	    $("#email").on("blur", function() {
	        var email = $(this).val();
	        $.ajax({
	            url: "CheckEmailServlet",
	            type: "GET",
	            data: { email: email },
	            success: function(response) {
	                if (response.emailExists) {
	                	$('#emailExistsMsg').show();
	                    $("#registerButton").attr("disabled", true);
	                } else {
	                	$('#emailExistsMsg').hide();
	                    $("#registerButton").attr("disabled", false);
	                }
	            },
	            error: function() {
	                console.log("An error occurred during the email check.");
	            }
	        });
	    });

	    
	    $('#registerForm').on('submit', function(event) {
	        var password = $('#password').val();
	        var confirmPassword = $('#confirmPassword').val();
	        if(password !== confirmPassword) {
	            alert("Passwords do not match!");
	            event.preventDefault();
	        }
	    });
	});
	</script>
</body>
</html>