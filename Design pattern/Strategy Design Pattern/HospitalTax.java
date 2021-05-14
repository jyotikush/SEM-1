import java.util.Scanner;

public class HospitalTax implements Tax
{
	double hptax, htax;
	public double proTax(double income)
	{
		System.out.println("Hospital Tax :");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Hospital Tax rate:");
		htax =sc.nextDouble();
		System.out.println("Display your Hospital Tax :");
		return hptax= ( income *htax)/100;
	}	

} 