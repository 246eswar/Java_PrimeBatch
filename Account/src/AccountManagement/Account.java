package AccountManagement;
import java.util.*;
public class Account {
	static Scanner sc =new Scanner(System.in);
	static Date currentDate=new Date();
	public static long Balance[];
	public static long number = sc.nextLong(); 
	public static void Withdraw(long accountNumbers[],String customerName, long accountnumber,long balance[]) {
		for(int i=0;i<accountNumbers.length-1;i++) {
			if(accountNumbers[i]==number) {
				long n=sc.nextLong();
				if(n<balance[i]) {
					System.out.println("Money withdraw successful");
					System.out.println(currentDate+" Current Balance is : "+(balance[i]-n));
				}
			}		
		}
	}
	public static void Display(long accountNumbers[],String customerName, long accountnumber,long balance[]) {
		for(int j=0;j<accountNumbers.length-1;j++) {
			if(accountNumbers[j]==number) {
			System.out.println("Customer Name: "+customerName);
			System.out.println("Account Number : "+accountNumbers[j] );
			System.out.println("Account Balance : "+balance[j]);
		}		
	}
		}
}
