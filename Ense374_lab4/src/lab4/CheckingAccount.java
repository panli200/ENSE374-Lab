package lab4;
/**
 * Checking account 
 * @author Li Pan
 *
 */
public class CheckingAccount extends Account {
	double monthFee=8.0;
	/**
	 * Constructor
	 * @param initialBalance
	 */
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
		balanceAmount=initialBalance;
	}
	/**
	 * void set deposit
	 * @param deposit
	 * When the withdraw amount greater the balance exit
	 * Otherwise get the new balance
	 */
	public void setdeposit(double deposit)
	{
		depositAmount=deposit;
	}
	/**
	 * double getwithDraw()
	 * @return withDrawAmount
	 */
	public double getwithDraw()
	{
		return withdrawAmount;
	}
	/**
	 * 
	 * @return balance amount
	 */
	public double getbalance()
	{
		return balanceAmount;
	}
	/**
	 * print information after withdraw from checking account
	 */
	public void print()
	{
		String output="Withdraw"+withdrawAmount+
				"\nThe balance after withdraw is"+balanceAmount;
		System.out.println(output);
		
		
	}
}
