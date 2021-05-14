class Decorator1
{
	public static void main(String[] args)
	{
		Interface a =new Msg();
		System.out.println(a.message());
		
		Interface a1 = new Upper(new Msg());
		System.out.println("UPPERCASE:= " + a1.message());
		
		Interface a2 = new Lower(new Msg());
		System.out.println("lowercase:= " + a2.message());

		Interface a3 = new Reverse(new Msg());
		System.out.println("reverse:= " +	a3.message());
		
	}
}