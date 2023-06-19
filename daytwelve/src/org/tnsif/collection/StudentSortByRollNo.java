package org.tnsif.collection;
import java.util.Comparator;
public class StudentSortByRollNo implements Comparator<Collegestudent>{

	@Override
	public int compare(Collegestudent o1, Collegestudent o2) {
		// TODO Auto-generated method stub
		return o1.getRollNo()-o2.getRollNo();

	}

}
