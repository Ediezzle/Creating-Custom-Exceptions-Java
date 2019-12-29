class CurrenciesDoNotMatchExceptionTest
{
	public	static	void main(String[]	args)
	{
		try
		{
			Amount.addAmounts(new Amount("RUPEE", 5), new Amount("DOLLAR",5));
		}

		catch (CurrenciesDoNotMatchException e)
		{
			System.out.println("Exception Handled in Main " + e.getClass());
		}
	}
}
