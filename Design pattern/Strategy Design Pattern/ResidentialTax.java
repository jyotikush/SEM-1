import java.util.Scanner;

public class ResidentialTax implements Tax
{
	double mtax,ptax,rdtax;
	public double proTax(double income)
	{
		System.out.println("Residential Tax:");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Municipal Tax Rate:");
		mtax = sc.nextDouble();
		mtax = mtax/100;
		
		System.out.println("Enter the Provincial Tax Rate:");
		ptax = sc.nextDouble();
		ptax = ptax/100;
		rdtax = income * mtax * ptax;
		System.out.println("Display Your Residential Tax :");
		return rdtax;
	}	

}