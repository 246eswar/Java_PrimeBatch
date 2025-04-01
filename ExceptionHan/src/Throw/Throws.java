package Throw;
//Difference b/w throws,throw
//checked exception throws used--
//Throw mainly used for custom exception
//for declaring this custom  expression throws used
//method signature throws is used
//in side the method throw is used
//unchecked exception both
//throw is explicitly object created
//we can declare multiple exceptions using throws
//class.forName---***see Once
//3 methods to geta exception
public class Throws {
	public static void eligibility(int a) throws ClassNotFoundException {
		
		if(a<18) {
			throw new ClassNotFoundException("Class Not found ");
		}
	}
	public static void main(String[] args) {
		//Vote >=18
		
		int age=15;
		try {
			eligibility(age);
		}catch(Exception e) {
			
		}
		System.out.println("Person eligible for vote ");
	}
}