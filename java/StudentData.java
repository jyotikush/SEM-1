import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class StudentData extends Frame  implements ActionListener{
	
	Label lid, lname, laddress , lsalary;
	TextField tfid, tfname,tfaddress , tfsalary;
	Button sub;
	Connection con;
	Statement st;
	
	StudentData()
	{
		//Frame f= new Frame("Label Example");  
		//f.setVisible(true);
		
		lid = new Label("Student Id : ");
		lname = new Label("Student Name : ");
		laddress = new Label("Student address: ");
		lsalary = new Label("salary");
		tfid = new TextField();
		tfname = new TextField();
		tfaddress = new TextField();
		tfsalary= new TextField();
		
		sub = new Button("Submit");
		//add(lbl);
		setLayout(new GridLayout(4,2));
		add(lid);
		add(tfid);
		add(lname);
		add(tfname);
		add(laddress);
		add(tfaddress);
		add(lsalary);
		add(tfsalary);
		add(sub);
		//f.setVisible(true);
		sub.addActionListener(this);
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","");
			st = con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
			String sql = "insert into stu(s_id,s_name,stu_address,stu_salary)values('"+ tfid.getText() + "','"+ tfname.getText()+"','"+tfaddress.getText()+"' + ' " +tfsalary.getText()+"'   )";
			
			try{
				int c = st.executeUpdate(sql);
				if(c<=0)
					throw new SQLException();
				System.out.println("Record inserted...");
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
	}
	
	
	public static void main(String[] argv)
	{
		
		StudentData add = new StudentData();
	}
}
