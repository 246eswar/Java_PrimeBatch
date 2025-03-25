package Sorting;
public class BoobleSorting {
	public static void main(String[] args) {
		int[] arr= {7,4,6,2,1,6,3,2,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) System.out.print(arr[i]);
			else System.out.print(arr[i]+" ");
		}
	}
}