package Day2StreamApiandlamdaExpressions;
//FindFirst/stream/reduce/map
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Java8demoStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
		
		/* add which are divisible by 5 */
		//--using for method using modulo
		System.out.println(values.stream().filter(i->i%5==0).reduce(0,Integer::sum));
	//--findfirst	
//		System.out.println(values.stream().filter(i->i%5==0).findFirst().orElse(0));
//		
//		
		
		
		int result=0;
		
//		for(int i:values) {
//			result=result+i; //result is changing everytime i.e mutation occurs
//		}
		
//		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
//	Function<Integer,Integer> f=new Function<Integer,Integer>(){
//	public Integer apply(Integer i) {
//		return i*2;
//	}
//	};
//	
//	Stream s=values.stream();
//	Stream s1=s.map(f);
//
//    s1.forEach(System.out::println);
//		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c, e)));
//		System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));//by reference
//		
	}

}
