package lab3;

public class Employee {
	 private String fNam;
	    private String lN;
	    private String addr;
	    private String NUM;
	    private String hireDate;
	    private String dol;

	    public Employee (){}

	    public void setSTUFFUP(String fNam, String lN, String addr, String NUM,
	    String hireDate, String dol)
	    {
	        this.fNam = fNam;
	        this.lN = lN;
	        this.addr = addr;
	        this.NUM = NUM;
	        this.hireDate = hireDate;
	        this.dol = dol;
	    }

	    public String getfNam()
	    {
	        return this.fNam;
	    }

	    public void setfNam(String fNam)
	    {
	        this.fNam = fNam;
	    }

	    public String getlN()
	    {
	        return this.lN;
	    }

	    public String getaddr()
	    {
	        return this.addr;
	    }

	    public String getNUM()
	    {
	        return this.NUM;
	    }

	    public String getHireDate()
	    {
	        return this.hireDate;
	    }

	    public String getdol()
	    {
	        return this.dol;
	    }

	    public void printEmployeeData()
	    {
	        System.out.format(
	            "Name: %s %s| addr: %s| Phone Number: %s|" +
	            " Hire Date: %s| dol: %s \n",
	            this.fNam,
	            this.lN,
	            this.addr,
	            this.NUM,
	            this.hireDate,
	            this.dol);
	    }

}
