package itrodution04_06_25;
import java.util.*;
public class PalindromePossibilities {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int[] array=new int[10];
		for(int i:arr) array[i]=array[i]+1;
		int count=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]%2==0) continue;
			else if(array[i]%2!=0) count++;
		}if (count <= 1) System.out.println("Palindrome");
		else System.out.println("not Palindrome");
	}
}