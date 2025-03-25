package Arrays;
import java.util.*;
public class Array2DAddition {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row size :");
		int r_s=sc.nextInt();
		System.out.print("Enter the column size : ");
		int c_s=sc.nextInt();
		int arr[][]=new int[r_s][c_s];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the element for"+i+ "row and"+j+ "column : ");
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int[] i: arr) {
			for(int j:i) sum+=j;
		}System.out.println(sum);
	}
}