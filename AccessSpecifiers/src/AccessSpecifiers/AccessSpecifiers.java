package AccessSpecifiers;
//public --> class, package ,subclass(other package) ,world(Every where)
//protected --> class, package ,subclass(other package) 
//default --> class, package 
//private --> class
//import Oops.Par;
public class AccessSpecifiers extends Jstar{
	public static void main(String[] args) {
		AccessSpecifiers a=new AccessSpecifiers();
		a.show();
		
		//Par b=new Par();
		//b.car();
	}
}
class Jstar{
	void show() {
		System.out.println("Jstar doing show!!");
	}
}