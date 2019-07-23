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
		    <span style="color:red"><%=request.getParameter("msg") %></span>
			<h2>Login</h2>
			<form action="./LoginPage" method="post">
				<div class="form-group">
					<label for="employeeid">Employee Id:</label> <input
						type="text" class="form-control"
						placeholder="Enter employee ID" name="employeeid">
				</div>
				<div class="form-group">
					<label for="pwd">Password:</label> <input 
						type="password" class="form-control" placeholder="Enter password"
						name="password">
				</div>

				<div class="form-group form-check">
					<label class="form-check-label"> <input
						class="form-check-input" type="checkbox" name="remember">
						Remember me
					</label>
				</div>
				<input type="submit" name="submitbtn" class="btn btn-primary"
					 value="login">
					<!--  <a href="store.html">Login</a> -->	
				</input>
				<div style="display: block; margin-top: 10px;">
					<button onclick="employeeinfo.html" type="buttom" id="b1" name="createaccount"
						class="btn btn-success" style="margin-left: 150px;">
						<a href="EmployeeInformation.html">Create Account</a>
					</button>
					<button type="buttom" id="b2" name="forgotpassword"
						class="btn btn-info" style="margin-left: 150px;">Forgot
						Password</button>
						
				</div>
			</form>
		</div>
	</div>

</body>
</html>