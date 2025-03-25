package Arrays;
import java.util.*;
public class Jagged3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Block  size : ");
		int b=sc.nextInt();
		int arr[][][]=new int[b][][];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the row size for the bolck "+i+" : ");
			int r=sc.nextInt();
			arr[i]=new int[r][];
			for (int j=0;j<arr[i].length;j++) {
				System.out.print("Enter the column size for the block "+i+" and for the row "+j+" : ");
				int c=sc.nextInt();
				arr[i][j]=new int[c];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print("Enter the Element for the block "+i+" and  the row "+j+" and column "+k+" : ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		boolean B=true;
		for(int[][] a:arr) {
			for(int[] d:a) {
				for(int c:d) {
					if(B) {
						System.out.print(c);
						B=false;
					}else System.out.print(c);
				}System.out.println();
				B=true;
			}System.out.println();
			B=true;
		}
		
	}
}