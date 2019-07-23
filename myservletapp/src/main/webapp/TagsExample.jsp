<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%!
	public String name="jyothi";
	private int age=21;
	{
		System.out.println("Inside My Block");
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getName(String name){
		return "givenName is :-"+name;
	}
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Jsp Tag Example.....</h1>
	<br><br>
	Name 1:<%=name %><br>
	Name 2:<%=getName() %><br>
	Name 3:<%=getName("Sara") %><br><br><br>
	Age 1:<%=age %><br>
	Age 2:<%=getAge() %><br>
	Age 3:<%=getAge() %><br>
	
	<br><br><br>
</body>
</html>