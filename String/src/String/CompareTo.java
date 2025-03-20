package String;
import java.util.*;
public class CompareTo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String : ");
		String s2=sc.nextLine();
		System.out.println(isCompare(s1,s2));
		System.out.println(isCompare(s2,s1));
	}
	public static int isCompare(String s,String t) {
		int small=s.length()<t.length()?s.length():t.length();
		for(int i=0;i<small;i++) {
			int ch1=(int)(s.charAt(i));
			int ch2=(int)(t.charAt(i));
			if(ch1!=ch2) return ch1-ch2;
		}return s.length()-t.length();	
	}
}
