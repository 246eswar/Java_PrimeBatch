package itrodution04_06_25;
import java.util.*;
public class ArrayNumbersCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		/*int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();		
		int[] array=new int[n];
		for(int i:arr) array[i]=array[i]+1;
		for(int i=0;i<n;i++) System.out.println(i+ " " + array[i]);*/
		
		//2 O(n^2)
		/*
		 * int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
		int count=0;
		for(int j=0;j<n;j++) {
			if(arr[i]==arr[j]) count++;
		}System.out.println(arr[i]+"count ="+count);
	}*/
		
		//Madam explain
		int n =sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		
	}
}