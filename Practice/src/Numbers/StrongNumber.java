package Numbers;
import java.util.*;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int b=n;
		while(n>0) {
			int digit=n%10;
			sum+=fact(digit);
			n/=10;
		}if(sum==b)		System.out.println("Strong number");
		else System.out.println("weak number");		
	}
	public static long fact(int num) {
		long f=1;
		for(int i=1;i<=num;i++) f*=i;
		return f;
	}
}