public abstract class Decorator implements Interface
{
	protected Interface Deco;
	public Decorator (Interface Deco)
	{
		this.Deco = Deco;
	}


}