package Pattern;
import java.util.Scanner;
public class Piramid {		
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 for(int r=1;r<=n;r++) {
    		 for(int s=1;s<=n-r;s++) {
    			 System.out.print(" ");
    		 }
    		 for(int sr=1;sr<=r;sr++) {
    			 System.out.print("* ");
    		 }System.out.println();    	
    		 }
     }
}