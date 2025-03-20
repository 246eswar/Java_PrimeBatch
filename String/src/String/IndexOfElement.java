package String;
import java.util.*;
public class IndexOfElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=sc.next().charAt(0);
		indexOfElement(s,ch);
	}
	public static void indexOfElement(String s,char ch) {
		boolean count = false;
		int i=0;
		
		/*for(i=0;i<s.length();i++) {
			char ch1=s.charAt(i);
			if(ch1==ch) {
				count=true;
				break;
			}
		}if(count==true){
			System.out.println("Character found at index number : "+i);
		}else {
			System.out.println("Character not found!");
		}*/
		
		//for last index i=s.length()-1
		for(i=s.length()-1;i>0;i--) {
			char ch1=s.charAt(i);
			if(ch1==ch) {
				count=true;
				break;
			}
		}if(count==true){
			System.out.println("Character found at index number : "+i);
		}else {
			System.out.println("Character not found!");
		}
	}
}

