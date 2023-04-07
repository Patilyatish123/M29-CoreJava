package org.tnsif.looping;

import java.util.Scanner;

public class WhileloopProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i+" ");
			i++;
		}
		

	}

}
