package stack;

public class ImplementStack {

	int top=-1;
	int capacity=15;
	int arr[]= new int[capacity];
	
	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	
	public void show() 
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void pop()
	{
		top--;
		
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		if(top<0)
			return true;
		return  false;
	}
	
	public static void main(String[] args) {
		ImplementStack st = new ImplementStack();
		st.push(5);
		st.push(-14);
		st.push(1);
		st.push(4);
		st.push(-4);
		st.show();
	int a=	st.peek();
	System.out.println(a);
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st.isEmpty());
		st.show();
		
	}
}
