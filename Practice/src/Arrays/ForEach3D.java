package Arrays;
import java.util.*;
public class ForEach3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Block size : ");
		int b_s=sc.nextInt();
		System.out.print("Enter the row size : ");
		int r_s=sc.nextInt();
		System.out.print("Enter the column size : ");
		int c_s=sc.nextInt();
		int arr[][][]=new int[b_s][r_s][c_s];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the element for"+i+" block and "+j+" row "+k+" column : ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		boolean B=true;
		for(int[][] a:arr) {
			for(int[] b:a) {
				for(int c:b) {
					if(B) {
					System.out.print(c);
					B=false;
					}
					else System.out.print(" "+c);
				}System.out.println();
				B=true;
			}System.out.println();
			B=true;
		}
	}

}
