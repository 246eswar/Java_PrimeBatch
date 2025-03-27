package Practice;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;		
		if(n>1)	System.out.print(a);
		while(b<n) {
			System.out.print(" "+b);			
			int temp=a+b;
			a=b;
			b=temp;
		}
	}
}