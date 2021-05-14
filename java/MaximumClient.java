import java.net.*;
import java.io.*;
import java.util.Scanner;
class MaximumClient{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		try{
				//Step - 1 & 2 Socket and connect
				Socket s = new Socket("localhost",50001);
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				
				//Step - 3 send/write
				System.out.print("Enter any number : " );
				double d1 = sc.nextDouble(); 
				System.out.print("Enter any number : " );
				double d2 = sc.nextDouble(); 
				System.out.print("Enter any number : " );
				String op = sc.next(); 
				
				DataOutputStream dos=new DataOutputStream(os);  
				dos.writeUTF(""+d1);
				dos.flush();
				dos.writeUTF(""+d2);
				dos.flush();
				dos.writeUTF(""+op);
				dos.flush();
				
				//Step - 4 read/recieve
				DataInputStream dis=new DataInputStream(is);  
				
				String  str=(String)dis.readUTF();  
				System.out.println("Ans = "+str);  
								
				//Step - 5 close
				s.close();		
		}catch(UnknownHostException unhe){
			unhe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}