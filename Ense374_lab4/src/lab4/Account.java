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
	 * Constructor
	 * @param initialBalance
	 */
	public Account (double initialBalance)
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
	 * boolean for checking the withdraw is ok
	 * @param withdrawAmount
	 * @return true or false
	 */
	
}
