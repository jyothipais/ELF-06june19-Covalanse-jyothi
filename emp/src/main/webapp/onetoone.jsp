<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="fontawesome-free-5.9.0-web/Assignment.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
    <div class="accordion" id="accordionExample">
        <div class="card">
          <div class="card-header" id="headingOne">
            <h2 class="mb-0">
              <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
               Employee_Info
              </button>
            </h2>
          </div>
      
          <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
            <div class="card-body">
            <% if(request.getParameter("MSG")!=null){%>
	        <div style="text-align: center;color: white;">
	        <%=request.getParameter("MSG") %>
	        </div>
	    <%} %>
                <form action="./Registration" method="post">
                    <div class="row">
                      <div class="col">
                            <label for="exampleInputEmail1">ID</label>
                        <input type="text" id="id" name="ID" class="form-control" placeholder="ID">
                      </div>
                      <div class="col">
                            <label for="exampleInputEmail1">ACCOUNT NUMBER</label>
                        <input type="text" id="accountnumber" name="ID" class="form-control" placeholder="ACCOUNT NUMBER">
                      </div>
                    </div>
                    <div class="row">
                      <div class="col">
                            <label for="exampleInputEmail1">NAME</label>
                        <input type="text" id="name" name="NAME" class="form-control" placeholder="NAME">
                      </div>
                      <div class="col">
                            <label for="exampleInputEmail1">EMAIL ID</label>
                        <input type="text" id="emailid" name="EMAIL" class="form-control" placeholder="EMAIL ID">
                      </div>
                    </div>
                    <div class="row">
                      <div class="col">
                            <label for="exampleInputEmail1">AGE</label>
                        <input type="text" id="age" name="AGE" class="form-control" placeholder="AGE">
                      </div>
                      <div class="col">
                            <label for="exampleInputEmail1">DESIGNATION</label>
                        <input type="text" id="designation" name="DESIGNATION" class="form-control" placeholder="DESIGNATION">
                    </div>
                    </div>
                    <div class="row">
                            <div class="col">
                                    <label for="inputGender">Gender</label>
                                    <select id="inputGender" name="GENDER" class="form-control">
                                      <option selected>--select one--</option>
                                <option value="male">male</option>
                                <option value="female">female</option>
                                <option value="other">other</option>
                            </select>
                            </div>
                            <div class="col">
                                    <label for="exampleInputEmail1">Date of Birth</label>
                                <input type="date" id="dateofbirth" name="DOB" class="form-control" placeholder="dd-mm-yyyy">
                            </div>
                      </div>
                    <div class="row">
                            <div class="col">
                                  <label for="exampleInputEmail1">SALARY</label>
                              <input type="text" id="salry" name="SALARY" class="form-control" placeholder="SALARY">
                            </div>
                            <div class="col">
                                  <label for="exampleInputEmail1">DEPAETMENT ID</label>
                              <input type="text" id="departmentid" name="DEPT_ID" class="form-control" placeholder="DEPAETMENT ID">
                          </div>
                          </div>
                          <div class="row">
                                <div class="col">
                                      <label for="exampleInputEmail1">PHONE NUMBER</label>
                                  <input type="text" id="phonenumber" name="PHONE_NUMBER" class="form-control" placeholder="PHONE NUMBER">
                                </div>
                                <div class="col">
                                      <label for="exampleInputEmail1">MANAGER ID</label>
                                  <input type="text" id="managerid" name="MNGR_ID" class="form-control" placeholder="MANAGER ID">
                              </div>
                              </div>
                              <div class="row">
                                 
                                    <div class="col-6">
                                        <label for="exampleInputEmail1">JOINING DATE</label>
                                      <input type="date" id="joiningdate" name="JOINING_DATE" class="form-control" placeholder="JOINING DATE">
                                    </div>
                                    <div class="col-6">
                                        <label for="exampleInputEmail1">PASSWORD</label>
                                      <input type="password" id="password" name="ID" class="form-control" placeholder="Enter Password">
                                    </div>
                                    <div class="col-6">
                                        <label for="exampleInputEmail1">CONFIRM PASSWORD</label>
                                      <input type="password" id="confirmpassword"  name="ID" class="form-control" placeholder="Enter Valid Password">
                                    </div> 
                                                
                                  </div>     
            </div>
          </div>
        </div>
        <div class="card">
          <div class="card-header" id="headingTwo">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                Employee_Other_Info
              </button>
            </h2>
          </div>
          <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
            <div class="card-body">
                <div class="row">
                    <div class="col">
                          <label for="exampleInputEmail1">ID</label>
                      <input type="text" class="form-control" id="id" name="ID" placeholder="Please Enter ID">
                    </div>
                    <div class="col">
                          <label for="exampleInputemergenum">Emergency Contact Number</label>
                      <input type="text" class="form-control" id="emergencycontactnumber" name="EMERGENCY_CONTACT_PERSON" placeholder="Please Enter Emergency Contact Number">
                    </div>
                    <div class="col">
                          <label for="exampleInputmotname">Mother Name</label>
                      <input type="text" class="form-control" id="mothername" name="MOTHER_NAME" placeholder="Please Enter Mother Name">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col">
                          <label for="exampleInputPan">Pan Number</label>
                      <input type="text" class="form-control" id="pannumber" name="PAN" placeholder="Please Enter Pan Number">
                    </div>
                    <div class="col">
                          <label for="exampleInputemergeName">Emergency Contact Number</label>
                      <input type="text" class="form-control" id="emergencycontactnumber" name="EMERGENCY_CONTACT_NUMBER" placeholder="Please Enter Emergency Contact Name">
                    </div>
                    <div class="col">
                          <label for="exampleInputspouse">Spouse Name</label>
                      <input type="text" class="form-control" id="spousename" name="SPOUSE_NAME" placeholder="Please Enter Spouse Name">
                    </div>
                  </div>
                  <div class="row">
                          <div class="col">
                                  <label for="inputStatus">Marital Status</label>
                                  <select id="inputStatus" id="maritalstatus" name="IS_MARRIED" class="form-control">
                                    <option selected>Married</option>
                              <option value="married">Married</option>
                              <option value="unmarried">Unmarried</option>
                              <option value="divorcee">Divorcee</option>
                          </select>
                          </div>
                          <div class="col">
                                  <label for="inputnationality">Nationality</label>
                                  <select id="inputnationality" id="nationality" name="NATIONALITY" class="form-control">
                                    <option selected>---Select One---</option>
                              <option value="indian">Indian</option>
                              <option value="other">Other</option>
                          </select>
                          </div>
                          <div class="col">
                                  <label for="exampleInputpassport">Passport Number</label>
                              <input type="text" class="form-control" id="passportnumber" name="PASSPORT" placeholder="Please Enter Passport Number">
                            </div>
                  </div>
                  <div class="row">
                  <div class="col">
                          <label for="inputbloodgrp">Blood Group</label>
                          <select id="inputbloodgrp" id="bloodgroup" name="BLOOD_GROUP" class="form-control">
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
                          <label for="inputreligion">Religion</label>
                          <select id="inputreligion" id="religion" name="RELIGION" class="form-control">
                            <option selected>---Select One---</option>
                      <option value="hindu">Hindu</option>
                      <option value="christian">Christian</option>
                      <option value="muslim">Muslim</option>
                  </select>
                  </div>
                  <div class="col">
                          <label for="exampleInputaadhar">Aadhar Number</label>
                      <input type="text" class="form-control" id="adharnumber" name="ADHAR" placeholder="Please Enter Aadhar Number">
                    </div>
                  </div>
                  <div class="row">
                          <div class="col">
                                  <label for="inputphysicallych">Physically Challnged</label>
                                  <select id="inputphysicallych" id="physicallychallanged" name="is_challenged" class="form-control">
                                    <option selected>---Select One---</option>
                              <option value="yes">Yes</option>
                              <option value="no">No</option>
                          </select>
                          </div>
                          <div class="col">
                                  <label for="exampleInputfather">Father Number</label>
                              <input type="text" class="form-control" id="fathernumber" name="FATHER_NAME" placeholder="Please Enter Father Number">
                            </div>
                            <div class="col-3">
                                  <br>
                                    <button  type="submit"class="form-control form-control btn btn-outline-secondary"> Submit</button>
          
                                </div ><div class="col-3">
                                  <br>
                                    <button type="reset" class="form-control form-control btn btn-outline-success"  >reset</button>
                                </div>
                    </div>
                               
                                     
                </form>
            </div>
          </div>
        </div>
</body>
</html>