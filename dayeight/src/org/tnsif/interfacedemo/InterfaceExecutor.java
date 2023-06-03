package org.tnsif.interfacedemo;

public class InterfaceExecutor {
public static void main(String[] args) {
		
		ATMMachine a1 = new AtmmachineChild();
		a1.deposit();
		a1.withdraw();
		
		ReceipeImplementable r = new ReceipeImplementable();
		r.setName("Yatish");
		System.out.println(r.displayName());
		
		NestedIntefaceExample n = new NestedIntefaceExample();
		n.setStr1("Yatish");
		n.setStr2("Patil");
		System.out.println(n.concatenate());

	}

}
