package org.college;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataTable {
public static void main(String[] args) {
	
	Map<String,String> emp= new LinkedHashMap<String,String>();
	
	emp.put("Bhavani", "12345");
	emp.put("Poona", "54321");
	emp.put("ramesh", "6789");
	
String string = emp.get("Poona");	
System.out.println(string);
//table[@class='a-normal a-align-center a-spacing-base']/tbody/tr[@aria-label='76% of reviews have 5 stars']/td[@class='a-text-right a-nowrap']/span[@class='a-size-base']/a


}
	
//
//List<ArrayList<String>> l = new ArrayList<ArrayList<String>>();
//ArrayList<String> a= new ArrayList<String>();
//a.add("bhavani@gmail.com");
//a.add("Bhavani");
//a.add("12345");
//ArrayList<String> b= new ArrayList<String>();
//b.add("sugandi@gmail.com");
//b.add("sugandi");
//b.add("54321");
//ArrayList<String> c= new ArrayList<String>();
//c.add("poona@gmail.com");
//c.add("poona");
//c.add("43521");
//
//l.add(a);
//l.add(b);
//l.add(c);
//
//ArrayList<String> arrayList = l.get(2);
//String string = arrayList.get(2);
//System.out.println(string);
//}
	
}
