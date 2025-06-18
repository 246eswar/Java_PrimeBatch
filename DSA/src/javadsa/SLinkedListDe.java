package javadsa;

class Node2{
	int data;
	Node2 next;
	Node2(int data){
		this.data=data;
	}
}
public class SLinkedListDe{
	Node2 head;
	void insertAtBeginning(int data)
	{
		Node2 node = new Node2(data);
		if(head==null)
			head=node;
		else
		{
			node.next=head;
			head=node;
		}
	}
	int countNode2() {
		int count=0;
		Node2 temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	void deletionAtBeginning()
	{
		if(head==null)
			System.out.println("deletion not posssible");
		else
		{
			head=head.next;
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
			Node2 temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	void deletionAtPosition(int pos)
	{
		int count=countNode2();
		if(pos>count || pos<count)
		{
			System.out.println("Invalid position");
		}
		if(pos==1)
			deletionAtBeginning();
		if(pos==count)
			deletionAtEnd();
		else
		{
			Node2 temp=head;
			for(int i=0;i<pos-1;i++)
				if(temp==null)
					return;
				temp=temp.next;
			temp.next=temp.next.next;
		}
	}
	void deleteByValue(int value)
	{
		if(head == null)
			System.out.println("not possible");
		if(head.data==value)
			deletionAtBeginning();
		}
	
		Node2 temp=head;
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
				temp.next=temp.next.next;
			}
	}
	void display()
	{
		if(head==null)
			System.out.println("List is empty");
		else {
			Node2 temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
			SLinkedListDe sll=new SLinkedListDe();
			sll.insertAtBeginning(10);
			sll.insertAtBeginning(20);
			sll.insertAtBeginning(30);
			sll.insertAtBeginning(40);
			sll.insertAtBeginning(50);
			sll.display();
			sll.deletionAtBeginning();
			sll.display();
			sll.deletionAtEnd();
			sll.display();
			sll.deletionAtPosition(2);
			sll.display();
			
	}
}

