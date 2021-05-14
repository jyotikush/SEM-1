import java.util.Scanner;
import java.io.*;
public class MyFilesClient
{
	public static void main(String [] args)
	{
		MyFiles mf;
		
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Word File");
		System.out.println("2.Pdf File");
		System.out.println("3.Text File");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		mf=FileFactory.getMyFiles(ch);
		mf.create();
		mf.save();
		
		
		
	}
}