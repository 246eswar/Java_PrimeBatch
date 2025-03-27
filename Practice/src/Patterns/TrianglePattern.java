package Patterns;
import java.util.*;
public class TrianglePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {			
			System.out.println("* ".repeat(i)+" "+i);		
		}
		for(int i=n;i>=0;i--) {
			System.out.println("* ".repeat(i)+" "+i);
		}
	}
}
/*
public class Patterns {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<=n;i++) {
			System.out.println("* ".repeat(i)+" "+i);
		}	
 	}
}
*/