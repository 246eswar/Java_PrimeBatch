package sfddzf;
//return  positive elements minimum
import java.util.*;
public class MisPos
{
	public void pveEle(int[] arr)
	{
		int m=1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==m)
				m++;
			else if(arr[i]>m)
				break;
			
		}
		System.out.println(m);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		MisPos m=new MisPos();
		m.pveEle(arr);
	}
}
