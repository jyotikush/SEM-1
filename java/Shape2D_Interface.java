import java.util.*;

 class Shape2D_Interface
{
	public static void main(String [] args)
	{
		Rectangle r=new Rectangle(3 ,5);
		System.out.println("area of rectangle = " +r.area());
		
		Triangle t=new Triangle(3 , 5);
		System.out.println("area of triangle = " +t.area());
		
		Circle c=new Circle(11);
		System.out.println("area of circle = " +c.area());
		
	}
}

interface Shape
{
	public double area();
}

class Rectangle implements Shape
{
	 double length;
	 double breadth;
	 public Rectangle(double length, double breadth)
	 {
		 this.length=length;
		 this.breadth=breadth;
	 }
	public double area()
	{
		return length*breadth;
	}
}
class Triangle implements Shape
{
	double length;
	 double breadth;
	 public Triangle(double length, double breadth)
	 {
		 this.length=length;
		 this.breadth=breadth;
	 }
	public double area()
	{
		return ( length * breadth) /2;
	}
}
class Circle implements Shape
{
	double r;
	public Circle(double red)
	{
		r=red;
	}
	public double area()
	{
		return 3.14 * r * r;
	} 
	
}