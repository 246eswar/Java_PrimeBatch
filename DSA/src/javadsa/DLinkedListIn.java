package javadsa;
class Node1{
	int data;
	Node1 next;
	Node1 prev;
	Node1(int data){
		this.data=data;
	}
}
public class DLinkedListIn {
	Node1 head=null;
	Node1 tail=null;
	void insertAtBeginning(int data) {
		Node1 node=new Node1(data);
		if(head==null) {
			head=tail=node;
		}
		else {
			node.next=head;
			head.prev=node;
			head=node;
		}
	}
	void insertAtEnd(int data)
	{
		Node1 node=new Node1(data);
		if(head==null)
		{
			head=tail=node;
		}
		else
		{
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
	}
	int countNodes1()
	{
		int count=0;
	Node1 temp=head;
	while(temp!=null)
	{
		count++;
		temp=temp.next;
	}
	return count;
		
	}
	void insertAtPositionA(int data,int pos)
	{
		Node1 node=new Node1(data);
		int count=countNodes1();
		if(pos<1 || pos > count)
		{
			System.out.println("Invalid position");
			return;
		}
		if(pos==1)
			insertAtBeginning(data);
		if(pos==count)
			insertAtEnd(data);
		else
		{
			Node1 temp=head;
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			node.prev=temp;
			temp.next=node;
			temp.next.prev=node;
		}
	}
	void insertAtPositionB(int data,int pos)
	{
		Node1 node=new Node1(data);
		int count=countNodes1();
		if(pos<1 || pos > count)
		{
			System.out.println("Invalid position");
			return;
		}
		if(pos==1)
			insertAtBeginning(data);
		if(pos==count)
			insertAtEnd(data);
		else
		{
			Node1 temp=head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			node.prev=temp;
			temp.next=node;
			temp.next.prev=node;
		}
	}
	void insertionByValue(int data,int value)
	{
		if(head.data==value)
		{
			insertAtBeginning(data);
			return;
		}
		else {
			Node1 temp=head;
			Node1 node=new Node1(data);
			while(temp.next!=null && temp.next.data!=value) {
				temp=temp.next;
			}
			if(temp.next==null)
			{
				System.out.println("Value not found");
				return;
			}
			node.next=temp.next;
			node.prev=temp;
			temp.next=node;
			temp.next.prev=node;
			}
		}
	void display()
	{
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node1 temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args)
	{
		DLinkedListIn dll= new DLinkedListIn();
		dll.insertAtBeginning(10);
		dll.insertAtBeginning(20);
		dll.insertAtBeginning(30);
		dll.insertAtBeginning(40);
		dll.display();
		System.out.println(dll.tail.data);
		dll.insertAtEnd(50);
		dll.insertAtEnd(60);
		dll.display();
		System.out.println(dll.head.data);
		System.out.println("Nodes count:"+dll.countNodes1());
		dll.insertAtPositionA(100,2);
		dll.display();
		dll.insertAtPositionB(200,5);
		dll.display();
		dll.insertionByValue(34,10);
		dll.display();
	}
}
