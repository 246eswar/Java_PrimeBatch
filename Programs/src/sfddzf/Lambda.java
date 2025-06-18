package sfddzf;
@FunctionalInterface
interface LambdaDemo{
	public void msg();
}
public class Lambda {
	public static void main(String[] args) {
		LambdaDemo l=new LambdaDemo(){
		public void msg() {
			System.out.println("This is a ananymous inner class");
		}
	};
	l.msg();
	}
}