
import java.util.Scanner;

public class Client {
    public static void main(String args[])
    {
        Internet sc = new Bannedsite(); 
        try
        { 
            Scanner scn = new Scanner(System.in);   
            System.out.print("Enter a WebSite: ");  
            String str= scn.nextLine(); 
             sc.doConnect(str);
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    }
}
