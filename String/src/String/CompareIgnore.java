package String;
import java.util.*;
public class CompareIgnore {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String : ");
		String s2=sc.nextLine();
		System.out.println(isCompareToIgnore(s1,s2));
		System.out.println(isCompareToIgnore(s2,s1));
	}
	public static int isCompareToIgnore(String s,String t) {
		int small=s.length()<t.length()?s.length():t.length();
		for(int i=0;i<small;i++) {
			char ch1=s.charAt(i);
			char ch2=t.charAt(i);
			if(ch1==ch2 || (int)(ch1-ch2)==32||(int)(ch1-ch2)==-32) {
				continue;
			}else {
				return (int)(ch1-ch2);
			}
		}return s.length()-t.length();	
	}
}