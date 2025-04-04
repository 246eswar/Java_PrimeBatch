package MultiThreadding;
//sleep and wait methods are used to runnable to waiting threads
//notify and wait at object class
//sleep is in Thread class
//producer and consumer problem see example for wait
//writer is write then only reader reads it up to that time he is in wait(rest) state
public class Slee extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Hello ");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException ie) {
				System.out.println("Exe");
			}
		}		
	}
public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			System.out.println("Hi!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				System.out.println("Exe");
			}
	}
	Slee s=new Slee();
	s.start();
	}
}