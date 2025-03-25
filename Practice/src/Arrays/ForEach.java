package Arrays;
import java.util.*;
public class ForEach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		boolean a=true;
		for(int i:arr) {
			if(a) {
				System.out.print(i);
				a=false;
			}else System.out.print(" "+i);
		}
	}
}