package Strings;
//find the first non repeated in a given string
public class NonRepetedFirstChar {
	public static void main(String[] args) {
		String s="swwiisst";		
		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch1=s.charAt(i);
			for(int j=0;j<s.length();j++) {
				if(ch1==s.charAt(j)) {
					count++;
					}
			}if(count==1) {
				System.out.println(ch1);
				break;
			}else {
				System.out.println("Not there");
				break;
			}
		}			
	}
}