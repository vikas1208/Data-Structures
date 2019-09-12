package stack;

public class Runner {

	public static void main(String[] args) {
		StackImp list = new StackImp();
		System.out.println(list.isEmpty());
		list.push(12);
		list.push(10);
		list.push(11);
		list.push(1);
		list.push(10);
		list.size();
		list.show();
		list.pop();
		list.show();
		list.peek();
		list.pop();
		list.show();
		list.peek();
		list.size();
		System.out.println(list.isEmpty());
		
	}

}
