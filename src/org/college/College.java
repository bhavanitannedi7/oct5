package org.college;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.Set;

public class College {
public static void main(String[] args) {

	Set si = new HashSet();
	si.add("Bhanu");
	si.add("Vennela");
	si.add("Manikanth");
	si.add("Mahesh");
	int size = si.size();
	System.out.println(size);
	for (Object object : si) {
		String string = si.toString();
		System.out.println(string);
	}
	
//
//List li = new LinkedList();
//li.add(10);
//li.add(20);
//li.add(30);
//li.add(40);
//li.add(50);
//for (int i = 0; i < li.size(); i++) {
//	Object object = li.get(0);
//	System.out.println(object);
//	
//}
//
//for (Object object : li) {
//	System.out.println(object);
//	
//}
	
}
	
}
