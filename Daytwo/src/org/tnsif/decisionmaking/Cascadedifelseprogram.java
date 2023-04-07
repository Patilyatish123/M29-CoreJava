package org.tnsif.decisionmaking;
import java.util.Scanner;
public class Cascadedifelseprogram {


	public static void nain(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three value");
		float percentage1=s.nextInt();
		float percentage2=s.nextInt();
		float percentage3=s.nextInt();
		if(percentage1>percentage2 && percentage1>percentage3) {
			System.out.println("Person1 has the highest percerntage" );
		}
		else if(percentage2>percentage3 && percentage2>percentage1) {
			System.out.println("Person2 has the highest percerntage" );
		}
		else 
		{
		System.out.println("Person3 has the highest percerntage" );
		
	}

	}
}


