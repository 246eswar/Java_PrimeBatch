package Sorting;
import java.util.*;
public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();//5  10  20  3  2  1  0
		for(int i=0;i<n;i++) {
			int minindex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[minindex]>arr[j]) {
					minindex=j;
				}
			}int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		for(int i=0;i<n;i++) {
			if(i==n-1) System.out.print(arr[i]);
			else System.out.print(arr[i]+" ");
		}
	}
}