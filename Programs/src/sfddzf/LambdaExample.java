package sfddzf;
import java.util.*;
@FunctionalInterface
interface LambdaDemo1{
	public void msg();
}
public interface LambdaExample {
	public static void main(String[] args) {
		LambdaDemo1 l=()->{System.out.println("This is a ananymous inner class");};
		l.msg();
	}
}
