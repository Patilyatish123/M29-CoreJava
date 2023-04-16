//program to demonstrate single inheritance
//parent class
package org.tnsif.singleinheritance;

public class Citizen {
	
	private String name;
	private String adharNo;
	private String city;
	private String contactNo;
	
	//default constructor
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Citizen(String name, String adharNo, String city, String contactNo) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.city = city;
		this.contactNo = contactNo;
	}

	//getter and setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	//generate toSting method

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", city=" + city + ", contactNo=" + contactNo
				+ ", getName()=" + getName() + ", getAdharNo()=" + getAdharNo() + ", getCity()=" + getCity()
				+ ", getContactNo()=" + getContactNo() + "]";
	}
	
	
		

	
}
