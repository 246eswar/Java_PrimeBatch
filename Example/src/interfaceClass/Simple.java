package interfaceClass;
/*interface Printer1{
	public void print(String s);
}
public class Simple {
	public static void main(String[] args) {
		Printer1 l=(String s)->{System.out.println("Hello  "+s);};
		l.print("QISCET");
	}
}
*/

import java.util.function.Consumer;

//Consumer
interface Printer1{
	public void accept(int i);
	
}
public class Simple{
	public static void main(String[] args) {
		Consumer<Integer> c=(Integer i)->{System.out.println(i);};
		c.accept(10);
	}
}