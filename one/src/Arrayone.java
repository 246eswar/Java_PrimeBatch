/* error
import java.util.*;
public class Arrayone {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i =0;i<5;i++) {
			arr[i]=sc.nextInt();
			for (int j=0;j<5;j++) {
				System.out.println( arr[i]);
			}
		}
	}
}
*/
/*
import java.util.*;
public class Arrayone {
	public static void main(String[] args) {
		float[] arr=new float[5];
		Scanner sc=new Scanner(System.in);
		for (int i =0;i<5;i++) {
			arr[i]=sc.nextFloat();
		}for (int j=0;j<5;j++) {
				System.out.print( arr[j]+ "  ");
			}		
	}
}*/
/*
import java.util.*;
public class Arrayone {
	public static void main(String[] args) {
		float[] arr=new float[5];
		Scanner sc=new Scanner(System.in);
		for (int i =0;i<5;i++) {
			arr[i]=sc.nextFloat();
		}for (float i:arr) {
				System.out.print( i + "  ");
			}		
	}
}
*/
import java.util.*;
public class Arrayone {
	public static void main(String[] args) {
		float[] arr=new float[5];
		Scanner sc=new Scanner(System.in);
		for (int i =0;i<5;i++) {
			arr[i]=sc.nextFloat();
		}for (int j=4;j>=0;j--) {
				System.out.print( arr[j] + "  ");
			}		
	}
}