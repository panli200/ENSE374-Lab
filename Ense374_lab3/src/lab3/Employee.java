package lab3;

public class Employee {
		//fNam replaced by "firstName"
	    private String firstName;
	   //lastName replaced by "lastName"
	    private String lastName;
	    //address replaced by "addresses"
	    private String address;
	    //phoneNumber replaced by "phonephoneNumberber"
	    private String phoneNumber;
	    private String hireDate;
	    //startSalary replaced by"startSalary"
	    private String startSalary;

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

	    public String getfirstName()
	    {
	        return this.firstName;
	    }

	    public void setfirstName(String firstName)
	    {
	        this.firstName = firstName;
	    }

	    public String getlastName()
	    {
	        return this.lastName;
	    }

	    public String getaddress()
	    {
	        return this.address;
	    }

	    public String getphoneNumber()
	    {
	        return this.phoneNumber;
	    }

	    public String getHireDate()
	    {
	        return this.hireDate;
	    }

	    public String getstartSalary()
	    {
	        return this.startSalary;
	    }

	    public void printEmployeeData()
	    {
	        System.out.format(
	            "Name: %s %s| address: %s| Phone phoneNumberber: %s|" +
	            " Hire Date: %s| startSalary: %s \n",
	            this.firstName,
	            this.lastName,
	            this.address,
	            this.phoneNumber,
	            this.hireDate,
	            this.startSalary);
	    }

}
