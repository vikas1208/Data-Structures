package linkedlist;

public class LinkedList {
	Node head;
	
	public Node createNode(int y) {
		Node node = new Node();
		node.data=y;
		node.next=null;
		return node;
	}
	
	public void insert(int x) {
	Node node =	createNode(x);
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;	
		}
	}
	
	public void insertAtFirst(int x) {
		Node node=createNode(x);
		node.next=head;
		head=node;
	}
	
	public void insertAt(int x,int position) {
		int size=size();
		if(position==0)
		{
			insertAtFirst(x);
		}
		else if(position>size) {
			System.out.println("The node to be inserted is outside the index");
		}
		else {
		Node node =createNode(x);
		Node n=head;
		for(int i=0;i<position-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	
	public int size() {
		Node n=head;
		int count=0;
		while(n.next!=null) {
			n=n.next;
			count++;
		}
		System.out.println(count+1);
		return count+1;
	}
	
	public void print(){
		Node n=head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		
		System.out.print(n.data+" ");
			
			System.out.println();
	}
	
	public void deleteAt(int position) {
		int size=size();
		if(position==0) {
			Node n=head;
			head=n.next;
			
		}
		else if(position>size)
		{
			System.out.println("The node to be deleted is outside the index");
		}
		else {
		Node n = head;
		Node n1=null;
		for(int i=0;i<position-1;i++) {
			n= n.next;
		}
			n1=n.next;
			n.next=n1.next;
		}
	}
}
