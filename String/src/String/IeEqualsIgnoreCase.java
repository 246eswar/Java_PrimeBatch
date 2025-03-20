package String;
import java.util.*;
public class IeEqualsIgnoreCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(isEqualsIgnore(s1,s2));
	}
	public static boolean isEqualsIgnore(String s,String t) {		
		int count=0;
		if(s.length()==t.length()) {
			for(int i=0;i<s.length();i++) {
				char ch1=s.charAt(i);
				char ch2=t.charAt(i);
				if(ch1==ch2 || (int)(ch1-ch2)==32 || (int)(ch1-ch2)==-32 ) {
				count++;
				}
			}
		}else {
			return false;
		}
		if(count==s.length()) {
			return true;
		}else {
			return false;
		}
	}
}
