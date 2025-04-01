package Strings;
import java.util.*;
public class StringReverseWhen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String tar=sc.next();
		int t=str.indexOf(tar);
		if(t>0) {
			StringBuilder str1=new StringBuilder(str);
			String n=str1.substring(0,t);
			StringBuilder b=new StringBuilder(n);
			String l=str1.substring(t+1);
			System.out.println(tar+b.reverse()+l);
		}else System.out.println(str);
	}
}