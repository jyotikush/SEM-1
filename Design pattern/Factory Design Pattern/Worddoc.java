import java.io.*;
public class Worddoc implements MyFiles
{
		
		public void create()
		{
			File f = new File("A:\\Worddoc.doc");
			try
			{   
				FileWriter fw = new FileWriter ("A:\\Worddoc.doc");
				PrintWriter pw = new PrintWriter(fw);
				pw.println("This is Word file");
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