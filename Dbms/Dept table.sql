 create table Dept(Dept_id int primary key ,
 Dept_name varchar(30) not null,
 Dept_location varchar(50) not null );
 
  insert into Dept(Dept_id , Dept_name , Dept_location)
 values(111 ,"IT" , "Ahmedabad"),
	(222 ,"BBA" , "Gandhinagar"),
    (333 , "MCA" ,"Rajkot");
    
select * from Dept;    