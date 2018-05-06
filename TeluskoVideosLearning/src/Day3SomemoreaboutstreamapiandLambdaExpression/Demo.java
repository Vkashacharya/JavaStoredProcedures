package Day3SomemoreaboutstreamapiandLambdaExpression;

public class Demo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int i, j, c = 1;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i != j)
					c = c * a[j];
			}
			System.out.println(c);
			c = 1;
		}

	}
}
