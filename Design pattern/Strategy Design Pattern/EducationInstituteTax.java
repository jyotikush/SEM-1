import java.util.Scanner;

public class EducationInstituteTax implements Tax
{
	double edutax,eduit;
	
	public double proTax(double income)
	{
		System.out.println("Education Institute Tax :");
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Education Institute Tax rate:");
		
		eduit = sc .nextDouble();
		System.out.println(" The Education Institute Tax are :");
		
		return edutax =(eduit * income)/100;
			
	}

}