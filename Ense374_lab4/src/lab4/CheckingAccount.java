package lab4;
/**
 * Checking account 
 * @author Li Pan
 *
 */
public class CheckingAccount extends Account {
	
	//checking account has month fee double type 
	double monthFee=8.0;
	/**
	 * Constructor of checking account
	 * @param initialBalance double
	 */
	public CheckingAccount(double initialBalance) {
		super(initialBalance,id);
		// TODO Auto-generated constructor stub
		balanceAmount=initialBalance;
	}
	/**
	 * void set deposit
	 * @param deposit
	 * When the withdraw amount greater the balance exit
	 * Otherwise get the new balance
	 */
	public void setDeposit(double deposit)
	{
		depositAmount=deposit;
	}
	/**
	 * 
	 * @return depositAmount
	 */
	public double getDeposit()
	{
		return depositAmount;
	}
	/**
	 * 
	 * @param deposit double
	 */
	public void setwithDraw(double deposit)
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
	 * get new balance of checking account
	 * @return balance amount deduct month fee
	 */
	public double getBalance()
	{	
		return balanceAmount-monthFee;
	}
	/**
	 * boolean to check the withdraw is valid
	 * @param withdrawAmount double
	 * @return true or false
	 */
	public boolean withdraw(double withdrawAmount)
	{
		if(withdrawAmount>balanceAmount) {
			System.out.println("Over the limit!");
			return false;
		}else {
			balanceAmount-=withdrawAmount;
	
			return true;
		}
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
