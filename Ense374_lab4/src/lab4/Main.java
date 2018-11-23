package lab4;
import java.util.Scanner;
/**
 * Main Class For asking user a few different questions about their requirement 
 * Base on the user's choice to check the each options functions  
 * test the customer deposit 500 each month for 12 month;or deposit 250 for biweekly
 * We can see deposit 250 each two weeks we can get more money
 * @author Li Pan
 *
 */
public class Main
{ 
    /**
     * The main menu the customer will see
     * @param args string[]
     */
	public static void main(String [] args){
        System.out.println("Welcome to the Loyal Bank: Press button to continue");
         try
        {
            System.in.read();
        } 
         //get the answer from customer
        catch(Exception e)
        {} 
        Main obj = new Main();
        obj.mainMenu();
    }
	/**
	 * void print menu for choosing checking,saving or logout
	 */
    public void menuSavChe(){
        System.out.println("1. Checking");
        System.out.println("2. Saving");
        System.out.println("3. MoneyMarketAccount");
        System.out.println("4. Logout");
        System.out.print("Enter Selection: ");
    }
    /**
     * void print out menu for choose the function for deposit, withdraw, view balance or logout
     */
    public void menuDepWith(){
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. View Account Balance");
        System.out.println("4. Logout");
        System.out.print("Enter Selection: ");
    }
    /**
     * void print out which type of deposit user choose for deposit 
     * monthly deposit or biweekly deposit
     */
    public void menuDepType(){
        System.out.println("1. Month Deposit");
        System.out.println("2. BiWeekly Deposit");
        System.out.println("3. Logout");
    }
    public void menuHighInterest(){
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Logout");
    }
    /**
     * void get the type of account option from user 
     */
    public void mainMenu(){
        menuSavChe();
        int selection = input.nextInt();
        switch(selection){
            case 1:
            optionChecking();
            break;
            case 2:
            optionSavings();
            break;
            case 3:
            optionMoneyMarketSaving();
            case 4:
            logOut();
            break;
        }
    }
    /**
     * get the option from customer in their specific account
     */
    public void optionChecking(){
        menuDepWith();
        int inputOption = input.nextInt();
        switch(inputOption){
            case 1:
            depositChecking();
            break;
            
            case 2:
            withdrawChecking();
            break;
            
            case 3:
            accountInfoChecking();
            break;

            case 4:
            logOut();
            break;
        }
    }
    
    /**
     * checking account for deposit
     */
    public void depositChecking(){
         System.out.print("Enter deposit amount: ");
         double amount = input.nextDouble();
         withraw_Deposit.setDeposit(amount);
         System.out.println("Savings Balance is: " + withraw_Deposit.getBalance());
         mainMenu();
    }
    /**
     * checking account for withdraw
     */
    public void withdrawChecking(){
        System.out.print("Enter withdraw amount: ");
        double amount = input.nextDouble();
        withraw_Deposit.withdraw(amount);
        System.out.println("Savings Balance is: " + withraw_Deposit.getBalance());
        mainMenu();
    }
    /**
     * print information for checking account
     */
    public void accountInfoChecking(){
        System.out.println("Checking balance is: " + withraw_Deposit.getBalance());
        mainMenu();

    }
    /**
     * options for saving account deposit, withdraw, information, logout
     */
    public void optionSavings(){
        menuDepWith();
        int inputoption = input.nextInt();
        switch(inputoption){
            case 1:
            savingsDeposit();
            break;

            case 2:
            savingsWithdraw();
            break;

            case 3:
            accountInfoSavings();
            break;

            case 4:
            logOut();
            break;
        }
    }
    /**
     * saving deposit has two type deposit by monthly or by biweekly
     */
    public void  savingsDeposit(){
    	menuDepType();
        int inputoption = input.nextInt();
        switch(inputoption){
            case 1:
            monthlyDeosit();
            break;

            case 2:
            biweeklyDeposit();
            break;

            case 3:
            logOut();
            break;
        }
    }
    /**
     * option 
     */
    public void optionMoneyMarketSaving() {
    	menuHighInterest();
    	int inputOptionHighInterest = input.nextInt();
    	switch(inputOptionHighInterest){
        case 1:
        depositHighInterestSaving();
        break;
        
        case 2:
        withdrawHighInterestSaving();
        break;
        
        case 3:
        accountInfoHighInterestSaving();
        break;

        case 4:
        logOut();
        break;
    	}
    }
    /**
     * if the user choose monthly deposit 
     */
     public void monthlyDeosit(){
         System.out.print("Enter deposit amount: ");
         double amount = input.nextDouble();
         withdrawDeposit.setDeposit(amount);
         System.out.println("Savings Balance is: " + withdrawDeposit.calculateMonthlyDeposit());
         mainMenu();
    }
   /**
    * if the user choose biweekly deposit
    */
	public void biweeklyDeposit(){
         System.out.print("Enter deposit amount: ");
         double amount = input.nextDouble();
         withdrawDeposit.setDeposit(amount);
         System.out.println("Savings Balance is: " + withdrawDeposit.calculateBiWeeklyDeposit());
         mainMenu();
    }
	/**
	 * if the user withdraw money from saving
	 */
    public void savingsWithdraw(){
        System.out.print("Enter withdraw amount: ");
        double amount = input.nextDouble();
        withdrawDeposit.setDeposit(amount);
        System.out.println("Saving Balance is: " + withdrawDeposit.getBalance());
        mainMenu();
    }
    /**
     * print out the account information
     */
    public void accountInfoSavings(){
        System.out.println("Savings Balance is: " + withdrawDeposit.getBalance());
        mainMenu();
    }
    /**
     * check the deposit amount if it over the deposit limit take the deposit 
     */
    public void depositHighInterestSaving() {
    	 System.out.print("The mini deposit is$5000.00. Please enter deposit amount: ");
    	 double amount = input.nextDouble();
         System.out.println("Savings Balance is: " + withdraw_deposit.moneyDepositAccept(amount));
         mainMenu();
    	
    }
    /**
     * check the withdraw if it over balance return false, else accept withdraw
     */
    public void withdrawHighInterestSaving() {
    	 System.out.print("Enter withdraw amount: ");
    	 double amount = input.nextDouble();
         System.out.println("Saving Balance is: " + withdraw_deposit.withdrawAccept(amount));
         mainMenu();
    	
    }
    /**
     * give the information for high interest saving account
     */
    public void accountInfoHighInterestSaving() {
    	System.out.println("High Interest Saving Balance is: " + withdrawDeposit.getBalance());
        mainMenu();
    	
    }
    
    /**
     * whenever user choose logout, end the program running
     */
    public void logOut(){
        System.exit(0);
    }
    /**
     * set up an new account for saving and checking
     */
    SavingAccount withdrawDeposit = new SavingAccount(0);
    CheckingAccount withraw_Deposit= new CheckingAccount(0);
    MoneyMarketAccount withdraw_deposit= new MoneyMarketAccount(0);
    Scanner input = new Scanner(System.in);
}