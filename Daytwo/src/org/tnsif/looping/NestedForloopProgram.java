package org.tnsif.looping;

public class NestedForloopProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print star square pattern
		int row=4, column=4;
		
	//nested for loop
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
