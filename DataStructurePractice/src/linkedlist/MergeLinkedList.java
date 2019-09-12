package linkedlist;

public class MergeLinkedList {
	static Node head1;
	static Node head2;
	static Node head;
	
	static class Node {
		public int data;
		Node next;
	}
	
	public Node createNode(int y) {
		Node node = new Node();
		node.data=y;
		node.next=null;
		return node;
	}
	
	public void inserth1(int x) {
		Node node=createNode(x);
		if(head1==null) {
			head1=node;		
		}
		else {
			Node n=head1;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	public void inserth2(int x) {
		Node node=createNode(x);
		if(head2==null) {
			head2=node;		
		}
		else {
			Node n=head2;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}	
	}
	
	public void printh1() {
		Node n=head1;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+" ");	
		System.out.println();
	}
	
	public void printh2() {
		Node n=head2;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+" ");	
		System.out.println();
	}
	

	public Node mergelist(Node head1,Node head2) {
		Node dummynode = createNode(0);
		
		Node tail=dummynode;
		while(true) {
			if(head1.data<head2.data) {
				tail.next=head1;
				head1=head1.next;
			}
			else {
				tail.next=head2;
				head=head2.next;	
			}
			tail=tail.next;
			if(head1==null)
			{
				tail.next=head2;
				break;
			}
			else if(head2==null) {
				tail.next=head1;
				break;
			}
		}
		return dummynode.next;
		
	}
	public void print() {
		Node n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+" ");	
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		MergeLinkedList ml= new MergeLinkedList();
		ml.inserth1(1);
		ml.inserth1(3);
		ml.inserth1(12);
		ml.inserth1(40);
		
		ml.inserth2(11);
		ml.inserth2(13);
		ml.inserth2(14);
		ml.inserth2(20);
//		ml.inserth2(24);
//		ml.inserth2(64);
		ml.printh1();
		ml.printh2();
		System.out.println(ml.mergelist(head1,head2));
		ml.print();
	}

}
