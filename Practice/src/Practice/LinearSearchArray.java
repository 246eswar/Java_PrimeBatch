package Practice;
import java.util.Scanner;
public class LinearSearchArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		System.out.println("Enter target element: ");
		int target=sc.nextInt();
		linearSearch(arr,target);
	}
	static void linearSearch(int[] array,int target){
		int count=0;
		int i=0;
		for(i=0;i<array.length;i++) {
			if(array[i]==target) {
				count++;
				break;
			}
		}
		if(count>0) System.out.println(target +" is found at index "+i);
		else 	System.out.println(target + " is not found");
	}	
}

//Binary search
//array sort
//{1,2,3,4,6,5,7,5,5}
//Arrays.sort(arrayname}
//{1,2,3,4,5,5,5,6,7}

