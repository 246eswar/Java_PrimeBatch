package Numbers;
import java.util.*;
public class NumberaddevenOddpositions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		int position=0;
		while(n>0) {
			int digit=n%10;
			if(position%2==0) {
				even+=digit;
			}
			else {
				odd+=digit;
			}
			position++;
			n/=10;
		}System.out.println(even);
		System.out.println(odd);
	}
}