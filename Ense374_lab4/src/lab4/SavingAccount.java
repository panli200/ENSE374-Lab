package lab4;
/**
 * ENSE374 LAB4
 * @author Li Pan
 * SavingAccount class has deposit , two type interest monthly interest and bi-weekly interest
 * According to different deposit interest to calculate to new balance
 */
public class SavingAccount extends Account{
	//double data type for monthly interest rate
	private final double monthlyInterestRate=0.01;
	
	/**
	 * Constructor of saving account
	 * @param initialBalance double
	 *
	 */
	public SavingAccount(double initialBalance) {
		super(initialBalance,id);
		// TODO Auto-generated constructor stub
		balanceAmount=initialBalance;
		
	}
	/**
	 * set depositAmount
	 * @param  deposit double
	 */
	public void setDeposit(double deposit)
	{
		depositAmount=deposit;
	}
	/**
	 * getDeposit()
	 * @return depositAmount
	 */
	public double getDeposit()
	{
		return depositAmount;
	}
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
	 * set balance amount 
	 * @param balance  double
	 */
	public void setBalance(double balance)
	{
		balanceAmount=balance;
	}
	
	/**
	 * get balance
	 * @return balanceAmount
	 */
	public double getBalance()
	{
		return balanceAmount;
	}
	
	/**
	 * 
	 * @return montlyInterestRate/2
	 */
	public double setbiweeklyInterestRate() 
	{
		return monthlyInterestRate/2;
	}

	/**
	 * Calculate monthly deposit function
	 * Function for calculate the balance amount until begin of each month,
	 * If there is new deposit, add the new deposit to the balance amount
	 * @return balanceAmount
	 */
	public double calculateMonthlyDeposit()
	{
		
		balanceAmount=balanceAmount*(1+monthlyInterestRate);
		balanceAmount+=depositAmount;
		return balanceAmount;
	}
	
	/**
	 * Calculate bi_weekly deposit function
	 * Function for calculate the balance amount until begin of each two weeks,
	 * If there is new deposit, add the new deposit to the balance amount
	 * @return balanceAmount;
	 */
	public double calculateWeeklyDeposit()
	{
		
		balanceAmount=balanceAmount*(1+setbiweeklyInterestRate());
		balanceAmount+=depositAmount;
		return balanceAmount;
	}
	
	/**
	 * print deposit amount and balance amount after deposit
	 */
	public void print()
	{
		String output="Deposit: "+depositAmount+
				"\nThe balance after deposit: "+balanceAmount;
		System.out.println(output);
	}

}
