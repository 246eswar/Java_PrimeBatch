package Exception;
import java.util.*;
public class DivideandAdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0 ;
		try {			
			num=sc.nextInt();
			
		}catch(ArithmeticException e){
			//System.out.println(e);
			e.printStackTrace();//exception full details with which line got error
			System.out.println(e.toString());//full error
			System.out.println(e.getMessage());//only message
		}try {			
			int num1=sc.nextInt();
			int value=10/num1;
		}
		
		
		catch(InputMismatchException ie){
			System.out.println(ie.getMessage());			
		}
		//System.out.println(value);
		System.out.println(10+num);	
		/*int num=sc.nextInt();
		try {			
			int value=10/num;			
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(InputMismatchException ie){
			System.out.println(ie);
		}
		//System.out.println(value);
		System.out.println(10+num);*/
	}
}