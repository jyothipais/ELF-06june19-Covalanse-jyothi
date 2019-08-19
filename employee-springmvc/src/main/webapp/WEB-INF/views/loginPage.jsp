<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="login.js"></script>
</head>
<body>
	<div
		style="margin-top: 100px; margin-left: 100px; margin-right: 100px; margin-bottom: 100px; background-color: darkgrey;">
		<div class="container">
			<h2>Login</h2>
			<span style="color: red">${msg}</span> <span style="color: red">${LogoutMessage}</span>
			<span style="color: red">${sessionvalidate}</span>
			<form action="./authenticate" method="post">
				<div class="form-group">
					<label for="employeeid">Employee Id:</label> <input type="text"
						class="form-control" placeholder="Enter employee ID" name="id">
				</div>
				<div class="form-group">
					<label for="pwd">Password:</label> <input type="password"
						class="form-control" placeholder="Enter password" name="password">
				</div>

				<div class="form-group form-check">
					<label class="form-check-label"> <input
						class="form-check-input" type="checkbox" name="remember">
						Remember me
					</label>
				</div>
				<input type="submit" name="submitbtn" class="btn btn-primary"
					value="login"> </input>
				<div style="display: block; margin-top: 10px;">
					<!-- <input type="submit" id="b1" name="registration"
						class="btn btn-success" action="./registration" style="margin-left: 150px;">						
					</input> -->
					<a href="./registration" class="btn btn-success" type="button"
						style="margin-left: 150px;">Registration</a>
					<button type="buttom" id="b2" name="forgotpassword"
						class="btn btn-info" style="margin-left: 150px;">Forgot
						Password</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>