<%@page import="com.covalense.employeemvc.dto.*"%>
<%@page import="com.covalense.employeemvc.dao.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
<form action="./validator/validate/employee/search">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="btn-group" role="group" style="margin-left: 50px;">
			<button type="button" class="btn btn-default">
				<img
					src="https://cdn.pixabay.com/photo/2019/07/14/00/07/flower-4335981__340.jpg"
					alt="" width="100px;" height="100px;">
			</button>
		</div>
		<div class="row" style="margin-left: 15px;" style="margin-left: 50px;">
			<div class="col-lg-15">
				<div class="input-group">
					<span class="input-group-btn">
						<button class="btn btn-default" type="submit">Search</button>
					</span> <input type="text" class="form-control"
						placeholder="Search By ID or NAME ">
				</div>
			</div>
		</div>
		<div class="btn-group" role="group" aria-label="..."
			style="margin-left: 900px;">
			<button type="button" class="btn btn-default">Edit</button>
			<button type="button" class="btn btn-default">
				<a href="./logout"> Logout</a>
			</button>

		</div>

	</nav>
	<H1><span style=\"color:green\"> Employee Found</span></H1>
			<BR>
			 <BR> NAME IS : ${bean.id}
			 <BR> AGE IS : ${bean.age}
			 <BR> DATE OF BIRTH IS :${bean.dob}
			 <BR> GENDER IS :${bean.gender}
			 <BR> MAIL ID IS :${bean.email}
			 <%-- <BR> MANAGER ID IS :${bean.managerId} --%>
			 <BR> DESIGNATION IS :${bean.designation}
			 <BR> DEPARTMENT ID IS :${bean.departementId}
			 <BR> ACCOUNT NO IS:${bean.accountNumber}
			 <BR> PHONE NO IS :${bean.phone}
			 <BR> SALARY IS:${bean.salary}
			 <BR> JOINING DATE IS:${bean.joiningDate}
	
		</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

</form>
</body>
</html>