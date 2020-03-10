
public class Money
{
	private int dollars;
	private int cents;
	
	public Money() 
	{
		dollars = 0;
		cents = 0;
	}
	
	public Money(int dollars, int cents) 
	{
		this.dollars = dollars;
		this.cents = cents;
	}

	/**
	 * This Returns the dollar value of this object
	 * @return dollars
	 */
	public int getDollars() 
	{
		return dollars;
	}

	/**
	 * This Returns the cents value of this object
	 * @return cents
	 */
	public int getCents() 
	{
		return cents;
	}
	
	public double Add(Money other)
	{
		return ((this.dollars + (this.cents / 100.0)) + (other.getDollars() + (other.getCents() / 100.0)));
	}
	
	/**
	 * Overriding the toString Method
	 */
	public String toString()
	{
		return "$" + (dollars + (cents / 100.0));
	}
	
	/**
	 * Checks both value are equal or not
	 */
	public boolean equals(Object other)
	{
		return (other != null && this.getClass().equals(other.getClass()) && (compareTo((Money) other) == 0));
	}
	
	/**
	 * This will compare the value of Money that is passed through with the value of Money in another object of type money
	 * 
	 * @param other - This other is of type Money
	 * @return returns 0 if they are both equal and returns 1 if they both are not equal
	 */
	public int compareTo(Money other)
	{
		if (dollars == other.getDollars()) 
		{
			if (cents == other.getCents()) 
			{
				return 0;
			}
		}
		return 1;
	}
}
