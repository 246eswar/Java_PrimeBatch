package Practice;
import java.util.*;
import java.lang.reflect.Array;
public class ArrayBinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,7,6,5,8,5,9,7};
//		int small=100;
//		int big=20;
//		if(small>big) {
//			int temp=small;
//			small=big;
//			big=small;
//		}
		//BoobleSort
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}System.out.println(Arrays.toString(arr));
	}
}
