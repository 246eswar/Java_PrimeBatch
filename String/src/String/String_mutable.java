/*package String;
import java.util.*;
public class String_mutable {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(input(s));
	}
	static String input(String s){
		String array[]=s.split(" ");
		//System.out.println(Arrays.toString(array));
		StringBuffer sb=new StringBuffer();
		String sbb="";
		for(int i=0;i<array.length;i++) {
			sb.append(array[i]);
			sbb+=(sb.reverse()+" ");
			sb.delete(0, sb.length());
		}return (sbb.trim());
	}
}*/
package String;
import java.util.*;
public class String_mutable {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(output(s));
	}
	static String output(String s){
		String array[]=s.split(" ");
		String sbb="";
		for(int i=0;i<array.length;i++) {
			String sb="";
			for(int j=array[i].length()-1;j>=0;j--) {
				sb+=array[i].charAt(j);				
			}sbb+=sb;
			sbb+=" ";
			
		}return (sbb.trim());
	}
}