create table Emp(Emp_id int  primary key,
 Emp_name varchar(35) not null , 
 Emp_dept_id int not null,
 Emp_boss_id int not null ,
 Emp_salary long not null , 
 Foreign key(Emp_dept_id) REFERENCES Dept(Dept_id));
 
insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values(10 ,"anju" , 23 , 101 , 4000),
         (12 , "nitu" , 78 , 102 , 70000),
        (13, "navi" , 99,101,10000),
        (14 , "anu" , 233 , 201 , 120000),
        (15, "amit" , 90 ,201 , 6000),
        (16 , "tapu" ,909,201 ,5000),
        (17 , "krisha" ,23,301 ,1000),
        (18 ,"gapal" , 78 ,301 , 75000);
        
select * from Emp;
