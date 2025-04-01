package Throw;
import java.util.*;
public class ThrowExample {
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
}



//Excaption handling in order to get the below ou