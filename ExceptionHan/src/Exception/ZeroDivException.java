package Exception;
import java.util.*;
public class ZeroDivException {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			try {				
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a/b);				
			}catch(ArithmeticException e){
				System.out.println("Exception Occured!! "+e);
			}
			catch(InputMismatchException e){
				System.out.println("Exception Raised!! "+e);
			}
	}
}