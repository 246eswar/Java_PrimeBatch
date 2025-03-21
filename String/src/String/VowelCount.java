package String;
public class VowelCount {
	public static void main(String[] args) {
		int vowels=0;
		int consonants=0;
		int digits=0;
		String s="java 1 is a 2 and 3 34562436 is python";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowels++;
			}else if(ch>='0'&&ch<='9') {
				digits++;				
			}else if(ch!=' ') {
				consonants++;
			}
		}System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(digits);
	}
}