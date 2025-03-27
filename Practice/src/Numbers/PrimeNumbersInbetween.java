package Numbers;
import java.util.*;
public class PrimeNumbersInbetween {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				sum+=i;
			}
		}System.out.println("\n"+sum);			
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) return false;
			}
		}return true;
	}
}