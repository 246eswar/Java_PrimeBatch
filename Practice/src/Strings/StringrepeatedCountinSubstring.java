package Strings;
import java.util.*;
public class StringrepeatedCountinSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=sc.nextInt();
		int maxCount=0;
		for(int i=0;i<str.length();i=i+l) {
			int count=0;
			for(int j=0;j<l;j++) {
				if(str.charAt(j)=='a') {
					count++;
				}
			}if(count>maxCount) {
				maxCount=count;
			}
		}System.out.println(maxCount);	
	}
}