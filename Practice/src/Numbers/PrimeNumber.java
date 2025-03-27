package Numbers;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1) 	System.out.println("Given number is not Prime");			
		else {
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}				
			}if(isPrime) System.out.println("Given number is a Primee");
			else System.out.println("Given number is not Prime");
		}
	}
}