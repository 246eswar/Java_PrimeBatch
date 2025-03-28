package Arrays;
import java.util.*;
public class ArrayZerosLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int count=0;
		int arr1[]=new int[n];
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr1[index++]=arr[i];
				count++;
			}
		}for(int i=count;i<n;i++) {
			arr1[i]=0;
		}
		for(int i=0;i<n;i++) {
			if(i==n-1) System.out.print(arr1[i]);
			else System.out.print(arr1[i]+" ");
		}
	}
}