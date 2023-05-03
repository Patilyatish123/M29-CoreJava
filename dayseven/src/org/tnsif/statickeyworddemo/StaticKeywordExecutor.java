package org.tnsif.statickeyworddemo;

public class StaticKeywordExecutor {
	public static void main(String [] args) {
		System.out.println(Employee.companyName);
		Employee e= new Employee(101,"Abhinav R");
		System.out.println(e);
		Employee s= new Employee(102,"Abhinav R");
		System.out.println(s);

		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
	}

}

		
		