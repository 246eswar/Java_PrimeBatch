package Oops;
//implements keyword is used in interface instead of extends
//in interface every method is abstract method
//up to java 8 we do not implement method in interface
//after it, using static,default keyword we can implement methods
public class Inter implements Qis,Ram {
	public static void main(String[] args) {
		Inter a=new Inter();
		a.add();
		a.sub();	
		a.hello();
		a.good();
	}
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		System.out.println("sub");
	}
	public void hello() {
		System.out.println("hello");
	}
	public void good() {
		System.out.println("good");
	}	
}
interface Qis{
	void add();
	void sub();
	
}
interface Ram{
	void hello();
	void good();
}