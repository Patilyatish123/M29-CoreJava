package org.tnsif.stramapi;
import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		//"->"   <--- this is lmbda expression 
		List<String>obj=Arrays.asList("Yatish","jay","raj","Prathameh");
		obj.stream().filter((i->i.length()>5)).forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().limit(2).forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().skip(2).forEach((i)->System.out.print(i+" "));
		
		
	}

}
