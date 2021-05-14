import java.io*;

public class Upper extends Decortor1
{
	public Lower(Interface Deco)
	{
		super(deco);
	
	}
	public String message()
	{
		return Deco.message().touppercase();
	
	}


}