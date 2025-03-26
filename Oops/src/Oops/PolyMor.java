package Oops;
//Polymorphism   1.method Overloading(same method name with different arguments in one class)
//                also called as compile time polymorphism --during compile time it check arguments and call that method
//- 2.method OverRiding --Run time polymorphism (compile time no ovrloading is done --during run child method call
//                      -- define same thing again 
//(Different class parameters(Arguments) same return type same method name same
public class PolyMor {
	public static void main(String[] args) {
		//method overriding
		One o=new One();		
		o.car();
	}	
}
class One extends Two{
	void car() {
		System.out.println("This is a good car");
		super.car();
	}
}
class Two{
	void car() {
		System.out.println("cost of this car is high");
	}
}
/*
public static void main(String[] args) {
	 //method overloading
	  PolyMor sc=new PolyMor();
	int a=1;
	int b =2;
	int c=3;
	sc.mul();
	sc.mul(a);
	sc.mul(a,b);
	sc.mul(a,b,c);
}
void mul() {
	System.out.println("Zero arguments");
}
void mul(int a) {
	System.out.println(a);
}
void mul(int a,int b) {
	System.out.println(a*b);
}
void mul(int a,int b,int c) {
	System.out.println(a*b*c);
	
	
	
}*/