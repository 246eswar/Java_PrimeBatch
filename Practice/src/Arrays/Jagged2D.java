package Arrays;
import java.util.*;
public class Jagged2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int r=sc.nextInt();
		int arr[][]=new int[r][];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the column size for row "+i+" : ");
			int c=sc.nextInt();
			arr[i]=new int[c];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the element for "+i+" row and "+ j+" column :  ");
				arr[i][j]=sc.nextInt();				
			}
		}
		boolean B=true;
		for(int i[]:arr) {
			for(int b:i) {
				if(B) {
					System.out.print(b);
					B=false;
				}
				else System.out.print(" "+b);
			}System.out.println();
			B=true;
		}
	}
}