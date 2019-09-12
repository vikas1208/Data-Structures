package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackImplementSI {
	int top=-1;
	int capacity=10005;
	int arr[]= new int[capacity];
	
	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Empty");
		}
		else {
		System.out.println(arr[top]);
		top--;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		StackImplementSI st= new StackImplementSI();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		int tc=Integer.parseInt(str1);
		for(int i=0;i<tc;i++)
		{
				String str2[]=br.readLine().split(" ");
				String operation=str2[0];
				String operation1="push";
				if(operation1.equals(operation))
					{
						int data=Integer.parseInt(str2[1]);
						st.push(data);			
					}
				else
				{
					st.pop();	
				}
		}

	}

}
