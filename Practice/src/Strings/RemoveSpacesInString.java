package Strings;
public class RemoveSpacesInString {
	public static void main(String[] args) {
		String str="Hello World";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch !=' '){
				System.out.print(ch);
			}
		}
	}
}