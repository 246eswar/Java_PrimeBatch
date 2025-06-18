package SingleLinkedList;
import java.util.*;
class Node{
	//creating a node
	int data;
	Node next;//reference pointer
	Node(int data){//for initialize the value
		this.data=data;
		next=null;
	}
}
public class SingleLinkedList {
	Node head;
	boolean isEmpty() {
		return head==null;
	}
	void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		}	
	void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(isEmpty()) {
			insertAtBeginning(data);
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	void insertAtPosition(int pos,int data) {
		Node newNode=new Node(data);
		if(pos==0) {
			insertAtBeginning(data);
			return;
		}
		Node temp=head;
		for(int i=0;i<pos-1 && temp != null;i++) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Position out of bound");
			return;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	void display() {
		if(isEmpty()) {
			System.out.println("list is empty");
			return;
		}
	    Node temp=head;
	    while(temp!=null) {
	    	System.out.print(temp.data+"->");
	    	temp=temp.next;
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		SingleLinkedList obj=new SingleLinkedList();
		while(true){
			System.out.println("1. insertAtBeginning\n2. insertAtEnd\n3. insertAtPosition\n4. display\n5. exit");
			int ch=sc.nextInt();
			switch(ch){
				case 1:
					int data=sc.nextInt();
					obj.insertAtBeginning(data);
					break;
				case 2:
					int ele=sc.nextInt();
					obj.insertAtEnd(ele);
					break;
				case 3:
					int pos=sc.nextInt();
					int element=sc.nextInt();
					obj.insertAtPosition(pos,element);
					break;
				case 4:					
					obj.display();
					break;
				case 5:					
					System.out.println("Exiting...");
				    sc.close();
				    System.exit(0);
			}
		}
	}
}