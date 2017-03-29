/*Homework #1
need Date.java , Employee.java , and SalariedEmployee.java make test.java and Administrator.java
in Employee.java replace Jan. with January*/

public class Administrator extends SalariedEmployee{

	private String VicePresident;
	private String Executive;
	private String Supervisor;
	
	public Administrator(String VicePresident, String Executive, String Supervisor){
		this.VicePresident = VicePresident;
		this.Executive = Executive;
		this.Supervisor = Supervisor;
	}
	
	public Administrator(String theName, Date theDate, double theSalary, String VicePresident, String Executive, String Supervisor){
		super(theName, theDate, theSalary); //gets from salaried employee
		
		this.VicePresident = VicePresident;
		this.Executive = Executive;
		this.Supervisor = Supervisor;
	}		
		
	
	public String getVicePresident(){
		return VicePresident;
	}
	public String getExecutive(){
		return Executive;
	}
	public String getSupervisor(){
		return Supervisor;
	}
	
	
    public String toString( ){
        return (super.toString() + " VP: " + getVicePresident() + " Executive: " + getExecutive() + " Supervisor: " + getSupervisor());
    }

    public boolean equals(Administrator other){
    	boolean e = super.equals(other) //checks equals for the name, hire date, and salary
    			&& this.VicePresident.equals(other.VicePresident) 
    			&& this.Executive.equals(other.Executive) 
    			&& this.Supervisor.equals(other.Supervisor);
        return e;
    }

	
}
