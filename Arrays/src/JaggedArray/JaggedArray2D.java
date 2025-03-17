package JaggedArray;
import java.util.*;
public class JaggedArray2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r_s=sc.nextInt();
		int array[][]=new int[r_s][];
		for(int i=0;i<array.length;i++) {
			System.out.println("Column for size "+i+" of row ");
			int c_s=sc.nextInt();
			array[i]=new int[c_s];			
		}
		for(int row=0;row<array.length;row++) {
			for(int col=0;col<array[row].length;col++) {
				System.out.println("element for "+row+" row and "+col+" column ");
				array[row][col]=sc.nextInt();
			}
		}
		for(int row=0;row<array.length;row++) {
			for(int col=0;col<array[row].length;col++) {
				System.out.print(array[row][col]+" ");
			}System.out.println();
		}
	}

}
