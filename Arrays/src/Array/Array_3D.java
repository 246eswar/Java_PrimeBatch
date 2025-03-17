//datatype arrayname[][][]=new datatype[blocksize][rowsize][columnsize];
package Array;
import java.util.*;
public class Array_3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[][][]=new int[2][4][5];
		for(int b=0;b<array.length;b++) {
			for(int r=0;r<array[0].length;r++) {
				for(int c=0;c<array[0][0].length;c++) {
					array[b][r][c]=sc.nextInt();
				}
			}
		}
		for(int b=0;b<array.length;b++) {
			for(int r=0;r<array[0].length;r++) {
				for(int c=0;c<array[0][0].length;c++) {
					System.out.print(array[b][r][c]+" ");
				}System.out.println();
			}System.out.println();
		}
	}
}
