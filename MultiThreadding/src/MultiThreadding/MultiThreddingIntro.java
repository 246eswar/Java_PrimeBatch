package MultiThreadding;
//New Thread
//New,Runnable,Running,Waiting ,Dead 5 States of Tread life cycle
//two ways to create thread class
//1.extending thread classes
//2.Runnable interface
public class MultiThreddingIntro extends Thread
	{
	public void run() {
		System.out.println("Thread start running");
	}
	public static void main(String[] args) {
		MultiThreddingIntro s=new MultiThreddingIntro();
		s.start();
		//in thread class already present run so override
		//start method is also already in thread class
		//link is there in run and start methods
	}
}