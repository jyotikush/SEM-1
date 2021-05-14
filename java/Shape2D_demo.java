import java.util.*;
//import java.io.*;

public class Shape2D_demo
{
	public static void main(String [] args)
	{
		Rectangle r=new Rectangle();
		r.getArea();
		
		Triangle t=new Triangle();
		t.getArea();
		
		Circle c=new Circle();
		c.getArea();
	}
}

abstract class Shape
{
	  
	double lenght,breath,redious;
   
   Scanner s=new Scanner(System .in);
   Shape()
   {
	   System.out.println("shape()");
   }
   Shape(double lenght)
   {
	   this.lenght=lenght;
   }
   
   Shape(double lenght,double breath,double redious)
   {
	   this.lenght=lenght;
	   this.breath=breath;
	   this.redious=redious;
   }
   Shape(double lenght,double breath)
   {
	   this.lenght=lenght;
	   this.breath=breath;
   }
   public abstract double getArea();
   public abstract double getCircumference();
}

class Rectangle extends Shape
{
	public double getArea()
    {
		System.out.println("=======rectangle=======");
		System.out.print("Enter the length = ");
		lenght=s.nextInt();
		System.out.print("Enter the breath = ");
		breath=s.nextInt();
    
		System.out.println("The area of Rectangle = " + lenght * breath);
		return 0;
    }
	public double getCircumference()
	{
		System.out.println("The area of Rectangle = " + lenght * breath);
		return 0;
	}
	
	
}

class Triangle extends Shape
{
		
    public double getArea() 
    {    
		System.out.println("=======triangle=======");
		System.out.print("Enter the length = ");
		lenght=s.nextInt();
		System.out.print("Enter the breath = ");
		breath=s.nextInt();
		System.out.println("The area of triangle = " + (lenght * breath)/2);
		return 0;
    }
	public double getCircumference()
	{
		System.out.println("The area of Triangle = " + lenght * breath);
		return 0;
	}
	
}

class Circle extends Shape
{
	
	public double getArea()
	{		System.out.println("=========Circle==============");
		System.out.print("Enter Radius: ");
		redious = s.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * redious * redious);
		return 0;
	}	
	public double getCircumference()
	{
		System.out.println("The area of Circle = " + lenght * breath);
		return 0;
	}
}