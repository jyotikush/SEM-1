//import java.io.File;
import java.io.*;
import java.io.FileInputStream;

class FileCopy{
	
	public static void main(String[] args)throws FileNotFoundException,IOException
	{
		FileInputStream file1 = new FileInputStream(args[0]);
		FileOutputStream file2 = new FileOutputStream(args[1]);
		int b ;
		while((b=file1.read()) != -1)
		{
			file2.write(b);			
		}
		System.out.println("File Content Copy Succusefully....");
		file1.close();
		file2.close();
		
	}
}