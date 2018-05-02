package application;
import java.util.ArrayList;

public class VectorAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v=new ArrayList<Integer>();//50%//NotThreadSafe//fast
//		Vector<Integer> v=new Vector<Integer>();//100%//ThreadSafe//slow
//		v.add(4);
//		v.add(7);
//		v.add(20);
//		v.add(4);
//		v.add(7);
//		v.add(20);
//		v.add(4);
//		v.add(7);
//		v.add(20);
//		v.add(4);
//		v.add(7);
//		v.add(20);
//		v.add(4);
//		
		
		
//		System.out.println("The capacity is" + v.capacity());
		for(int i:v) {
			System.out.println(i);
		}
		//remove elements by giving index
				v.remove(5);
				System.out.println("New updated list");
				for(int i:v) {
					System.out.println(i);

	}
	}
	//ArrayList and Vector both are implementations of List
	

}
