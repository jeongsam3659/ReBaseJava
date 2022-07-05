package udmy.act15.re.inheritance;

import java.math.BigDecimal;

public class Employment extends Person{
	//state
	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;
	
	//
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString()+" * "+ title + " * "+ employerName + " * "+ employeeGrade;
	}
	
	
}
