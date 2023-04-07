package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfelseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age and weight of a "+"donor");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=18 && weight>=40) {
		System.out.println("eligible to donate the blood");

	}
		else {
			System.out.println("you are not eligible to donate the blood"+"blood");
		}

}

	}
