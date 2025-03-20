//array with argument and without return type
import java.util.*;
public class array_methods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sum(arr);		
	}
	public static void sum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}System.out.println(sum);
	}
}
