package QueueUsingArrays;
import java.util.*;
public class QueueUsingArrays {
	int[] queue;
	static int size;
	int front;
	int rear;
	QueueUsingArrays(int size) {
		this.size=size;
		queue=new int[size];
		front=-1;
		rear=-1;
	}
	boolean isFull() {
		return rear==size-1;
	}
	boolean isEmpty() {
		return ((front>rear)||(front==-1&&rear==-1));
	}
	void enqueue(int data) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}if(front==-1) {
			front=0;
		}rear++;
		queue[rear]=data;
		
	}void dequeue(){
		if(isEmpty()) {
			System.out.println("is empty");
			return;
		}System.out.println("Removed element"+queue[front]);
		front++;
		
	}
	void peak() {
		if(isEmpty()) {
			System.out.println("is empty");
			return;
		}System.out.println(queue[front]);
	}void display(){
		if(isEmpty()) {
			System.out.println("is empty");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		size=sc.nextInt();
		QueueUsingArrays obj=new QueueUsingArrays(size);
		while(true) {
			System.err.println("1. enqueue\n 2. dequeue\n 3. peak\n 4. display\n 5. exit\n");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				int data=sc.nextInt();
				obj.enqueue(data);
				break;
			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.peak();
				break;
			case 4:
				obj.display();
				break;
			case 5:
				obj.peak();
				break;
			default:
				System.out.println("ala kadhu ra picchodaa chusii enter chayu");
			}
		}

	}

}
