package javadsa;
import java.util.*;
public class ArraysEx {
	static int n=5;
	int[] arr=new int[5];
	public void insertion(int ele,int index) {
		if(index < 0 || index >= n)
		{
			System.out.println("Invalid index");
		}
		else
		{
			arr[index]=ele;
		}
	
	}
	public void deletion(int index)
	{
		if(index < 0 || index >= n)
		{
			System.out.println("not valid");
		}
		else {
			for(int i = index ; i < n-1 ; i++) {
				arr[i] = arr[i+1];
			}
		}
		n--;
	}
	public void display()
	{
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void search(int target) {
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i] == target) {
				System.out.println("Search element is found at index:"+i);
				return;
			}
		}
		System.out.println("Search element is not found" );
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArraysEx a=new ArraysEx();
		System.out.println("eHFYUY"); 
		for(int i = 0 ; i < n ; i++)
		{
			int ele=sc.nextInt();
			a.insertion(ele, i);
		}
		a.display();
		a.deletion(3);
		a.display();
		a.search(5);
		for(int i = 0 ; i < n ; i++) {
			 System.out.print(a.arr[i]+" ");
		}
		System.out.println();
	}
}