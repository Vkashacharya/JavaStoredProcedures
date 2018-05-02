package application;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

//Dynamic Array
//TO FETCH VALUES
//1.Enhanced For LOOP
//2.ITERATOR
//Collection should be specific with type:Generics

public class CollectionAndGenerics {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		int values[]=new int[4];//similar elements of array
//		Object values1[]=new Object[4];//array of object
//		values1[0]="Bikash";
//		values1[1]=7;
//		Collection<Integer> values=new ArrayList<>();
//		values.add(3);
//		values.add(11);
//		values.add(9);
//		Collections.sort(list);//only works with list so
		
		//i want to sort so use list interface which extends Collection
		ArrayList values = new ArrayList();
		values.add(3);
		values.add(99);
		values.add(2);
		
		
		
		Collections.sort(values);
		values.forEach(System.out::println);//Stream api...lambda expression
		//lambda expression with filter
		//lambda expression with method reference
	
		

//		values.add("Bikash");
//		values.add(5.8f);
		
		//1.Iterator
//		Iterator i=values.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		//2.Enhanced ForLoop
//		for(Object i:values) {
//			System.out.println(i);
//		}
		
		
		
	}

}
