
import java.util.ArrayList; 
import java.util.List; 

public class Bannedsite implements Internet{
    private Internet internet = new Accessiblesite(); 
    private static List<String> Sites;
     static
    { 
       		 Sites = new ArrayList<String>(); 
        	Sites.add("www.amazon.com"); 
        	Sites.add("www.flipkart.com"); 
       		 Sites.add("www.yahoo.com"); 
		Sites.add("www.walmart.com");
		Sites.add("www.facebook.com");
		Sites.add("www.youtube.com");
		Sites.add("www.google.com");
		Sites.add("www.apple.com");
		Sites.add("www.blogger.com");
		Sites.add("www.adobe.com");
        
    } 

    public void doConnect(String url) 
	{
        if(Sites.contains(url.toLowerCase())) 
        { 
		
				System.out.println("cant access");

        } 
		else{
			internet.doConnect(url);
		}
          
    }
    
}
