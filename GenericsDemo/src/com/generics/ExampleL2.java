package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExampleL2 {

	public static void main(String[] args) {
		//Title:-Generics Part-2 || time safety || type casting
		List l=new ArrayList();
//		ArrayList<String> l1=new ArrayList<>();
//		l1.add("Bikash");
//		l1.add("Acharya");
////		l1.add(new Integer(10), null);
////		l.add(new Integer(10),null);
//		l.add("Bikash");
//		System.out.println(l1.size());
//		System.out.println(l);
//		System.out.println(l1);
//		String name=l1.get(0);
//		System.out.println(name);
		
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.clear();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		

	}

}
