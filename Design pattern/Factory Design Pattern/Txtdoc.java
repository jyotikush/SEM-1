import java.io.*;
public class Txtdoc implements MyFiles
{
	
		public void create()
		{
			File f = new File("A:\\Txtdoc.txt");
			try
			{   
				FileWriter fw = new FileWriter ("A:\\Txtdoc.txt");
				PrintWriter pw = new PrintWriter(fw);
				pw.println("This is txt file ");
				pw.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
				
		}
	
		public void save()
		{
			System.out.println("File is save");

		}
		
		
    
}
