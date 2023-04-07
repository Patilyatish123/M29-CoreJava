package org.tnsif.decisionmaking;
import java.util.Scanner;
public class Nestefifprogran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		
		if(num>0) {
			if(num<0) {
				System.out.println("Non-zero number");
			}
			else {
				System.out.println("zero/non-zero number");
			}
			
		}
		else {
			System.out.println("Either non-Zero/zero number");
		}
		

	}

}
