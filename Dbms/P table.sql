create table p (pno char(3) primary key , pname varchar(50) not null , color varchar(30) not null , 
 weight double not null , p_city varchar(30) not null);
 
insert into p (pno , pname , color , weight , p_city) 
  values ( "p12" , "nut" , "green" , 10.0 , "kodinar"), 
	("p22" , "bolt" , "white" , 20.0 , "patan"), 
	("p31" , "screw" ,"orange " , 12.0 , "surat"),
    ("p44" ,"book" ,"black" , 25.0 , "bhopal"),
    ("p52" , "pen" , "black" ,22.0 , "jabalpur");
    
select * from p;