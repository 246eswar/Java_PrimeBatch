/*
import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}
			}				
		}for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) System.out.print(arr[i]);
			else System.out.print(arr[i]+" ");
		}
	}
}
*/
/*
import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}
			}
		}for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) System.out.print(arr[i]);
			else System.out.print(arr[i]+" ");
		}
		System.out.println("\n"+"Smallest element "+arr[0]);
		System.out.println("Larfgest element "+arr[arr.length-1]);
	}
}
*/
/*
import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}
			}
		}for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) System.out.print(arr[i]);
			else System.out.print(arr[i]+" ");
		}
		for(int i=arr.length-1;i>0;i++) {
			if(arr[i]!=arr[i-1]) {
				System.out.println("\n Second smallest"+arr[i-1]);
				break;
			}
		}			
		System.out.println("\n"+"Smallest element "+arr[0]);
		System.out.println("Larfgest element "+arr[arr.length-1]);
	}
}
*/
//without using swap find largest
//and smaleest
/*
import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)	max=arr[i];			
			if(arr[i]<min) min=arr[i];
		}System.out.println("Larfgest element "+max);
		System.out.println("Smallest element "+min);
	}
}
*/
//selection sort
import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) System.out.print(arr[i]);
			else System.out.print(arr[i]+" ");
		}
	}
}
