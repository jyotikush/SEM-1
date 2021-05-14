//read value form database
import java.sql.*; // 1st step

class DatabaseDemo{
	public static void main(String [] args){
		try{
		//2nd step load driver
			Class c = Class.forName("com.mysql.jdbc.Driver");
		//3rd step Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","");
		//4th step SQL Execute - Create Statement
			Statement st = con.createStatement();
			
			String sql = "select * from empmaster";
			ResultSet rs = st.executeQuery(sql);
		//5th step
			
			while(rs.next()){
				System.out.println("" + rs.getString("empid") + " " + rs.getString("empname") + " " + rs.getString("bpay") +" " + rs.getString("mobile"));
			}
		//6th cleanup
		 rs.close();
		 st.close();
		 con.close();
			
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
