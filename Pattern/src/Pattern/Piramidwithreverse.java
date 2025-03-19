package Pattern;
import java.util.*;

/*public class Piramidwithreverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=1;r<=n;r++) {
			for(int s=1;s<=n-r;s ++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print("* ");
			}System.out.println();
		}
		for(int r=n-1;r>=1;r--) {
			for(int s=n-r;s>=1;s--) {
				System.out.print(" ");
			}
			for(int c=r;c>=1;c--) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}*/
//or
public class Piramidwithreverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=1;r<=n;r++) {
			for(int s=1;s<=n-r;s++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print("* ");
			}System.out.println();
		}
		for(int r=1;r<=n;r++) {
			for(int s=1;s<=r-1;s++) {
				System.out.print(" ");
			}
			for(int c=1;c<n-r+1;c++) {
				System.out.print(" *");
			}System.out.println();
		}
	}

}