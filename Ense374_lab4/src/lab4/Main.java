package lab4;
/**
 * Main class
 * Test program set two account using different deposit method
 * One account deposit $500 for each month
 * Another account deposit $250 for each two weeks
 * @author Li Pan
 * ENSE374 lab4
 */
public class Main
{	
	public static void main(String[] args)
	{
		/**
		 * set up a new account
		 */
		Account a=new Account(0);
		a.printInfo();
		/**
		 * set up a new saving account
		 */
		SavingAccount s=new SavingAccount(0);
		s.setmonthlyInterestRate(0.015);
		/**
		 * deposit $500 for each month then check the balance after each deposit
		 */
		for(int i=0;i<12;i++)
		{
		s.setdeposit(500);
		s.calculateMonthlyDeposit();
		s.print();
		}
		
		
		/**
		 * set up aother new account
		 */
		Account a1=new Account(0);
		a1.printInfo();
		/**
		 * set up another new saving account
		 */
		SavingAccount s1=new SavingAccount(0);
		s1.setmonthlyInterestRate(0.015);
		/**
		 * deposit $250 for each two weeks then check the balance after each deposit
		 */
		for(int i=0;i<24;i++)
		{
		s1.setdeposit(250);
		s1.calculateWeeklyDeposit();
		s1.print();
		}
		
	
		
	}
}
