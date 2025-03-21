package Practice;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DiscountMovie {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of ticket:");
		int ticket=sc.nextInt();
		if(ticket<5&&ticket>40) {
			System.out.print("Minimum of 5 and Maximum of 40 Tickets");
			System.exit(0);
		}else {
			System.out.print("Do you want refreshment:");
			char ref=sc.next().charAt(0);
			System.out.print("Do you have coupon code:");
			char coup=sc.next().charAt(0);
			System.out.print("Enter the circle:");
			char circle=sc.next().charAt(0);
			double totalcost=0;
			if(circle=='k' ||circle=='q') {
				int costt=(circle == 'k')?75:100;				
				totalcost=(costt*ticket);
				if(ticket>20) totalcost -=(totalcost*0.1);
				if(coup=='y') totalcost-=(totalcost*0.02);
				int costref=(ref=='y')?50:0;
				totalcost+=(costref*ticket);
				DecimalFormat d2=new DecimalFormat("#.00");
				System.out.println("Ticket cost:"+(d2.format(totalcost)));
			}else {
				System.out.println("Invalid Input");
			}
		}
	}
}