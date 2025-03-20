package JaggedArray;
import java.util.*;
public class JaggedArray3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b_s=sc.nextInt();
		int array[][][]=new int[b_s][][];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("row size for block "+i);
			int r_s=sc.nextInt();
			array[i]=new int[r_s][];		
			for(int j=0;j<array[i].length;j++) {
				System.out.println("column size for row of "+j+"and block of "+i);
				int c_s=sc.nextInt();
				array[i][j]=new int[c_s];				
			}
		}
		for(int b=0;b<array.length;b++) {
			for(int row=0;row<array[b].length;row++) {
				for(int col=0;col<array[b][row].length;col++) {
					System.out.println("element for "+b+" of block"+row+" of row and "+col+" column ");
					array[b][row][col]=sc.nextInt();
				}System.out.println();
			}System.out.println();
		}
		for(int b=0;b<array.length;b++) {
			for(int row=0;row<array[b].length;row++) {
				for(int col=0;col<array[b][row].length;col++) {
					System.out.print(array[b][row][col]+" ");
				}System.out.println();
			}System.out.println();
		}
		int totalSum=0;
		for(int b=0;b<array.length;b++) {
			int blocksum=0;
			for(int row=0;row<array[b].length;row++) {
				int rowsum=0;
				for(int col=0;col<array[b][row].length;col++) {
					rowsum+=array[b][row][col];				
				}System.out.println("Sum of row " + row + " in block " + b + ": " + rowsum);
				blocksum+=rowsum;				
			}System.out.println("Sum of block " + b + ": " + blocksum);
			totalSum+=blocksum;
		}System.out.println("Total sum of all elements in the 3D array: " + totalSum);
	}
}
