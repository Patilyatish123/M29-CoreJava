package org.tnsif.collection;
import java.util.Comparator;
public class StudentSortByName implements Comparator<Collegestudent>{
	@Override
	public int compare(Collegestudent o1, Collegestudent o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());

	}

}
