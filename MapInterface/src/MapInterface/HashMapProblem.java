package MapInterface;
import java.util.*;
public class HashMapProblem {	
	public static void main(String[] args) {
		Integer[] nums= {1,1,1,2,2,3};
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();		
		System.out.println("Enter the number Limit ");
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();		
		for(int i=0;i<nums.length;i++) {   //Time complexity O(n)   
			if(hp.containsKey(nums[i]))   hp.put(nums[i], hp.get(nums[i])+1);
			else   hp.put(nums[i], 1);
		}
		System.out.println("The values greater than "+target+" is ");	
		for(Map.Entry<Integer,Integer> m:hp.entrySet())       // time complexity = O(n)
			if(m.getValue()>=target) System.out.println(m.getKey()+" : "+m.getValue()+"  ");
	}
}
	// Final time Complexity is O(N+N)=O(2N)=O(N)
	
	/*public static void main(String[] args) {
		int arr[]= {1,1,1,2,2,3};
		System.out.println("Enter the count target ");
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==-1) {
					count=0;
					break;
				}
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			if(count>0&count>=target) {
				System.out.println("the count of "+arr[i]+" is "+count);
			}
		}
	}
}*/