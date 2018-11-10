package lab4;
/**
 * 
 * @author panli
 *
 */
public class CheckingAccount extends Account {
	//double withDrawAmount 
	double withDrawAmount=0;
	/**
	 *
	 * @param withdraw
	 * When the withdraw amount greater the balance exit
	 * Otherwise get the new balance
	 */
	public void setdeposit(double withdraw)
	{	
		 
		if(withdraw>balanceAmount)
		{
			System.out.println("Over the limit of your balance");
			System.exit(0);
		}
		
		else 
			withDrawAmount=withdraw;
			balanceAmount-=withdraw;
		
	}
	/**
	 * 
	 * @return withDrawAmount
	 */
	public double getwithDraw()
	{
		return withDrawAmount;
	}
	/**
	 * print information after withdraw
	 */
	public void print()
	{
		String output="Withdraw"+withDrawAmount+
				"\nThe balance after withdraw is"+balanceAmount;
		System.out.println(output);
		
		
	}
}
