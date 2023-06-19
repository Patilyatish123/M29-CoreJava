package org.tnsif.collection;
import java.util.LinkedHashSet;

public class LinkedHashedSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Neha");
		lhs.add("Sakshi");
		lhs.add("Shrutika");
		lhs.add("Purvi");
		lhs.add("Rajashree");
		lhs.add("Purvi");
		lhs.add(null);
		System.out.println(lhs);
		
		

	}

}
