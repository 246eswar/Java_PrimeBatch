/*package Array;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] arr= {1,5,6,0,10,21};
		//flag variable
		int flag =0;
		for (int i=0;i<6;i++) {
			if (arr[i]==10) {
				
				flag++;
			}
		}
			if (flag > 0) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		
	}
}
// array={1,5,6,0,10,21}
//find the element -  10
// if element found print true
//else false
*/

/*
//count
package Array;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] arr= {1,5,6,0,1,1};
		//flag variable
		int count =0;
		for (int i=0;i<6;i++) {
			if (arr[i]==1) {				
				count++;
			}
		}			
		System.out.println(count);					
	}
}*/

//print even index
/*package Array;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] arr= {1,5,6,0,1,1,8,9,2};
		for (int i=0;i<9;i++) {
			if (i%2==0) {
				System.out.print(arr[i]+ " ");
			}
		}		
	}
}*/
//or
/*
package Array;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] arr= {1,5,6,0,1,1,8,9,2};
		for (int i=0;i<9;i+=2) {			
				System.out.print(arr[i]+ " ");			
		}		
	}
}*/
/*
//odd index
package Array;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] arr= {1,5,6,0,1,1,8,9,2};
		for (int i=1;i<9;i+=2) {			
				System.out.print(i+ " ");			
		}		
	}
}*/
/*//length
package Array;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] arr= {1,5,6,0,1,1,8,9,2};
		System.out.println(arr.length);
	}
}
*/
//autoboxing-convert primitive to wrapper classes
//unboxing - converting wrapper to primitive datatypes
//Integer a= Interger.valueof(100);
//int b =a;

//Give the values of all types of wrapper classes and print the values
package Array;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		String s = "100";
		int a = 100;
		Integer b = a;
		Float c = Float.valueOf(100.8f);
		Long d = Long.parseLong(s);
		Double e = Double.parseDouble(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
