package linkedlist;

public class RunnerClass {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(2);
		ll.insert(3);
		ll.insertAtFirst(1);
		ll.insertAt(4,3);
		ll.print();
		ll.size();
		ll.deleteAt(10);
		ll.print();
	}

}
