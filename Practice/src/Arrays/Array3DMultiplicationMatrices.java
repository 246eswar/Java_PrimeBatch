package Arrays;
import java.util.*;
public class Array3DMultiplicationMatrices {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Matrix 1 Enter the block size :");
		int b=sc.nextInt();
		System.out.print("Matrix 1 Enter the row size :");
		int r_s1=sc.nextInt();
		System.out.print("Matrix 1 Enter the column size : ");
		int c_s1=sc.nextInt();
		int arr1[][][]=new int[b][r_s1][c_s1];
		for(int k=0;k<b;k++) {
		for(int i=0;i< r_s1;i++) {
			for(int j=0;j<c_s1;j++) {
				System.out.println("Enter the element for"+i+ "row and"+j+ "column "+k+" Block :");
				arr1[k][i][j]=sc.nextInt();
			}
			}
		}		
		System.out.print("Matrix 1 Enter the block size :");
		int b1=sc.nextInt();
		System.out.print("Matrix 2 Enter the row size :");
		int r_s2=sc.nextInt();
		System.out.print("Matrix 2 Enter the column size : ");
		int c_s2=sc.nextInt();
		int arr2[][][]=new int[b1][r_s2][c_s2];
		for(int k=0;k<b1;k++) {
		for(int i=0;i<r_s2;i++) {
			for(int j=0;j<c_s2;j++) {
				System.out.println("Enter the element for"+i+ "row and"+j+ "column "+k+" Block : ");
				arr2[k][i][j]=sc.nextInt();
			}
			}
		}
		boolean t=true;
		for(int[][] a:arr1) {
			for(int[] d:a) {
				for(int e:d) {
				if(t) {
					System.out.print(e);
					t=false;
				}else	System.out.print(" "+e);
			}System.out.println();
			t=true;
		}System.out.println();
		t=true;
			}
		boolean r=true;
		for(int[][] a:arr2) {
			for(int[] d:a) {
				for(int e:d) {
			
				if(r) {
					System.out.print(e);
					r=false;
				}else	System.out.print(" "+e);
			}System.out.println();
			r=true;
		}System.out.println();
		r=true;
			}
		if(c_s1!=r_s2 || b!=b1) {
			System.out.println("Multiplication is not possible!!");
			return;
		}
		else{
			int mul[][][]=new int[b][r_s1][c_s2];
			for(int m=0;m<b;m++) {
			for(int i=0;i<r_s1;i++) {
				for(int j=0;j<c_s2;j++) {
					mul[m][i][j]=0;
					for(int k=0;k<c_s1;k++) {
						mul[m][i][j]+=arr1[m][i][k]*arr2[m][k][j];
					}
				}				
			}}
			boolean B=true;
			for(int m=0;m<b;m++) {
			for(int i=0;i<r_s1;i++) {
				for(int j=0;j<c_s2;j++) {
					if(B) {
						System.out.print(mul[m][i][j]);
						B=false;
					}
					else {
					System.out.print(" "+mul[m][i][j]);
					}					
				}System.out.println();
				B=true;
			}System.out.println();
			B=true;
			}
		}

	}

}
