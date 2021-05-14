import java.io*;

public class Lower extends Decortor1
{
	public Lower(Interface Deco)
	{
		super(deco);
	
	}
	public String message()
	{
		return Deco.message().tolowercase();
	
	}


}