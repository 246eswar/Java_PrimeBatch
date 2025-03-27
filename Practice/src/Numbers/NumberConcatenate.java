package Numbers;
import java.util.*;
public class NumberConcatenate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		StringBuilder even=new StringBuilder();
		StringBuilder odd=new StringBuilder();
		int position=0;
		while(n>0) {
			int digit=(int)(n%10);
			if(position%2==0) even.append(digit);
			else odd.append(digit);
			position++;
			n/=10;
		}
		String revE="";
		String revO="";
		for(int i=even.length()-1;i>=0;i--)  revE+=even.charAt(i);
		for(int j=odd.length()-1;j>=0;j--) revO+=odd.charAt(j);
		System.out.println(revE);
		System.out.println(revO);
	}
}