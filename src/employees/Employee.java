package employees;

public class Employee {
	
	private String firstName;
	private String surName;
	private double salary;
	private String gender;
	private int birthDate;
	private int idNumber;
	protected final double employeeBonusBase;
	
	public Employee (String firstName, String surName, double salary, String gender, int birthDate, int idNumber) {
		
		this.firstName = firstName;
		this.surName = surName;
		this.salary = salary;
		this.gender = gender;
		this.birthDate = birthDate;
		this.idNumber = idNumber;
		this.employeeBonusBase = 5000;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String secondName) {
		this.surName = secondName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
		
	}



