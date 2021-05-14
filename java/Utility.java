import java.util.*;
import java.util.Scanner;

class Utility {
	public static void main(String[] args)
	{
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sr.nextInt();
		Utility ul = new Utility();
		
		boolean res = ul.evenOdd(num);
		boolean pri = ul.isPrime(num);
		if(res == true || pri == true)
		{
			System.out.println("This number is even or prime...");
		}
		else
		{
			System.out.println("This number is odd or not prime...");
		}
		
	}
	public static boolean evenOdd(int value)
	{
		if(value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(int value)
	{
		boolean res = true;
		for(int i = 2; i<=value/2; i++)
		{
			int temp = value % i;
			if(temp ==0)
			{
				res = false;
				break;
			}
		}
		return res;
		
		
	}

}