package lab4;
/**
 * ENSE374 LAB4
 * @author panli
 * SavingAccount class has deposit , two type interest monthly interest and bi-weekly interest
 * According to different deposit interest to calculate to new balance
 */
public class SavingAccount extends Account{
	//double data type for monthly interest rate
	double monthlyInterestRate;
	
	/**
	 * constructor of saving account
	 * @param initialBalance
	 */
	public SavingAccount(double initialBalance) {
		super(initialBalance,id);
		// TODO Auto-generated constructor stub
		balanceAmount=initialBalance;
		
	}
	/**
	 * set depositAmount
	 * @param deposit
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
	
	/** 
	 * set balance amount 
	 * @param balance is bank balanceAmount
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
	 * set monthly interest rate
	 * @param deposit
	 */
	public void setmonthlyInterestRate(double rate)
	{
		monthlyInterestRate=rate;
	}
	/**
	 * 
	 * @return monthlyInterestRate
	 */
	public double getmonthlyInterestRate()
	{
		return monthlyInterestRate;
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
	 */
	public void calculateMonthlyDeposit()
	{
		
		balanceAmount=balanceAmount*(1+monthlyInterestRate);
		balanceAmount+=depositAmount;
	}
	/**
	 * Calculate bi_weekly deposit function
	 * Function for calculate the balance amount until begin of each two weeks,
	 * If there is new deposit, add the new deposit to the balance amount
	 */
	public void calculateWeeklyDeposit()
	{
		
		balanceAmount=balanceAmount*(1+setbiweeklyInterestRate());
		balanceAmount+=depositAmount;
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
