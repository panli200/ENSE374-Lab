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
	protected static int id;
	/**
	 * Constructor
	 * @param initialBalance double 
	 * @param ID int
	 */
	public Account (double initialBalance, int ID)
	{
		balanceAmount=initialBalance;
		id=ID;	
	}
	
	/**
	 * print original balance information
	 */
	public void printInfo()
	{
		System.out.println("\nOriginal balance:"+balanceAmount);
		
	}
	
	
}
