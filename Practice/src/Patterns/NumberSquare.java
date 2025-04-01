package Patterns;
import java.util.*;
public class NumberSquare {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int mid=n/2;
			for(int i=0;i<n;i++) {
				for (int j=0;j<n;j++) {	
					int v=Math.min  (Math.min(i,j),Math.min(n-i-1,n-j-1));			
					System.out.print((mid-v+1)+" ");
				}System.out.println();
			}
	}
}