package Day2StreamApiandlamdaExpressions;
//Java8FEATURES WITH LAMBDA EXPRESSION CONSUMER INTERFACE AND LAMBDA EXPRESSION

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiInternalIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>values= Arrays.asList(1,2,3,4,5,6,7,9);
	//1.Enhanced Loop
		/* for(int i:values)
		System.out.println(values);
	*/
		//2.Iterator
		/* Iterator<Integer>i=values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		*/
//		values.forEach(i->System.out.println(i));//Internal Iterations
		//Consumer Interface
		
	/*	Consumer<Integer>c=new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				// TODO Auto-generated method stub
				System.out.println(i);
			}
			
		};
		values.forEach(c);
		*/
		
		//Efficient with lamda Expression
		/* Consumer<Integer>c=(Integer i)->System.out.println(i);
		values.forEach(c);
		*/
//		values.forEach(System.out::println);//method reference system class ko object ko method ho println
		
//		values.forEach(i->System.out.println(i));
		
//		values.forEach(i->doubleit(i));
		values.forEach(StreamApiInternalIteration::doubleit);
	
	
	}
	public static void doubleit(int i) {
		System.out.println(i*2);
	}

}
