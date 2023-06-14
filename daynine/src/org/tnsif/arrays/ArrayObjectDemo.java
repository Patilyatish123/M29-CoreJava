package org.tnsif.arrays;

public class ArrayObjectDemo {
public static void main(String[] args) {
		
		Customer arr[] = new Customer[2];
		
		arr[0] = new Customer(12345, "yatish");
		arr[1] = new Customer(34589, "raj");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].getId()+ " " + arr[i].getName() );
		}

	}

}
