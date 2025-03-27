package Numbers;
import java.util.*;
public class NumberLastPlus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int sum=0;		
			while(n>0) {
				sum+=n%10;
				n/=10;
			}
			int res=sum*r;
		System.out.println(res);
		int b=res;
		int c=0;
		while(b>0) {
			c+=b%10;
			b/=10;
		}System.out.println(c);
	}
}