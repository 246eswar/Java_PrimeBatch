package Numbers;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long fact=1;
		if(n>=0) {
		for(int i=1;i<=n;i++) fact*=i;
		System.out.println(fact);
		}else System.out.println("Given number is negative");
		
	}
}