<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<form action="./createEmployee" method="post">
		<div class="panel-group" id="accordion">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							aria-expanded="false" aria-controls="collapse1" href="#collapse1">
							Employee_Info</a>
					</h4>
				</div>
				<div id="collapse1" class="panel-collapse collapse in">
					<div class="panel-body">
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">ID</label> <input type="number"
									name="id" class="form-control" placeholder="ID">
							</div>
							<div class="col">
								<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
									type="number" name="accountNumber" class="form-control"
									placeholder="ACCOUNT NUMBER">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputName">NAME</label> <input type="text"
									name="name" class="form-control" placeholder="NAME">
							</div>
							<div class="col">
								<label for="exampleInputEmail1">EMAIL ID</label> <input
									type="text" name="email" class="form-control"
									placeholder="EMAIL ID">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputAge">AGE</label> <input type="number"
									name="age" class="form-control" placeholder="AGE">
							</div>
							<div class="col">
								<label for="exampleInputDesignation">DESIGNATION</label> <input
									type="text" name="designation" class="form-control"
									placeholder="DESIGNATION">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputGender">Gender</label> <select id="inputGender"
									name="gender" class="form-control">
									<option selected>--select one--</option>
									<option value="male">male</option>
									<option value="female">female</option>
									<option value="other">other</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputDateOfBirth">Date of Birth</label> <input
									type="date" name="dob" class="form-control"
									placeholder="dd-mm-yyyy">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputSalary">SALARY</label> <input
									type="text" name="salary" class="form-control"
									placeholder="SALARY">
							</div>
							<div class="col">
								<label for="exampleInputDepartmentId">DEPAETMENT ID</label> <input
									type="number" name="departementId.deptId" class="form-control"
									placeholder="DEPAETMENT ID">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputPhoneNumber">PHONE NUMBER</label> <input
									type="number" name="phone" class="form-control"
									placeholder="PHONE NUMBER">
							</div>
							<div class="col">
								<label for="exampleInputManagerId">MANAGER ID</label> <input
									type="number" name="managerId" class="form-control"
									placeholder="MANAGER ID">
							</div>
						</div>
						<div class="row">

							<div class="col">
								<label for="exampleInputJoiningDate">JOINING DATE</label> <input
									type="date" name="joiningDate" class="form-control"
									placeholder="JOINING DATE">
							</div>
							<div class="col">
								<label for="exampleInputPassword">Password</label> <input
									type="password" name="password" class="form-control"
									placeholder="Please Enter Password">
							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse2"> Employee_Other_Info</a>
					</h4>
				</div>
				<div id="collapse2" class="panel-collapse collapse">
					<div class="panel-body">
						<div class="row">

							<div class="col">
								<label for="exampleInputemergenum">Emergency Contact
									Number</label> <input type="number"
									name="employeeOtherInfo.emergencyContactNumber"
									class="form-control"
									placeholder="Please Enter Emergency Contact Number">
							</div>
							<div class="col">
								<label for="exampleInputmotname">Mother Name</label> <input
									type="text" name="employeeOtherInfo.motherName"
									class="form-control" placeholder="Please Enter Mother Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputPan">Pan Number</label> <input
									type="text" name="employeeOtherInfo.pan" class="form-control"
									placeholder="Please Enter Pan Number">
							</div>
							<div class="col">
								<label for="exampleInputemergeName">Emergency Contact
									Name</label> <input type="text"
									name="employeeOtherInfo.emegrencyContactPerson"
									class="form-control"
									placeholder="Please Enter Emergency Contact Name">
							</div>
							<div class="col">
								<label for="exampleInputspouse">Spouse Name</label> <input
									type="text" name="employeeOtherInfo.spouseName"
									class="form-control" placeholder="Please Enter Spouse Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputStatus">Marital Status</label> <select
									id="inputStatus" name="employeeOtherInfo.isMarried"
									class="form-control">
									<option selected>Married</option>
									<option value="true">married</option>
									<option value="false">unmarried</option>
									</select>
							</div>
							<div class="col">
								<label for="inputnationality">Nationality</label> <select
									id="inputnationality" name="employeeOtherInfo.nationality"
									class="form-control">
									<option selected>---Select One---</option>
									<option value="indian">Indian</option>
									<option value="other">Other</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputpassport">Passport Number</label> <input
									type="text" name="employeeOtherInfo.passport"
									class="form-control" placeholder="Please Enter Passport Number">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputbloodgrp">Blood Group</label> <select
									id="inputbloodgrp" name="employeeOtherInfo.bloodGroup"
									class="form-control">
									<option selected>---Select One---</option>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
								</select>
							</div>
							<div class="col">
								<label for="inputreligion">Religion</label> <select
									id="inputreligion" name="employeeOtherInfo.religion"
									class="form-control">
									<option selected>---Select One---</option>
									<option value="hindu">Hindu</option>
									<option value="christian">Christian</option>
									<option value="muslim">Muslim</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputaadhar">Aadhar Number</label> <input
									type="number" name="employeeOtherInfo.adhar" class="form-control"
									placeholder="Please Enter Aadhar Number">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputphysicallych">Physically Challnged</label> <select
									id="inputphysicallych" name="employeeOtherInfo.isChallanged"
									class="form-control">
									<option selected>---Select One---</option>
									<option value="true">Yes</option>
									<option value="false">No</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputfather">Father Number</label> <input
									type="text" name="employeeOtherInfo.fatherName"
									class="form-control" placeholder="Please Enter Father Number">
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse3"> Employee_Permanent_Info</a>
					</h4>
				</div>
				<div id="collapse3" class="panel-collapse collapse">
					<div class="panel-body">
						<div class="row">
							<div class="col-6">
								<label for="exampleInputAddress1">Address Type</label> <input
									type="text"
									name="employeeAddressInfo[0].addressPKBean.addressType"
									class="form-control" placeholder="Enter Address Type">
							</div>
							<div class="col-6">
								<label for="exampleInputCity">City</label> <input type="text"
									name="employeeAddressInfo[0].city" class="form-control"
									placeholder="Enter City">
							</div>
						</div>
						<div class="row">
							<div class="col-6">
								<label for="exampleInputState">State</label> <input type="text"
									name="employeeAddressInfo[0].state" class="form-control"
									placeholder="Enter State">
							</div>
							<div class="col-6">
								<label for="exampleInputLandmark">Landmark</label> <input
									type="text" name="employeeAddressInfo[0].landmark"
									class="form-control" placeholder="Enter Landmark">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-6">
							<label for="exampleInputAddress1">Address1</label> <input
								type="text" name="employeeAddressInfo[0].address1"
								class="form-control" placeholder="Enter Address Line1">
						</div>
						<div class="col-6">
							<label for="exampleInputAddress2">Address2</label> <input
								type="text" name="employeeAddressInfo[0].address2"
								class="form-control" placeholder="Enter Address Line2">
						</div>

					</div>
					<div class="row">
						<div class="col-6">
							<label for="exampleInputCountry">Country</label> <input
								type="text" name="employeeAddressInfo[0].country"
								class="form-control" placeholder="Enter Country">
						</div>
						<div class="col-6">
							<label for="exampleInputPincode">Pincode</label> <input
								type="text" name="employeeAddressInfo[0].pincode"
								class="form-control" placeholder="Enter Pincode">
						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse4"> Employee_Temporary_Info</a>
				</h4>
			</div>
			<div id="collapse4" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="row">
						<div class="col-6">
							<label for="exampleInputAddress1">Address Type</label> <input
								type="text"
								name="employeeAddressInfo[1].addressPKBean.addressType"
								class="form-control" placeholder="Enter Address Type">
						</div>
						<div class="col-6">
							<label for="exampleInputCity">City</label> <input type="text"
								name="employeeAddressInfo[1].city" class="form-control"
								placeholder="Enter City">
						</div>
					</div>
					<div class="row">
						<div class="col-6">
							<label for="exampleInputState">State</label> <input type="text"
								name="employeeAddressInfo[1].state" class="form-control"
								placeholder="Enter State">
						</div>
						<div class="col-6">
							<label for="exampleInputLandmark">Landmark</label> <input
								type="text" name="employeeAddressInfo[1].landmark"
								class="form-control" placeholder="Enter Landmark">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-6">
						<label for="exampleInputAddress1">Address1</label> <input
							type="text" name="employeeAddressInfo[1].address1"
							class="form-control" placeholder="Enter Address Line1">
					</div>
					<div class="col-6">
						<label for="exampleInputAddress2">Address2</label> <input
							type="text" name="employeeAddressInfo[1].address2"
							class="form-control" placeholder="Enter Address Line2">
					</div>

				</div>
				<div class="row">
					<div class="col-6">
						<label for="exampleInputCountry">Country</label> <input
							type="text" name="employeeAddressInfo[1].country"
							class="form-control" placeholder="Enter Country">
					</div>
					<div class="col-6">
						<label for="exampleInputPincode">Pincode</label> <input
							type="number" name="employeeAddressInfo[1].pincode"
							class="form-control" placeholder="Enter Pincode">
					</div>
				</div>
			</div>
		</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse5"> Employee_Education_Info1</a>
				</h4>
			</div>
			<div id="collapse5" class="panel-collapse collapse">
				<div class="panel-body">

					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Education Type</label> <input
								type="text"
								name="educationInfo[0].educationPkBean.EducationType"
								class="form-control" placeholder="Please Enter Education Type">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Branch</label> <input type="text"
								name="educationInfo[0].branch" class="form-control"
								placeholder="Please Enter  Branch">
						</div>
						<div class="col">
							<label for="exampleInputPan">Collage Name</label> <input
								type="text" name="educationInfo[0].collageName"
								class="form-control" placeholder="Please Enter  Collage Name">
						</div>
					</div>

					<div class="row">
						<div class="col">
							<label for="exampleInputPan">University Name</label> <input
								type="text" name="educationInfo[0].university"
								class="form-control" placeholder="Please Enter University Name">
						</div>
						<div class="col">
							<label for="exampleInputPan">Percentage</label> <input
								type="text" name="educationInfo[0].percentage"
								class="form-control" placeholder="Please Enter Percentage">
						</div>
					</div>

					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Location</label> <input type="text"
								name="educationInfo[0].location" class="form-control"
								placeholder="Please Enter Location">
						</div>
						<div class="col">
							<label for="exampleInputPan">YOP</label> <input type="date"
								name="educationInfo[0].yop" class="form-control"
								placeholder="Please Enter YOP">
						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse6"> Employee_Education_Info2</a>
				</h4>
			</div>
			<div id="collapse6" class="panel-collapse collapse">
				<div class="panel-body">

					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Education Type</label> <input
								type="text"
								name="educationInfo[1].educationPkBean.EducationType"
								class="form-control" placeholder="Please Enter Education Type">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Branch</label> <input type="text"
								name="educationInfo[1].barnch" class="form-control"
								placeholder="Please Enter  Branch">
						</div>
						<div class="col">
							<label for="exampleInputPan">Collage Name</label> <input
								type="text" name="educationInfo[1].collageName"
								class="form-control" placeholder="Please Enter  Collage Name">
						</div>
					</div>

					<div class="row">
						<div class="col">
							<label for="exampleInputPan">University Name</label> <input
								type="text" name="educationInfo[1].university"
								class="form-control" placeholder="Please Enter University Name">
						</div>
						<div class="col">
							<label for="exampleInputPan">Percentage</label> <input
								type="text" name="educationInfo[1].percentage"
								class="form-control" placeholder="Please Enter Percentage">
						</div>
					</div>

					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Location</label> <input type="text"
								name="educationInfo[1].location" class="form-control"
								placeholder="Please Enter Location">
						</div>
						<div class="col">
							<label for="exampleInputPan">YOP</label> <input type="date"
								name="educationInfo[1].yop" class="form-control"
								placeholder="Please Enter YOP">
						</div>
					</div>

				</div>
			</div>
		</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse7"> Employee_ExperienceInfo_Info1</a>
				</h4>
			</div>
			<div id="collapse7" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Company Name</label> <input
								type="text"
								name="experienceInfoBean[0].experiencePkBean.companyName"
								class="form-control" placeholder="Please Enter Company Name">
						</div>
						<div class="col">
							<label for="exampleInputPan">Designation</label> <input
								type="text" name="experienceInfoBean[0].designation"
								class="form-control" placeholder="Please Enter Designation">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Leaving Date</label> <input
								type="date" name="experienceInfoBean[0].leavingDate"
								class="form-control" placeholder="Please Enter Leaving Date">
						</div>
						<div class="col">
							<label for="exampleInputPan">Joining Date</label> <input
								type="date" name="experienceInfoBean[0].joiningDate"
								class="form-control" placeholder="Please Enter Joining Date">
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse8"> Employee_Experience_Info2</a>
					</h4>
				</div>
				<div id="collapse8" class="panel-collapse collapse">
					<div class="panel-body">
						<div class="row">
							<div class="col">
								<label for="exampleInputPan">Company Name</label> <input
									type="text"
									name="experienceInfoBean[1].experiencePkBean.companyName"
									class="form-control" placeholder="Please Enter Company Name">
							</div>
							<div class="col">
								<label for="exampleInputPan">Designation</label> <input
									type="text" name="experienceInfoBean[1].designation"
									class="form-control" placeholder="Please Enter Designation">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputPan">Leaving Date</label> <input
									type="date" name="experienceInfoBean[1].leavingDate"
									class="form-control" placeholder="Please Enter Leaving Date">
							</div>
							<div class="col">
								<label for="exampleInputPan">Joining Date</label> <input
									type="date" name="experienceInfoBean[1].joiningDate"
									class="form-control" placeholder="Please Enter Joining Date">
							</div>
						</div>
						<br /> <br />
						<div class="row">
							<div class="col-5">
								<input type="submit"
									class="form-control form-control btn btn-outline-secondary">
									Submit</input>
							</div>
							<div class="col-5">
								<button type="reset"
									class="form-control form-control btn btn-outline-success">reset</button>
							</div>
						</div>
					</div>
				</div>
	</form>
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