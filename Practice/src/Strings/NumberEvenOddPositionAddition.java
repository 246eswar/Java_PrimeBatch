package Strings;
import java.util.*;
public class NumberEvenOddPositionAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=String.valueOf(n);
		int even=0;
		int odd=0;
		for(int i=0;i<str.length();i++) {
			int digit=Character.getNumericValue(str.charAt(i));
			if(i%2==0) even+=digit;
			else odd+=digit;
		}System.out.println(even);
		System.out.println(odd);		
	}
}