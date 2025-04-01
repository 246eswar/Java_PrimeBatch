package Strings;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String s="";
		String t="";
		if(str1.length()==str2.length()) {
		char arr1[]=new char[str1.length()];
		char arr2[]=new char[str2.length()];		
		for(int i=0;i<str1.length();i++) {
			arr1[i]=str1.charAt(i);
		}
		for(int i=0;i<str2.length();i++) {
			arr2[i]=str1.charAt(i);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.print(Arrays.toString(arr1));
		System.out.print(Arrays.toString(arr2));
		//if(Arrays.sort(arr1)==Arrays.sort(arr2))
		}
	}
}