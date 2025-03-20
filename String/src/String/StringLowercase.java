package String;
import java.util.*;
public class StringLowercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		toLower(str);		
	}
	static void toLower(String s) {
		String lower="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				lower+=(char)(ch+32);
			}else {
				lower+=ch;
			}
		}System.out.println(lower);
	}
}
