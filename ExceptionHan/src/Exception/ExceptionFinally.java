package Exception;
import java.util.*;
public class ExceptionFinally {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		//int arr[]= null;		
		try {
			int n=sc.nextInt();
			System.out.println(arr[n]);
		}catch(InputMismatchException e){
			System.out.println("Exception Raised!! "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception Raised!! "+e);
		}
		catch(NullPointerException e){
			System.out.println("Exception Raised!! "+e);
		}
		finally{
			System.out.println("It is a final Block");
		}
	}
}