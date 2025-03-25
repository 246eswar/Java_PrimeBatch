package Oops;
public class Qiscet {
	void good() {
		System.out.println("Always good");
	}
}
class Jstar extends Qiscet{
	int a=5;
	void car() {
		System.out.println("This is sprots car!");
	}
}
class Navap extends Jstar{
	void show() {
		System.out.println("This is good show!!");
	}
}
class Aaali extends Qiscet{
	void tv() {
		System.out.println("This is good Tv!!");
	}
}
class Hannu extends Qiscet{
public static void main(String[] args) {
	Aaali A=new Aaali();
	Navap N=new Navap();
	Hannu H=new Hannu();
	A.tv();
	N.show();
	H.good();
	}
}