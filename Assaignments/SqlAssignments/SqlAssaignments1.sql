SQL ASSAIGNMENTS1

1.wap to diplay the employees working in dept 20.
 	select * from Employee where dept=20;


2.Wap to display the employees earning more than 2500.
	 select * from Employee where salary>2500;
 

3.Wap to display all the employees whose job type is software developer.
select * from Employee where job_Type='Software_Developer';
 
4.Wap to display  the employees working in dept 10,20,and 40.
 select * from Employee where dept IN(20,10,40);
 
5.Wap to display all the employees whose name starts with 's'.
select * from Employee Where First_name LIKE 'S%' ;

6.Wap to display all the employees whose First_name  is having letter 'L'as 2nd character.
select * from Employee Where First_name LIKE '%L' ;

7.Wap to display all the employees whose First_name  is having atleast 2'A'.
select * from Employee where First_name LIKE '%a%a' ;

8.Wap to display all the employees whose salary is between 2000 and 30000.
 select * from Employee where Salary BETWEEN 20000 AND 30000 ;


