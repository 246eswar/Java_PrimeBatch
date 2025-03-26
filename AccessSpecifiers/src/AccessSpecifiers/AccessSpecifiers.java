package AccessSpecifiers;
//public class, package ,subclass(other package) ,world(Every where)
//protected class, package ,subclass(other package) 
//default class, package 
//private class 
public class AccessSpecifiers extends Jstar{
	public static void main(String[] args) {
		AccessSpecifiers a=new AccessSpecifiers();
		a.show();
	}
}
class Jstar{
	void show() {
		System.out.println("Jstar doing show!!");
	}
}