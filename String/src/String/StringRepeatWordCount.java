package String;
import java.util.*;
public class StringRepeatWordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();		
		int highestCount=0;
		char frequent='\0';
		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch1=s.charAt(i);
			for(int j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
				if(ch1==ch2) {
					count++;
				}
			}if(count>highestCount) {
				highestCount=count;
				frequent=ch1;
			}
		}System.out.println(frequent);
		System.out.println(highestCount);
	}
}