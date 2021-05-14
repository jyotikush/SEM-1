
public class CommercialTax implements Tax
{
	double commtax,gst = 28;
	public double proTax(double income)
	{
		System.out.println("Commercial Tax :");
		System.out.println("GST is 28% in our India");
		commtax =(income *gst)/100;
		System.out.println("Commercial Tax are display :");
		return commtax;
	}

}