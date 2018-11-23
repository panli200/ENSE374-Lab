package lab3;

import java.util.Scanner;
/**
 * @author panli
 * This class for get employee information from input 
 * Sorting the employee data by their last name
 * print all the information collected
 */
public class EmployeeApplication {
	
	private Scanner input;
	public static void main(String[] args)
    {
		// eD=>employeeData
    	Employee[] employeeData = new Employee[3];
     
		/**
		*Variable not used, do we delete this line:
		*int eDSize = 0;
		*/
    	//eA=>employeeArray
		EmployeeApplication employeeArray = new EmployeeApplication();
		employeeArray.addEs(employeeData);
		employeeArray.prints(employeeData);
		Employee[] sorted = new Employee[3];
		sorted = employeeArray.sorteDByName(employeeData,3);
		employeeArray.prints(sorted);

    }

/**
 * @param database for hold data for employee
 * @param databaseSize is the size of database
 * @return the sortedDatabase 
 */
	public Employee[] sorteDByName(Employee[] database, int databaseSize)
    {
		//srtD=>sortedDatabase
		 Employee[] sortedDatabase = database;
		 
		 /**
		  * for all employee data get sorted by their last name 
		  */
        for(int i=1; i<(databaseSize); i++)
        {
        	/**
        	 * compare the two data besides and sort
        	 */
            for(int j=0; j<(databaseSize-i); j++)
            {
            	/**
            	*getIn() not clear parameter should getIn
            	*we add parameter getlastName()
            	*use temper database hold the data need swap
            	*/
                if (sortedDatabase[j].getlastName().compareTo(sortedDatabase[j+1].getlastName())>0)
                {
                	Employee temp = sortedDatabase[j+1];
                    sortedDatabase[j+1] = sortedDatabase[j];
                    sortedDatabase[j] = temp;
                }
            }
        }
        return sortedDatabase;
    }
/**
 * @param employeeData for save the employee data
 */
	public void addEs(Employee[] employeeData)
	{	
		input = new Scanner(System.in);
		
		/**change these unclear variable name:
		 fNam=>firstName
		 lN=>lastName
		 addr=>address
		 NUM=>phoneNumber
		 dol=>startSalary
		 */
		for (int i = 0; i < 3; ++i)
		{
			employeeData[i] = new Employee();
			System.out.print("Enter an Employee's First Name: ");
			String firstName = input.nextLine();
			System.out.print("Enter an Employee's Last  Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter an Employee's address: ");
			String address = input.nextLine();
			System.out.print("Enter an Employee's Phone Number: ");
			String phoneNumber = input.nextLine();
			System.out.print("Enter an Employee's Hire Date: ");
			String hireDate = input.nextLine();
			System.out.print("Enter an Employee's starting Salary: ");
			String startSalary = input.nextLine();

			employeeData[i].setSTUFFUP(firstName, lastName, address,  phoneNumber, hireDate,  startSalary);



		}
	}
	/**
	 * @param employeeData  for save the employee data properly
	 */
	public void prints(Employee[] employeeData)
	{	
	
		
		for (int i = 0; i < 3; ++i)
		{
			employeeData[i].printEmployeeData();

		}

	}

}
