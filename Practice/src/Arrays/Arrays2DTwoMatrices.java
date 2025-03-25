package Arrays;
import java.util.*;
public class Arrays2DTwoMatrices {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Matrix 1 Enter the row size :");
		int r_s1=sc.nextInt();
		System.out.print("Matrix 1 Enter the column size : ");
		int c_s1=sc.nextInt();
		int arr1[][]=new int[r_s1][c_s1];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Enter the element for"+i+ "row and"+j+ "column : ");
				arr1[i][j]=sc.nextInt();
			}
		}		
		System.out.print("Matrix 2 Enter the row size :");
		int r_s2=sc.nextInt();
		System.out.print("Matrix 2 Enter the column size : ");
		int c_s2=sc.nextInt();
		int arr2[][]=new int[r_s2][c_s2];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("Enter the element for"+i+ "row and"+j+ "column : ");
				arr2[i][j]=sc.nextInt();
			}
		}
		boolean t=true;
		for(int[] a:arr1) {
			for(int b:a) {
				if(t) {
					System.out.print(b);
					t=false;
				}else	System.out.print(" "+b);
			}System.out.println();
			t=true;
		}
		boolean r=true;
		for(int[] a:arr2) {
			for(int b:a) {
				if(r) {
					System.out.print(b);
					r=false;
				}else	System.out.print(" "+b);
			}System.out.println();
			r=true;
		}
		if(arr1.length!=arr2.length && arr1[0].length!=arr2[0].length) System.out.println("Addition is not possible!!");
		else{
			int res[][]=new int[arr1.length][arr1[0].length];
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[0].length;j++) res[i][j]=arr1[i][j]+arr2[i][j];
			}boolean B=true;
			for(int i=0;i<res.length;i++) {
				for(int j=0;j<res[0].length;j++) {
					if(B) {
						System.out.print(res[i][j]);
						B=false;
					}
					else {
					System.out.print(" "+res[i][j]);
					}					
				}System.out.println();
				B=true;
			}
		}
	}
}
