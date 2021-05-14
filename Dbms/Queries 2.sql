select Dept.Dept_name ,min(Emp.Emp_salary) from Emp,Dept;

select Emp.Emp_name as "Employee Name",
 Dept.Dept_name as "Employee Department",
 boss.Emp_name as "Boss Name",
 bossdept.Dept_name as "Boss Department"
 from emp,emp as boss,dept,dept as bossdept
 where emp.Emp_boss_Id=boss.Emp_Id AND emp.Emp_dept_Id=dept.Dept_Id 
 AND boss.Emp_dept_Id=bossdept.Dept_Id;
 
 select Emp.Emp_Id as "Employee Id",
 Emp.Emp_name as "Employee Name",
 Emp.Emp_salary as "Employee Salary",
 Emp.Emp_boss_Id as "Employee  Boss Id",
 boss.Emp_name as "Boss Name",
 boss.Emp_salary as "Boss Salary"
 from emp,emp as boss
 where emp.Emp_boss_Id=boss.Emp_Id and emp.Emp_salary>boss.Emp_salary;

select Dept.Dept_name , max(Emp.Emp_salary) from Dept , Emp
where  Dept.Dept_id = Emp.Emp_Dept_id
group by Dept.Dept_name;




