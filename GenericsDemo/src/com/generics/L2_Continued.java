package com.generics;

import java.util.ArrayList;

public class L2_Continued {

	public static void main(String[] args) {
		
		
		
/***[1] Polymorphism only applicable for Base Type not Parameter Type

		ArrayList<String> l=new ArrayList<>();
		List<String>l1=new ArrayList<>();
		Collection<String>l2=new ArrayList<>();
		Collection<Object>l3=new ArrayList<String>();
		
		
	[2] Any class or interface but not primitives
		ArrayList<int>l=new ArrayList<>();
		
	*/	
		
	
		/*** [Before]
		  
		 class ArrayList{
		 add(Object e){
		 }
		 object get(int index)
		 
		 [After]
		 class ArrayList<T>
		 add(T a)
		 T get(int index)
		 
		 
		*/
		
		
		int[]a= {1,2};
		int[]b= {3,4};
		int []c= {5,6};
		String[]d= {"a","b","c"};
		
		
	}

}
