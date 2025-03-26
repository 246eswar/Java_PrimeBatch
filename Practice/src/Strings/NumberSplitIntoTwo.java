package Strings;
import java.util.*;
public class NumberSplitIntoTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=String.valueOf(n);
		int len=str.length();
		if(len%2!=0) System.out.println("Invalid Unable split into two halfs");
		else {
			int mid=len/2;
			String first=str.substring(0,mid);
			String second=str.substring(mid);
			System.out.println(first);
			System.out.println(first.getClass().getName());
			System.out.println(second);
			System.out.println(second.getClass().getName());
			Integer num1=Integer.parseInt(first);
			System.out.println(num1);
			System.out.println(num1.getClass().getName());
			Integer num2=Integer.parseInt(second);
			System.out.println(num2);
			System.out.println(num2.getClass().getName());
		}
	}
}