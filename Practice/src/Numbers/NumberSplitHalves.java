package Numbers;
import java.util.*;
public class NumberSplitHalves {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int len=0;
		while(temp>0) {
			temp/=10;
			len++;
		}
		if(len%2!=0) System.out.println(n+" is unable to split into two halves.");
		else {
			int mid=len/2;
			int div=(int)Math.pow(10, mid);
			int first=n/div;
			int second=n%div;
			System.out.println(first);
			System.out.println(second);
		}
	}
}