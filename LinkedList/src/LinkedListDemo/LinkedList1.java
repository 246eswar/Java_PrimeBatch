package LinkedListDemo;

import javadsa.Node2;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public class LinkedList1 {
	Node head;
	void insertionAtBeginning(int data)
	
	{
		Node node = new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
	}
	void insertionAtEnding(int data)
	{   Node node = new Node(data);
		if(head == null)
		head = node;
		else {
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = node;
		}
		
		
	}
	int countNodes() {
		int count =0;
		Node temp = head;
		while(temp !=null)
		{
		   count++;
		   temp = temp.next;
		}
		return count;
	}
	void insertionByPosition(int data,int pos)
	{   Node node = new Node(data);
	int count = countNodes();
	if(pos<0 || pos>count)
	{
		System.out.println("Invalid position");
		
	}
		if(pos==1)
		{
			insertionAtBeginning(data);
		}
		if(pos==count)
		{
			insertionAtEnding(data);
		}
		
		else 
		{
			Node temp = head;
			for(int i=1;i<pos-1;i++)
			{
				temp = temp.next;
				
			}
			node.next = temp.next;
			temp.next = node;
			
		}
		
	}
	void insertionByValue(int data,int value)
	{   Node node = new Node(data);
		if(head.data==value)
		{
			insertionAtBeginning(data);
			return;
		}
			Node temp = head;
			while(temp.next.data != value && temp != null)
			{
				temp = temp.next;
			}
			if(temp==null)
			{
				System.out.println("Value not found");
			}
			else {
				node.next = temp.next;
				temp.next = node;
				
			}
		}
	void deletionAtBeginning()
	{
		if(head==null)
		{
			System.out.println("Deletion is not possible");
		}
		else
		{
			head = head.next;
		}
	}
	void deletionAtEnd()
	{
		if(head==null) {
			System.out.println("deletion not posssible");
		}
		if(head.next==null) {
			head=null;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	void display() {
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		else {
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		LinkedList1 l = new LinkedList1();
		l.insertionAtBeginning(10);
		l.insertionAtBeginning(20);
		l.insertionAtBeginning(30);
		l.insertionAtBeginning(40);
		l.insertionAtBeginning(50);
		l.display();
		l.insertionAtEnding(60);
		l.display();
		System.out.println(l.countNodes());
		l.insertionByPosition(90,2);
		l.display();
		l.insertionByValue(70,40);
		l.display();
		l.deletionAtBeginning();
		l.display();
		l.deletionAtEnd();
		l.display();
		

	}

}
