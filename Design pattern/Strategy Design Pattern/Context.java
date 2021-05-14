
public class Context
{
	private Tax tax;
	public Context (Tax tax)
	{
		this.tax = tax;
	
	}
	public double Tpay(double amt)
	{
		return tax.proTax(amt);
	
	}


}