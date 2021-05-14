
class Circle {
	
	private int x,y;
	private double r = 2.5;
	double pi = 3.14;
	Circle()
	{
		this.x = 10;
		this.y = 20;
	}
	Circle(int x)
	{
		this.x = x;
		this.y = 20;
	}
	Circle(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double area()
	{
		double res = pi*r*r;
		return res;
	}
	
	public static void main(String[] args)
	{
		Circle c = new Circle();
		System.out.println("X is ::" + c.x);
		System.out.println("Y is ::" + c.y);
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(30,40);
		
		System.out.println("Area is ::" + c.area());
	}
}