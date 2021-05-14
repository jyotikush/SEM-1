import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Client
{
	public static void main(String[] args)
	{
		double amt;
		 Context a = new Context ( new CommercialTax());
		 Context b = new Context ( new EducationInstituteTax());
		 Context c = new Context (new HospitalTax());
		Context d = new Context ( new ResidentialTax());
		
		System.out.println("Enter Income to pay the tax:");
		Scanner sc =new Scanner(System.in);
		amt= sc.nextDouble();
		List<Tax> Client = Arrays.asList(new CommercialTax(), new EducationInstituteTax(), new HospitalTax(), new ResidentialTax());
		for(Tax t :Client)
		{
			System.out.println(t.proTax(amt));
			
		}
		
	}

}