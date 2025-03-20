package String;
import java.util.*;
public class StringEquals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(isEquals(s1,s2));		
	}
	public static boolean isEquals(String str1,String str2) {
		int count=0;
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				char ch1 =str1.charAt(i);
				char ch2 =str2.charAt(i);
				if(ch1==ch2){
					count++;
				}
			}
		}
		else {
			return false;
		}
		if(count==str1.length()) {
			return true;
		}else {
			return false;
		}
	}
}
