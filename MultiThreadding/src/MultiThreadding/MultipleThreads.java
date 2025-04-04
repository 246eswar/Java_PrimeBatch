package MultiThreadding;

public class MultipleThreads extends Thread{
	
		public void run() {
			System.out.println("Thread start running");
		}
	public static void main(String[] args) {
		
		MultipleThreads s=new MultipleThreads();
		MultipleThreads q=new MultipleThreads();
		MultipleThreads r=new MultipleThreads();
		MultipleThreads t=new MultipleThreads();
			
			s.start();
			q.start();
			r.start();
			t.start();
	}

}
