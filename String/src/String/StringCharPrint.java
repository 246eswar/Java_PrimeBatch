package String;
import java.util.*;
public class StringCharPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		System.out.println(s.concat(t));
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			System.out.print(t.charAt(i)+" ");
		}
	}

}
