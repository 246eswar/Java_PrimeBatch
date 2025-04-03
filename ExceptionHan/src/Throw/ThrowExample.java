package Throw;
import java.util.*;
public class ThrowExample {	
	static void checkAge(int age) throws ArithmeticException { 
	    if (age < 18) {
	 throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
	    } else {
	 System.out.println("Access granted - You are old enough!"); 
	    }
	 } 	 
	 public static void main(String[] args) { 
	   checkAge(20); 
	  } 	
}
	/*
	void classAvailabilty() throws ClassNotFoundException{
		Class.forName("Program2");
		throw new ClassNotFoundException("class Not found ");
	}
	public static void main(String[] args) {
		ThrowExample p=new ThrowExample();
		try {
			p.classAvailabilty();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}*/