package org.tnsif.decisionmaking;
import java.util.Scanner;
public class Switchcaseprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the song input");
		int songInput = s.nextInt();
		switch(songInput) {
		case 1 :
			System.out.println("calm down");
		break;
		case 2 :
			System.out.println("perfect");
			break;
		case 3 :
			System.out.println("marathi song");
			break;
		case 4 :
			System.out.println(" Hindi song");
			break;
		default :
			System.out.println("Invalid input");
		}

	}

}
