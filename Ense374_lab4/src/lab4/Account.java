package lab4;
/**
 * 
 * @author panli
 * The class Account is bank account it has child class SavingAccount and CheckingAccount
 * It includes protected data and functions
 */

public class Account {
	protected double balanceAmount=0;
	protected double monthlyInterestRate;
	
	/**
	 * default constructor of Account
	 */
	Account(){
		
	}
	/**
	 * 
	 * @param balance is bank balance amount
	 */
	public void setbalance(double balance)
	{
		balanceAmount=balance;
	}
	/**
	 * 
	 * @param rate is the monthly intrest rate
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
	 * @return balanceAmount
	 */
	public double getBalance(){
		return balanceAmount;
	}
	/**
	 * 
	 * @return montlyInterestRate/2
	 */
	public double getbiweeklyInterestRate() {
		return monthlyInterestRate/2;
	}
	/**
	 * print balance information
	 */
	public void printInfo()
	{
		String output="Please enter monthly interest rate:"+getmonthlyInterestRate()+
				"\nOriginal balance:"+balanceAmount;
		System.out.println(output);		
		
	}
	
}
