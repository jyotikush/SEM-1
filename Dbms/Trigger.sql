use 12008115;
select * from account;
create table account (acc_no int ,
					 amount decimal(10,2));
                     

insert into account (acc_no , amount) 
			values( 467 ,50000),
					(653,670000),
                    (892 ,950000);

create trigger int_sum before insert on account for each row set @sum=@sum+new.amount;
set @sum=0;
select @sum as 'total amount';
drop trigger ins_transaction;
drop trigger demo.int_sum;
create trigger ins_transaction before insert on account for each row precedes ins_sum set
@deposite = @deposite +if(new.amount > 0 , new.amount , 0) ,
@withdrawal = @withdrawal + if (new.amount <0 , -new.amount , 0);
set @deposite =0;
set @withdrawals = 0;
insert into account (acc_no , amount) 
			values( 965 , -50000),
					(842, -2000),
                    (692 , 5000);
select @deposite AS 'total amount';
select @deposite as 'total deposite ' , @withdrawal as 'total withdrawl' ,@sum as 'total amount';