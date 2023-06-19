package org.tnsif.collection;
import java.util.Comparator;
public class StudentSortbyper implements Comparator<Collegestudent> {
	@Override
	public int compare(Collegestudent o1, Collegestudent o2) {
		// TODO Auto-generated method stub
		return   (int) (o1.getPer()-o2.getPer());

	}

}
