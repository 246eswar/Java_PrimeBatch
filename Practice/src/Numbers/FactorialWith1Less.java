package Numbers;
import java.util.*;
public class FactorialWith1Less {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<2||n>50) System.out.println("Invalid Number");
		else {
			long res=2*factorial(n-1);
			System.out.println(res);
		}
	}
	public static long factorial(int a) {
		long fact=1;
		for(int i=2;i<=a;i++) {
			fact=fact*i;
		}return fact;
	}
}