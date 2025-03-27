package Numbers;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int temp=0;
		while(a>0) {
			temp=temp*10+a%10;
			a/=10;
		}System.out.println(n==temp);
	}
}