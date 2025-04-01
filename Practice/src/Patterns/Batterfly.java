package Patterns;
import java.util.*;
public class Batterfly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) 
				System.out.print("*");
			for(int k=0;k<2*(n-i-1);k++)
				System.out.print(" ");
			for(int l=0;l<=i;l++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<=i;j++) 
				System.out.print("*");
			for(int k=0;k<2*(n-i-1);k++)
				System.out.print(" ");
			for(int l=0;l<=i;l++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}

/*
public class Batterfly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||i==n-j-1||j==n-1||j==0) System.out.print("*");
				else System.out.print(" ");
			}System.out.println();
		}
	}
}*/