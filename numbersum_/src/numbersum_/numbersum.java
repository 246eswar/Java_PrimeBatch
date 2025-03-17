package numbersum_;
import java.util.*;
public class numbersum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		while (a>0){
			int digit = a%10;
			sum =sum +digit;
			a/=10;
		}
		System.out.println(sum);
	}
}
