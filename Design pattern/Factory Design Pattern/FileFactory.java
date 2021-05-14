public class FileFactory
{
	public static MyFiles getMyFiles(int no)
	{
		if(no==1)
		{
			System.out.println("Word file is ready....");
			return new Worddoc();
		}
		else if(no==2)
		{
			System.out.println("Pdf file is ready....");
			return new Pdfdoc();
		}
		else if(no==3)
		{
			System.out.println("Text file is ready....");
			return new Txtdoc();
		}
		else 
		{
			return null;
		}
	}
}