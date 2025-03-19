package PatternPractice;
import java.util.*;
public class CrossPattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((n>=3&&n<=49)&&(n%2==1)) {
					if(i==n/2&&j==n/2) {
						System.out.print("@");
					}else if(j==n-i-1 || j==i) {
						System.out.print("x");
					}else {
						System.out.print(" ");
					}
				}
			}System.out.println();
		}
	}
}
