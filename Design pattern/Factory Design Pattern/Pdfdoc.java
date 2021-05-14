import java.io.*;
public class Pdfdoc implements MyFiles
{
		
		public void create()
		{
			File f = new File("C:\\Pdfdoc.pdf");
			try
			{   
				FileWriter fw = new FileWriter ("C:\\Pdfdoc.pdf");
				PrintWriter pw = new PrintWriter(fw);
				pw.println("This is pdf file");
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