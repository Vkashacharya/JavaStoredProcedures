import java.util.Scanner;

public class BeRojgaarProblem2 {

	public static void main(String[] args) {
		System.out.print("Enter length of array=");
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int[] a=new int[i];
		int[] b=new int[i];
		int c=1;
		for(int j=0;j<i;j++) {
			System.out.print("Enter " +j+ " index array=");
			a[j]=scan.nextInt();
		}
		for(int j=0;j<i;j++) {
			for(int k=0;k<i;k++){
				if(j!=k) c=c*a[k];
			}
			System.out.println("value of new array "+j+" index=" +c);
			c=1;	
		}

	}

}
