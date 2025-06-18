//error
package itrodution04_06_25;
import java.util.*;
public class ArrayProdWithNonZeroExceptIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		int count=0;
		int product=1;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) count++;
			else product*=arr[i];			
		}
		int newarr[]=new int[n];
		for(int i=0;i<n;i++) {
			if(count==0) {
				newarr[i]=product/arr[i];
			}else {
				if(count==1) {
					if(arr[i]==0)  newarr[i]=product;
					else newarr[i]=0;
				}else {
					newarr[i]=0;
				}
			}
		}for(int i:newarr) System.out.println(i);
		
	
	}
}