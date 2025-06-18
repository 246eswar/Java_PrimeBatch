package javadsa;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class SLinkedListIn {
	Node head;
	void insertAtBeginning(int data)
	{
		Node node = new Node(data);
		if(head==null)
			head=node;
		else
		{
			node.next=head;
			head=node;
		}
	}
	void insertAtEnd(int data)
	{
		Node node = new Node(data);
		if(head==null) {
			head=node;
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	void display()
	{
		if(head==null)
			System.out.println("List is empty");
		else {
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	int countNode() {
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	void insertAtPosition(int data,int pos)
	{
		Node node=new Node(data);
		int count=countNode();
		if(pos>count || pos<0)
		{
			System.out.println("Invalid position");
		}
		else
		{
			Node temp=head;
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
	}
	void insertAtPositionBefore(int data,int pos)
	{
		Node node=new Node(data);
		int count=countNode();
		if(pos>count || pos<0)
		{
			System.out.println("Invalid position");
		}
		else
		{
			Node temp=head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
	}
	void insertionByValue(int data,int value)
	{
		Node node=new Node(data);
		if(head.data==value)
		{
			insertAtBeginning(data);
			return;
		}
		Node temp=head;
		while(temp.next.data!=value && temp!=null)
			{
				temp=temp.next;
			}
			if(temp==null)
			{
				System.out.println("Value not found");
			}
			else
			{
				node.next=temp.next;
				temp.next=node;
			}
		}
	public static void main(String[] args)
	{
		SLinkedListIn sll=new SLinkedListIn();
		sll.insertAtBeginning(10);
		sll.insertAtBeginning(20);
		sll.display();
		sll.insertAtBeginning(30);
		sll.insertAtEnd(40);
		sll.insertAtEnd(50);
		sll.display();
		System.out.println("Count:"+sll.countNode());
		sll.insertAtPosition(100,2);
		sll.display();
		sll.insertAtPositionBefore(200,3);
		sll.display();
		sll.insertionByValue(16, 10);
		sll.display();
	}
}
