package com.generics;

public class L_2_StillContinues_Part2<T> {

	T ob;
	
	L_2_StillContinues_Part2(T ob){
		this.ob=ob;
	}
	public void show() {
		System.out.println("The type of method is"+ob.getClass().getName());
	}
	public T getObj() {
		return ob;
	}
}
