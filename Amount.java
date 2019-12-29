public class Amount
{
	public Amount(String currency, double amount)
	{
		this.currency =	currency;
		this.amount	= amount;
	}

	public static	Amount	addAmounts(Amount amount1, Amount amount2) throws CurrenciesDoNotMatchException
	{
		if(!amount1.currency.equals(amount2.currency))
		{
			throw new CurrenciesDoNotMatchException();
		}

		return	new	Amount(amount1.currency, amount1.amount	+ amount2.amount);
	}

	String currency;//	Should	be	an	Enum
	double amount;//	Should	ideally	use	BigDecimal
}