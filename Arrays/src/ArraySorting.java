import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
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