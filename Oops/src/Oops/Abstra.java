package Oops;
//Abstraction is Hides the unnecessary data 
//(hiding the implementation of methods or classes and sees the working of methods or classes)
//abstract keyword we use for it
//light security for using it
//concrete method and abstract methods are there in abstract class
//implementation of method is not abstract class is abstract method
//implementation of method is there in abstract class is concrete method
//who extends the abstract class ,in that abstract method is implemented 
//without concrete method 100% abstraction is there
//with concrete methods abstraction is reduced
public class Abstra extends Ab{
	public static void main(String[] args) {
		Abstra a=new Abstra();
		a.good();
		a.hello();
		a.bye();
	}
		void hello() {
			System.out.println("Hello!");
		}
		void bye() {
			System.out.println("Good bye!!");
		}	
}
abstract class Ab{
	abstract void hello();
	abstract void bye();
	void good() {
		System.out.println("Good evening!!");
	}
}