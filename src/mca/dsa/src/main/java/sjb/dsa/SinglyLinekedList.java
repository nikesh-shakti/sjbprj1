package sjb.dsa;

public class SinglyLinekedList {
	Node head;
	
	public void insert(int data) {
		Node newNode=new Node(data);  
		
		if(head==null) {
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	public void display() {
		Node current=head;
		
		while (current !=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println("null");
	}
	public void addatposition(int data,int pos) {
		Node newnode=new Node(data);
		Node temp=head;
		for(int i=0;i<pos-1 && temp.next!=null;i++) {
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}

	public static void main(String[] args) {
		SinglyLinekedList list=new SinglyLinekedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.display();
		list.addatposition(25, 3);
		list.display();

	}

}
