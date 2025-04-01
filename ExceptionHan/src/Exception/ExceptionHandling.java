package Exception;
//object is parent built in class
//Throwable is a in built class-- 
//it divides 1.Error-- we do not handle it 2.Exception -- we can handle it
//exception is nothing but run time error
//input output checked exception -- compile time errors like class not found
//run time error is unchecked exception --run time--like array index out of bound
//error hierarchy---***---
//Types of Exceptions
//**Exception is an unwanted or unexpected event,which occurs during execution of a program,
//i.e., at runtime,that disrupts the normal flow of the program's instructions.**
//exception object
//Compilation error
//runtime error
//Exception handling
//** Advantages of exception handling
//**  Methods to print Exception
// How does JVM handle an Exception?
//try catch finally
//Major reasons
//Invalid user input
//Device failure
//Loss of network connection
//Physical limitations(Out of disk memory)
//code errors
//opening an unavailable file
import java.util.*;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=sc.nextInt();
		int arr[]= {1,2,3,4,5};
		//System.out.println(arr[index]);	
		//System.out.println("Hello world!!");	
		try {			
			System.out.println(arr[index]);	
			System.out.println(arr[1]);
		}
		catch(Exception e){
			System.out.println("Exception Ocuured "+e);
		}
		System.out.println("Exception is worked!!");
	}
}