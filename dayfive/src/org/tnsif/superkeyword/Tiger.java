package org.tnsif.superkeyword;

public class Tiger extends Animal {
	public String animalType="Tiger-Wild";
	public int noOfLegs=4;
	
	public Tiger() {
		
		super();
		System.out.println("Tiger class constuctor-Child");
	
	}
	
	public void diaplay() {
		
		super.display();
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal Type:"+animalType);
		System.out.println("Animal Type:"+noOfLegs);
	}
	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	

}
