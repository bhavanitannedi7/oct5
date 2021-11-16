package org.college;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add('F');
		li.add("Selenium");
		li.add(10000099l);

		
	List mi = new ArrayList();
	mi.add('F');
	mi.add("Bhanu");
mi.retainAll(mi);
li.retainAll(mi);
System.out.println(li);


		// boolean retainAll = mi.retainAll(li);
		// System.out.println(retainAll);

	}
}
