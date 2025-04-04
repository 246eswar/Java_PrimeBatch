package MultiThreadding;
public class Multithre implements Runnable{
	public void run() {		
	System.out.println("My Thread  is Alive or not : "+Thread.currentThread().isAlive()); 
	}
	public static void main(String[] args) {
		Thread qt1=new Thread(new Multithre());		
		qt1.start();
		System.out.println(qt1.isAlive());//it is alive if it is started
		System.out.println("My Thread qt1 is : "+Thread.currentThread().isAlive()); 
		Thread qt2=new Thread(new Multithre());		
		qt2.start();		
		System.out.println("qt2 is : " +qt2.isAlive());//it is alive if it is started
		System.out.println("My Thread qt2 is : "+Thread.currentThread().isAlive());
		Thread qt3=new Thread(new Multithre());		
		qt3.start();
		System.out.println("qt3 is : " +qt3.isAlive());
		System.out.println("My Thread qt3 is : "+Thread.currentThread().isAlive());
	}
}