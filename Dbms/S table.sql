create table s ( sno char(3) primary key , sname varchar(50) not null , s_status int not null , 
 s_city varchar(30) not null);
 
insert into s ( sno , sname , s_status , s_city) 
 values ("s11" , "sumit" , 15 , "rajkot"),
  ("s21" , "joy" , 20 , "patna"),
 ("s34" , "kajal" , 38 , "bhopal"),
 ("s56" , "payal" , 22 , "mehsana"),
 ("s90", "chandni" , 78 , "orisaa");
 
 select * from s;