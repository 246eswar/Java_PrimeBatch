package Pattern;
import java.util.*;
/*
 public class PrintNumberTriangle {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=9;
		int b=a;
		for  (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {				
				System.out.print(b);
				a=b*10+9;
			}System.out.println();
		}
	}
}*/
/*
public class PrintNumberTriangle {	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for  (int i=1;i<=n;i++) {
			long k=(long)(Math.pow(10, i)-1);				
			System.out.println(k);
				
		}
	}
}
*/
//perticular number
/*
public class PrintNumberTriangle {	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		for  (int i=1;i<=n;i++) {
			long k=(long)(((Math.pow(10, i)-1)/9)*num);				
			System.out.println(k);
				
		}
	}
}
*/
//another method
public class PrintNumberTriangle {	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int j=k;
		for  (int i=1;i<=n;i++) {							
			System.out.println(k);
			k=k*10+j;				
		}
	}
}
