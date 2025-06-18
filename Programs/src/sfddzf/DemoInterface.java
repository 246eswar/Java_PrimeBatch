package sfddzf;

public interface DemoInterface {
	static void msg() {
		System.out.println("This is a static method");
		m();
	}
	private static void m() {
		System.out.println("This is a private method");
	}
}
