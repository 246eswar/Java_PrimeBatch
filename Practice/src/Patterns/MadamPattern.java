package Patterns;
public class MadamPattern {
	public static void main(String[] args) {
		String str="madam";
		int len=str.length();;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i==0||i==len-1||i==len-j-1||j==i) System.out.print(str.charAt(j)+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
/*
public class Main {
public static void main(String[] args) {
  String s=new String("MADAM");
  int len=s.length();
  for(int i=0;i<len;i++){
    for(int j=0;j<len;j++){
      if(i==j || i==len-1-j || i==0 || i==len-1){
        System.out.print(s.charAt(j)+" ");
      }  
      else{
        System.out.print("  ");
      }
    }
    System.out.println();
  }
}
}*/