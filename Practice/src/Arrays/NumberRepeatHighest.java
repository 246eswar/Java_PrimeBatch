package Arrays;
import java.util.*;
public class NumberRepeatHighest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the only '0' and '1'");
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int max=0,count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) 	count++;
			else {
				if(count>max) max=count;
				count=0;
			}
		}if(count>max) max=count;
		System.out.println(max);
	}
}