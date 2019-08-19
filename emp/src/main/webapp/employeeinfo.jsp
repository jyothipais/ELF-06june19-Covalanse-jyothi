<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Information</title>
 
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body style="background:dodgerblue">
 <p class="h3" style="margin-left: 40%">EMPLOYEE INFORMATION</p>
        <hr>
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

                        <div class="col-3">                          
                          <br> 
                            <button  type="submit" class="btn btn-success" >Submit</button>

                        </div ><div class="col-3">
                          <br>
                            <button type="reset"class="btn btn-info" >reset</button>
                        </div>
                        
                      </div>     
      </form>

</body>
</html>