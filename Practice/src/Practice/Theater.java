package Practice;
import java.util.*;
public class Theater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought:");
		int pizzas=sc.nextInt();
		System.out.println("Enter the no of puffs bought:");
		int puffs=sc.nextInt();
		System.out.println("Enter the no of cool drinks bought:");
		int cooldrinks=sc.nextInt();
		System.out.println("No of pizzas:"+pizzas);
		System.out.println("No of puffs:"+puffs);
		System.out.println("No of cooldrinks:"+cooldrinks);
		int ratepizza=100;
		int ratepuff=20;
		int ratecool=10;
		int pizzar=pizzas*ratepizza;
		int puffr=puffs*ratepuff;
		int coolr=cooldrinks*ratecool;
		int total=pizzar+puffr+coolr;
		System.out.println("Total price="+total);
		System.out.println("ENJOY THE SHOW!!!");
	}

}
