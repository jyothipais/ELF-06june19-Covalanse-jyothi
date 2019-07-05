1.Write a query to display Employee name, his salary along with the designation for all the employee.

	Query:-seleect NAME,SALARY DESIGNATION from employee_info;


2.Write a query to obtain name and his current salary and new salary with a hike 25 % for all the Employee.
	Query:-select NAME ,SALARY,as CURRENT_SALARY ,SALARY+(SALARY*0.25) from employee_info; 

3.Write a query to display all the details of the Employee who are working as salesman
	Query:-select * from employee_info where DESIGNATION='salesman';

4.Write a query to display all the employees of Dept.no 20.
	Query:-select * from employee_info where DEPARTEMENT_NUMBER=20;

5.Write a query to display all the Employees DOB before 1994.
	Query:-select * from employee_info where DOB<1994;

6.Write a query to display all the employees whose annual salary is less than 30,000.
	Query:-select * from employee_info where SALARY<30000;

7.Write a query to display name, salary and Annual salary of all the clerks.
	Query:-select NAME,SALARY,ANNUAL_SALARY from employee_info where DESIGNATION='CLERK';

8.Write a query to display all the details of Employee Whoever Hired after Feb of 2013.
	Query:-select * from employee_info where JOINING_DATE='2013-02';

9.Write a query to display managers working in deptno 20 only if salary is greater than 2500.
	Query:-select * from employee_info where  DESIGNATION='MANAGER' AND SALARY>2500;
	
10.Write a query to display all the employee excluding Analyst.
	Query:-select * from employee_info where DESIGNATION!='analytics';

11.Write a query to display all the employees excluding salesman who are working in department 30.
	Query:-
12.Write a query to display names of all the employee who are working in dept 30 as manager OR all the names of employee who are working as a clerk and salary less than 2000.
	Query:-
13.Write a query to display all the Employees in dept 20 only if their salary is greater than 1000 and less than 3500, including 1000 & 3500.
	Query:-select * from employee_info where SALARY>1000 AND SALARY<3500; 

14.Write a query to display all the details of Employees who are working as clerk in deptno 20,30 or 40.
	Query:-select * from employee_info Where DESIGNATION='clerk' AND DEPT_ID IN(10,20,30);

15.Write a query to display the details of software developer, manager or clerk who are working in dept.  10 or 20 and salary is greater than 1500.
	Query:-select * from employee_info Where DESIGNATION='clerk' OR  DESIGNATION='softwareDeveloper' AND DEPT_ID IN(10,20,30);

16. Write a query to display all the details of Employees who are working in department 10,20 excluding all the Salesman and Analyst.
	Query:-select * from employee_info Where DEPT_ID IN(10,20,) AND DESIGNATION!='salesman' AND DESIGNATION!='analytics' ;

17. Write a query to display name, Salary for all the Employees who are working in dept 10 or 20 and their annual salary between 20,000 and 40,000 including the limits.
	Query:-select NAME,SALARY from  employee_info where DEPT_ID=10 OR 20 AND SALARY BETWEEN(20000,40000);

18.Write a query to display all the details of employees who were hire in the month of September working in dept 20 or 30.
	Query:-select * from employee_info where JOINING_DATE='09' AND DEPT_ID=20 OR 30;

19.Write a query to display their name and DOJ of employee who works as salesman or clerk and their names has at least one S or E.
	Query:-select NAME,JOINING_DATE from employee_info where DESIGNATION='salesman' OR 'clerk' AND NAME LIKE'%s' OR '%E';

20.Write a query to display Average salary and Highest salary of dept. 20.
	Query:-select AVG(SALARY) AND MAX(SALARY) from employee_info where DEPT_ID=20 ;
	
21.Write a query to display date of first and last Hired Employees.
	Query:-

22.Write a query to display AVG Salary of Employees by excluding president and manager(job).
	Query:-select AVG(SALARY) from employee_info where DESIGNATION!='PRESIDENT'OR'MANAGER'; 

23.Write a query to display the total salary and average salary of each department
	Query:-select AVG(SALARY),SUM(SALARY) from employee_info where DEPT_ID=20;
		select AVG(SALARY),SUM(SALARY) from employee_info where DEPT_ID=30;

24.Write a query to find the highest and least salary of an Employee in each job by excluding the employees whose name has ‘R’ as the last but one character.
	Query:-select MAX(SALARY),MIN(SALARY) from employee_info where NAME LIKE '%s_;

26. Write a query to list the employee whose designation are same as Vikas    or Rahul.
	Query:-select * from employee_info where DESIGNATION=DESIGNATION(VIKAS OR RAHUL);

27. Write a query to List the employee whose salary is equal to the average of max and minimum.
	Query:-select * from employee_info where SALARY=AVG(MAX(SALARY)) AND AVG(MAX(SALARY));

28. Write a query to display employee name, department name and the location of all employee.
	Query:-select NAME,LOCATION,DEPARTMENT_NAME from employee_info;

29. Write a query to display all the details of employee whose name begins with the consonants.
	Query:-select * from employee_info where NAME LIKE '%const';

30. Create a Views from Employee_Info table .Views should have all  the record whose salary is greater than 10000.
	Query:-    create view employee_info
				as select * from employee_info 
				where SALARY>10000; 

31.  Create a trigger which will work before deletion in employee_info table     and create a duplicate copy of the record in another table employee_backup
	Query:- DELIMITER $$

	CREATE
    TRIGGER `covalense_db`.`trig` BEFORE DELETE
    ON `covalense_db`.`employee_info`
    FOR EACH ROW BEGIN
	select * from employee_info 
    END$$

	DELIMITER ;

32.What is Driver Class?
	Driver class is External class which is used to interact with the DATABASE by using JDBC
	It is a concreate class . It implements the interface.
	It provides implementation which all methods available in the driver interface.
	
33.What is DB URL?
	Data Base Uniform Resource Locator.Used to uniqely identify the system.
