package linkedlist;

public class ReverseLinkedList {
	Node head;
	public Node CreateNode(int y) {
		Node node = new Node();
		node.data=y;
		node.next=null;
		return node;
		
	}
	
	public void insert(int x) {
		Node node=CreateNode(x);
		if(head==null) {
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null) {
				n= n.next;
			}
			n.next=node;		
		}
	}
	public void print() {
		Node n=head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+" ");
		System.out.println();
	}
	
	public void reverselist() {
		Node prev=null;
		Node current= head;
		Node next =null;
		while(current.next!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
			current.next=prev;
			head=current;
	}
	
	public static void main(String[] args) {
	ReverseLinkedList rv= new ReverseLinkedList();
	rv.insert(1);
	rv.insert(2);
	rv.insert(3);
	rv.insert(4);
	rv.insert(5);
	rv.insert(6);
	rv.print();
	rv.reverselist();
	rv.print();
	}
}
