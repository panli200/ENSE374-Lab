package lab4;
/**
 *
 * @author panli
 * SavingAccount class has deposit 
 */
public class SavingAccount extends Account{
	//double depositAmount 
	double depositAmount=0;	
	/**
	 * default constructor SavingAccount
	 */
	SavingAccount(){
	
	}
	/**
	 * @param deposit
	 */
	public void setdeposit(double deposit)
	{
			depositAmount=deposit;
			balanceAmount*=monthlyInterestRate;
			balanceAmount+=depositAmount;
		
	}
	/** 
	 * @return depositAmount
	 */
	public double getdeposit()
	{
		return depositAmount;
	}
	/**
	 * print balance information after deposit
	 */
	public void print()
	{
		String output="Deposit: "+depositAmount+
				"\nThe balance after deposit: "+balanceAmount;
		System.out.println(output);
	}
}
