package MultiThreadding;
//runnable is predefined interface
public class RunnableInterfa implements Runnable{
	public void run() {		
		System.out.println("Good morning");
		System.out.println("My Thread name is : "+Thread.currentThread().getName());
		Thread.currentThread().setPriority(9);
		System.out.println("My Thread Priority is : "+Thread.currentThread().getPriority());
		System.out.println("My Thread Id : "+Thread.currentThread().getId());
		Thread.currentThread().setName("Name");
		System.out.println("My Thread name is : "+Thread.currentThread().getName()); 
		System.out.println("My Thread  is Alive or not : "+Thread.currentThread().isAlive()); 
		
	}
	public static void main(String[] args) {
		/*RunnableInterfa s=new RunnableInterfa();
		Thread qt=new Thread(s);//Thread create*/
		//or
		Thread qt=new Thread(new RunnableInterfa());		
		qt.start();
		System.out.println("My Thread name is : "+Thread.currentThread().getName());
		System.out.println(qt.isAlive());//it is alive if it is started
		System.out.println("My Thread name is : "+Thread.currentThread().isAlive()); 
		//MultiThread		
		Thread qt1=new Thread(new RunnableInterfa());		
		qt1.start();		
		qt1.isAlive();//it is alive if it is started
		System.out.println("My Thread name is : "+Thread.currentThread().isAlive());
		Thread qt2=new Thread(new RunnableInterfa());		
		qt2.start();
		qt2.isAlive();//it is alive if it is started
		System.out.println("My Thread name is : "+Thread.currentThread().isAlive());
	}
}