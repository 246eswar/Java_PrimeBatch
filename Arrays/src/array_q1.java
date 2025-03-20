
import java.util.Scanner;
public class array_q1 {		
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int tar=sc.nextInt();
    	 int arr[]=new int[n];
    	 for (int i=0;i<n;i++){
    	   arr[i]=sc.nextInt();
    	 }
    	 int count=0;    	 
    	 for(int i=0;i<arr.length;i++){
    	   if(tar==arr[i] && arr[0]==arr[arr.length-1]){
    	     count+=1;
    	   }
    	 }System.out.println(count);
     }
}