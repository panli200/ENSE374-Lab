package lab3;

import java.util.Scanner;

public class EmployeeApplication {
	
	public static void main(String[] args)
    {
		// eD=employeeId
    	Employee[] employeeId = new Employee[3];
     
		/**Variable not used, do we delete this line:
		int eDSize = 0;
		*/
    	//eA=employeeArray
		EmployeeApplication employeeArray = new EmployeeApplication();
		employeeArray.addEs(employeeId);
		employeeArray.prints(employeeId);
		Employee[] sorted = new Employee[3];
		sorted = employeeArray.sorteDByName(employeeId,3);
		employeeArray.prints(sorted);

    }


	public Employee[] sorteDByName(Employee[] database, int databaseSize)
    {
		//srtD=>sortedDatabase
		 Employee[] sortedDatabase = database;
		 
		 
        for(int i=1; i<(databaseSize); i++)
        {
        	
   
        	
            for(int j=0; j<(databaseSize-i); j++)
            {
            	/**
            	getIn() not clear parameter should getIn
            	we add parameter getlastName()
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

	public void addEs(Employee[] employeeId)
	{	
		//Import 'Scanner(java.util)
		Scanner input = new Scanner(System.in);
		
		/**change these unclear variable name:
		 fNam=>firstName
		 lN=>lastName
		 addr=>address
		 NUM=>phoneNumber
		 dol=>startSalary
		 */
		for (int i = 0; i < 3; ++i)
		{
			employeeId[i] = new Employee();
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

			employeeId[i].setSTUFFUP(firstName, lastName, address,  phoneNumber, hireDate,  startSalary);



		}
	}

	public void prints(Employee[] employeeId)
	{	/**
	 	
	 	*/
		
		for (int i = 0; i < 3; ++i)
		{
			employeeId[i].printEmployeeData();

		}

	}

}
