package lab4;
/**
 * 
 * @author panli
 * main class
 */
public class Main
{
	public static void main(String[] args)
	{
		Account a=new Account();
		a.setbalance(0);
		a.setmonthlyInterestRate(0.15);
		
		//CheckingAccount c=new CheckingAccount();	
		SavingAccount s=new SavingAccount();
		
		s.setdeposit(500);
		a.printInfo();
		s.print();
	
		
	}
}
