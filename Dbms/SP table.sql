
create table sp(sno char(3) not null,
pno char(3) not null ,
qty int not null,
primary key(sno , pno),
Foreign key (sno) references s(sno),
Foreign key (pno) references p(pno));

insert into sp(sno , pno , qty)values("s12" , "p1" , 100);
 insert into sp(sno , pno , qty)values("s24" ,"p2" , 200);
 insert into sp(sno , pno , qty)values("s36" ,"p3" ,300);
 insert into sp(sno , pno , qty)values("s17" ,"p2" ,400);
 insert into sp(sno , pno , qty)values("s29" ,"p1" ,500);
 insert into sp(sno , pno , qty)values("s30" ,"p2" ,600);
 
 select * from sp;
