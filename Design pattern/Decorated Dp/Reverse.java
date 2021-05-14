public class Reverse extends Decorator
{
	public Reverse (Interface Deco);
	{
		super(Deco);
	}
	public string message()
	{
		stringBuilder input1 = new StringBuilder();
		input1.append(Deco.message());
		input1 = input1.reverse();
		System.out.println(input1);
		return Deco.message();
	
	}

}