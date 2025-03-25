package Arrays;
import java.util.*;
public class Array1DMul {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		int mul=1;
		for(int i:arr) mul*=i;
		System.out.println(mul);		
	}
}