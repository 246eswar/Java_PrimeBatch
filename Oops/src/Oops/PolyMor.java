package Oops;
//Polymorphism   1.method Overloading(same method name with different arguments in one class)
//                also called as compile time polymorphism
//- 2.method OverRiding --Run time polymorphism   
public class PolyMor {
	public static void main(String[] args) {
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
	}
}