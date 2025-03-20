//2D Array
//3 rows ,7columns
package Array;
import java.util.*;
public class Array_2D {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r_s=sc.nextInt();
		int c_s=sc.nextInt();
		int marks[][]=new int[r_s][c_s];
		for(int rows=0;rows<r_s;rows++) {
			for(int cols=0;cols<c_s;cols++) {
				marks[rows][cols]=sc.nextInt();
			}
		}print(marks,r_s,c_s);
		System.out.println(multiply(marks,r_s,c_s));		
	}
	public static void print(int[][] array,int r_s,int c_s) {
		for(int rows=0;rows<r_s;rows++) {
			for(int cols=0;cols<c_s;cols++) {
				System.out.print(array[rows][cols]+" ");
			}System.out.println();
		}
	}
	public static int multiply(int[][] array,int r_s,int c_s) {
		int mul=1;
		for(int rows=0;rows<r_s;rows++) {
			for(int cols=0;cols<c_s;cols++) {
				mul*=array[rows][cols];
			}			
		}return mul;
	}
}
