select * from p where p_city ="kodinar"; 

select pname from p where weight = (select max(weight) from p);

select  pname , pno from p where color="green";

select sname, s_city from s, sp where s.sno = sp.sno and sp.qty > 200; 

select max(weight) from p where weight < (SELECT max(weight) from p);

select sp.sno, sp.qty from sp, p where sp.pno = p.pno and p.weight = (select max(weight) from p);

Select s.sname, sp.qty from sp,p,s where p.color="red" and sp.pno = p.pno and sp.sno= s.sno;

select s.sname,p.p_city,sp.qty from sp,p,s where sp.pno=p.pno and sp.sno=s.sno and s.s_status<20;

select s.sname, sum(sp.qty) from sp,s where sp.sno = s.sno group by sp.sno;

select sp.pno, p.pname, sum(sp.qty) from sp,p where sp.pno = p.pno group by p.pno;

select p.pname, sum(sp.qty) from sp,p where sp.pno = p.pno group by p.pname;

select s.sname, s.sno, sum(sp.qty) from sp,s where sp.sno = s.sno group by sp.sno having sp.sno < "s4";

select s.sname, s.sno, sum(sp.qty) from sp,s where sp.sno = s.sno and s.s_status = 20 group by sp.sno ;

