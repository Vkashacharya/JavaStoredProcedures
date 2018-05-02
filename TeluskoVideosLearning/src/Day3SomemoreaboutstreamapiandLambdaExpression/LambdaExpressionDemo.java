package Day3SomemoreaboutstreamapiandLambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//Example 1
/*
	List<String> l=Arrays.asList("Bikash","Acharya","Shanta","Kunwar");

				.stream()
				.findFirst()
				.ifPresent(System.out::print);
				
				
				*/
		
		
	//Example2
/*
	
	Arrays.stream(new String[] {"Shanta","Bikash","Acharya"})
			.forEach(System.out::println);
			
*/
		//Example 3
		/*
		
		  Arrays.stream(new String[] {"Shanta","Bikash","Acharya"})
				.filter(list->!"Bikash".equals(list))
				.forEach(System.out::println);
		
		*/
		
		/*Example 3
		
		Stream<String> streamOf = Stream.of("java", "sample", "approach", ".com");
		IntStream streamRange = IntStream.range(0, 10);
		Stream<Integer> streamIter = Stream.iterate(0, n -> n + 3).limit(10);
		Stream<String> emptyStream = Stream.empty();
		Stream<Double> streamGen = Stream.generate(Math::random).limit(10);
		streamOf.forEach(System.out::print);
		System.out.println();
		
		streamRange.forEach(System.out::print);
		System.out.println();
		streamIter.forEach(System.out::print);
		System.out.println();
		emptyStream.forEach(System.out::print);
		System.out.println();
		streamGen.forEach(System.out::println);
		System.out.println();
		
		*/
		
		
		

		

	}

}
