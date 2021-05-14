import java.io.File;

class File_Directory{
	public static void main(String[] args)
	{
		String fname = args[0];
		File f = new File(fname);
		if(f.isDirectory())
		{
			File dir = new File(fname);
			int fileCount = dir.list().length;
			System.out.println(" Total File : " + fileCount);
		}
		else
		{
			System.out.println("File name : " + f.getName());
			System.out.println("File Length : " + f.length());
		
		}
		
	}
}