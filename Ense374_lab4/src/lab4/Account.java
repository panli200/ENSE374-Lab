package lab4;
/**
 * ENSE374 LAB4
 * @author Li Pan
 * The class Account is bank account it has child class SavingAccount and CheckingAccount
 * It includes protected data and functions
 */

public class Account {
	//protected data can used by inheritance class
	protected double balanceAmount;
	protected double depositAmount;	
	protected double withdrawAmount;
	/**
	 * 
	 * @param initialBalance
	 * constructor no return type and has the same name as the class
	 */
	public Account(double initialBalance)
	{
		balanceAmount=initialBalance;
	}
	
	
	/**
	 * print balance information
	 */
	public void printInfo()
	{
		System.out.println("\nOriginal balance:"+balanceAmount);
		
	}
	/**
	 * 
	 * @param withdrawAmount
	 * @return
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
	
}
