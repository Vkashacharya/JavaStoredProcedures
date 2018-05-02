package application;

import java.util.ArrayList;
import java.util.List;
class Container<T extends Number>{
T value;
public T getValue() {
	return value;
}
public void setValue(T value) {
	this.value = value;
}
public void show() {
	System.out.println(value.getClass().getName());//T=Type and this value becomes the value type
}
public void demo(ArrayList<Number> arrayList) {
	
}
	
}
public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//type safety:- work with variabe first declare and use
		int value =5;//compiletime so typesafety 
		
//		List values=new ArrayList();
//		values.add("name");
//		values.add(7);//string and int both are used so no type safety
//		
//		List<Integer> values=new ArrayList<>();
////		values.add("name");//error by mistake add string
////		values.add(7);
//		
		//intention is not to add string but by mistake
		
//		List values=new ArrayList();
//		values.add("name");
//		values.add(7);
//		
//		int i=Integer.parseInt(values.get(0).toString());//provides runtime error
//		System.out.println(i);
		
	
Container<Integer> obj=new Container<>();
obj.value=9;
obj.show();
obj.demo(new ArrayList<Number>());

		
		
	}

}
