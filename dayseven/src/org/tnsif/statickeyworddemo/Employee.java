package org.tnsif.statickeyworddemo;

public class Employee {
	private int employeeId;
	private String employeeName;
	
	static String companyName="TNS india foundation";

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	
	
	
	
	

}
