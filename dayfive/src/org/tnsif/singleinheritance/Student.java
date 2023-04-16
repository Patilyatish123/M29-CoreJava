//child class
package org.tnsif.singleinheritance;
//every inheritance i

public class Student extends Citizen {
	
	//private data members
	private String college;
	private int rollno;
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parametrized constructor
	public Student(String name, String adharNo, String city, String contactNo) {
		super(name, adharNo, city, contactNo);
		this.college = college;
		this.rollno = rollno;
	}
	
	//getter and setter method
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Student [college=" + college + ", rollno=" + rollno + ", getName()=" + getName() + ", getAdharNo()="
				+ getAdharNo() + ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + "]";
	}
	
	
	
	

}
