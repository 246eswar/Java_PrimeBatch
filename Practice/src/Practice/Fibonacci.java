package Practice;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		int temp=0;
		int sum=0;
		if(n>1)	System.out.print(a);
		while(b<n) {
			System.out.print(" "+b);
			sum+=b;
			temp=a;
			a=b;
			b=a+temp;			
		}System.out.println("\n"+sum);
	}
}