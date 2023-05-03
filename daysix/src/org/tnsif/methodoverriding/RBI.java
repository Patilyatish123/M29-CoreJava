package org.tnsif.methodoverriding;

public class RBI {
	public float getInterestrate() {
		return 8.45f;
	}

	
}

class hdfc extends RBI{
	public float getInterestrate() {
		System.out.println(super.getInterestrate());
		return 12.6f;
	}
}
