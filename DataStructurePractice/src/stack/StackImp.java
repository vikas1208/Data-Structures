package stack;

public class StackImp {
	
	int top=-1;
	int capacity=5;
	int arr[]= new int[capacity];
	
	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	
	public void show()
	{
		for(int i=0;i<capacity;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void pop()
	{ 
		arr[top]=0;
		top--;	
	}
	
	public void peek()
	{
		System.out.println(arr[top]);
    }
	
	public void size()
	{
		System.out.println("size is:"+(top+1));
	}
	
	public boolean isEmpty()
	{
		if(top<0)
		{
			return true;
		}
		return false;	
	}
	
	
	
	
}
