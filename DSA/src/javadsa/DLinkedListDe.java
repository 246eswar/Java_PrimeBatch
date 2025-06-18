package javadsa;
class Node3{
	int data;
	Node3 next;
	Node3 prev;
	Node3(int data){
		this.data=data;
	}
}

public class DLinkedListDe 
{
	Node3 head=null;
	Node3 tail=null;
	void insertAtBeginning(int data) {
		Node3 node=new Node3(data);
		if(head==null) {
			head=tail=node;
		}
		else {
			node.next=head;
			head.prev=node;
			head=node;
		}
	}
	void deletionAtBeginning() {
		if(head==null)
		{
			System.out.println("not possible");
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	void deletionAtEnd() {
		if(head==null)
		{
			System.out.println("not possible");
		}
		if(head.next==null)
		{
			head=tail=null;
			return;
		}
		tail=tail.prev;
		tail.next=null;
	}
	int countNodes3()
	{
		int count=0;
	Node3 temp=head;
	while(temp!=null)
	{
		count++;
		temp=temp.next;
	}
	return count;
		
	}
	void deletionAtPositionA(int pos)
	{
		int count=countNodes3();
		if(pos<1 || pos > count)
		{
			System.out.println("Invalid position");
			return;
		}
		if(pos==1) {
			deletionAtBeginning();
			return;
		}
		if(pos==count) {
			deletionAtEnd();
			return;
		
		}
			Node3 temp=head;
			for(int i=0;i<pos-1;i++)
			
				temp=temp.next;
			temp.next=temp.next.next;
			Node3 s=temp.next.next;
			s.prev = temp;
		}
	void deletionAtPositionB(int pos)
	{
		int count=countNodes3();
		if(pos<1 || pos > count)
		{
			System.out.println("Invalid position");
			return;
		}
		if(pos==1) {
			deletionAtBeginning();
			return;
		}
		if(pos==count) {
			deletionAtEnd();
			return;
		
		}
			Node3 temp=head;
			for(int i=1;i<pos-1;i++)
			
				temp=temp.next;
			temp.next=temp.next.next;
			temp.next.next.prev=temp;
			//Node3 s=temp.next.next;
			//s.prev = temp;
		}
	void deleteByValue(int value)
	{
		if(head==null)
		{
			System.out.println("deletion not possible");
			return;
		}
		if(head.data==value) {
			deletionAtBeginning();
			return;
		}
		if(tail.data==value) {
			deletionAtEnd();
			return;
		}
		Node3 temp=head;
		while(temp.next!=null && temp.next.data!=value) {
			temp=temp.next;
		}
		if(temp.next==null)
		{
			System.out.println("Value not found");
			return;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
		}
		
	void display()
	{
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node3 temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args)
	{
		DLinkedListDe dll= new DLinkedListDe();
		dll.insertAtBeginning(10);
		dll.insertAtBeginning(20);
		dll.insertAtBeginning(30);
		dll.insertAtBeginning(40);
		dll.insertAtBeginning(50);
		dll.insertAtBeginning(60);
		dll.insertAtBeginning(70);
		dll.display();
		dll.deletionAtBeginning();
		dll.display();
		dll.deletionAtEnd();
		dll.display();
		dll.deletionAtPositionA(2);
		dll.display();
		dll.deletionAtPositionB(1);
		dll.display();
		dll.deleteByValue(5     0);
		dll.display();
		
	}
}