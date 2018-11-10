package lab3;
/**
 * class Employee for hold all data and functions
 * data include the full name, address, phone number, hiring date, start salary
 * function for printing 
 */
public class Employee {
		//fNam replaced by "firstName"
	    private String firstName;
	    //lN replaced by "lastName"
	    private String lastName;
	    //addr replaced by "addresses"
	    private String address;
	    //NUM replaced by "phoneNumber"
	    private String phoneNumber;
	    private String hireDate;
	    //dol replaced by"startSalary"
	    private String startSalary;
	    
	    //default Employee constructor
	    public Employee (){}

	    public void setSTUFFUP(String firstName, String lastName, String address, String phoneNumber,
	    String hireDate, String startSalary)
	    {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.hireDate = hireDate;
	        this.startSalary = startSalary;
	    }
/**
 * @return employee firstName
 */
	    public String getfirstName()
	    {
	        return this.firstName;
	    }
/**
 * @param firstName of employee
 */
	    public void setfirstName(String firstName)
	    {
	        this.firstName = firstName;
	    }
/**
 * @return last name of employee
 */
	    public String getlastName()
	    {
	        return this.lastName;
	    }
/**
 * @return the address of employee
 */
	    public String getaddress()
	    {
	        return this.address;
	    }
/**
 * @return the phone number of employee
 */
	    public String getphoneNumber()
	    {
	        return this.phoneNumber;
	    }
/**
 * @return the hire date of employee
 */
	    public String getHireDate()
	    {
	        return this.hireDate;
	    }
/**
 * @return the salary when company hiring the employee
 */
	    public String getstartSalary()
	    {
	        return this.startSalary;
	    }
/**
 * print function:print all employee information by this order
 * first name, last name, phone number, hiring data and start salary
 */
	    public void printEmployeeData()
	    {
	        System.out.format(
	            "Name: %s %s| Address: %s| Phone Number: %s|" +
	            " Hire Date: %s| startSalary: %s \n",
	            this.firstName,
	            this.lastName,
	            this.address,
	            this.phoneNumber,
	            this.hireDate,
	            this.startSalary);
	    }

}
