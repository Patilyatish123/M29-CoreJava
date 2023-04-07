//Program to demonstrate label for loop
//labell is not required
package org.tnsif.looping;

public class LabelledforLoopProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//labell
		outer:
			for(int i=1;i<=5;i++) {
		System.out.println();
		
		inner:
			for(int j=1;j<=5;j++) {
				System.out.print(j+" ");
				if(j==4)
				break;
			}

	}
	}
}
