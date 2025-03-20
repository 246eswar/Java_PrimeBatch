import java.util.Scanner;
public class Array_q2_checksubarrayelement {
	public static void main(String[] args) {
   	 Scanner sc=new Scanner(System.in);
   	 int size=sc.nextInt();
   	 int[] arr=new int[size];
   	 for(int i=0;i<size;i++){
   	     arr[i]=sc.nextInt();
   	 }
   	 System.out.println("enter target:");
   	 int t=sc.nextInt();
   	 System.out.println("enter subsize:");
   	 int sz=sc.nextInt();
   	 int count=0;
   	 int divisions=arr.length/sz;
   	 for(int j=0;j<arr.length;j=j+sz){
   		 for(int k=0;k<sz;k++) {
   			 if(arr[k]==t){
   				 count++;
   			 }
   	     }
   	 }
   	 if(count==divisions){
   	     System.out.println(1);
   	 }else{
   	     System.out.println(0);
   	 }
    }
}

