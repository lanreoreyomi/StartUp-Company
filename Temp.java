package company;
/*
 * Course Name: Computer Programming 
 * Student Name: Lanre Oreyomi 
 *Student Number: 040929184
 * */




import java.util.Scanner;
/**
 * The Temp Class is a subclass of Employee,
 * Temp defines a end contract date  field 
 * Parent class : Employee
 * @author Lanre Oreyomi
 * @version 1.3
 */
public class Temp extends Employee {

	/**
	 * @serial
	 */
	private static final long serialVersionUID = 1L;
	private OurDate endContractDate;

	/**
	 * Default Constructor
	 */
	public Temp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded Constructor, take 4 parameters for Staff
	 *  
	 * @param name Temp employee's name
	 * @param employeeNumber Temp employee's id
	 * @param startDate Temp employee's Starting employee date
	 * @param salary temp mployee's name
	 */
	public Temp(String name, int employeeNumber, OurDate startDate, double salary) {
		super(name, employeeNumber, startDate, salary);
	}

	/**
	 * Overloaded Constructor, take 5 parameters for Staff
	 * 
	 * @param name Employee's name
	 * @param employeeNumber Employee's id
	 * @param startDate Start of contract Date
	 * @param salary  Salary of the Temp employee
	 * @param endContractDate End of contract Date
	 */
	public Temp(String name, int employeeNumber, OurDate startDate, double salary, OurDate endContractDate) {
		super(name, employeeNumber, startDate, salary);
		this.endContractDate = endContractDate;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter : get the End Contract Date
	 * 
	 * @return endContractDate
	 */
	public OurDate getEndContractDate() {
		return endContractDate;
	}

	/**
	 * Setter : set the End Contract Date
	 * 
	 * @param endContractDate End of employee date
	 */
	public void setEndContractDate(OurDate endContractDate) {
		this.endContractDate = endContractDate;
	}

	/*
	 * Overloaded load ExtraInfo class, load temp employee ending date info Return :
	 * no
	 */
	@Override
	public void loadExtraInfo(Scanner input) {
		// TODO Auto-generated method stub
		int endYear;
		int endMonth;
		int endDay;
		OurDate endContractDate;

		System.out.println("END YEAR IS: ");
		input.nextLine();
		endYear = input.nextInt();
		System.out.println("MONTH: ");
		endMonth = input.nextInt();
		System.out.println("DAY: ");
		endDay = input.nextInt();

		endContractDate = new OurDate(endYear, endMonth, endDay);
		this.setEndContractDate(endContractDate);
	}

	/*
	 * Overided toString method from parent class Employee return : String
	 */
	@Override
	public String toString() {
		return super.toString() + "\tTemp [endContractDate=" + endContractDate + "]";
	}

	/*
	 * Overided equals method from parent class Employee return : boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (endContractDate == null) {
			if (other.endContractDate != null)
				return false;
		} else if (!endContractDate.equals(other.endContractDate))
			return false;
		return true;
	}

	@Override
	public String getExtraInfo() {
		// TODO Auto-generated method stub
		return endContractDate.toString();
	}

	@Override
	public void setExtraInfo(String s) {
		//this.endContractDate = s;
		// TODO Auto-generated method stub
		
	}

}