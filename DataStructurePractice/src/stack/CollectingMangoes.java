package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CollectingMangoes {

	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int tc=Integer.parseInt(str);
	
	for(int i=0;i<tc;i++)
		{
			Stack<Integer> st = new Stack<Integer>();
			Stack<Integer> st1= new Stack<Integer>();
			System.out.println("Case "+(i+1)+":");
			String str2=br.readLine();
			int N=Integer.parseInt(str2);
			for(int j=0;j<N;j++)
			{
				String str3[]=br.readLine().split(" ");
				String a1="A";
				String a2="R";
				String a3="Q";
				if(a1.equals(str3[0]))
				{
					int data=Integer.parseInt(str3[1]);
					st.push(data);
					if(st1.isEmpty()||data>st1.peek())
					{
						st1.push(data);
					}
					else if(data==st1.peek())
					{
						st1.push(data);
					}
				}
				else if(a2.equals(str3[0]))
				{  
					if(st.isEmpty() || st1.isEmpty())
					{
						continue;
					}
					else
					{
						if(st.peek()>=st1.peek())
						{
							st.pop();
							st1.pop();
						}
						
						else
						{
							st.pop();
						}
					}
				}
				else
				{
					if (!st1.isEmpty())
					{
						int result=st1.peek();
						System.out.println(result);
					}
					else
						System.out.println("Empty");
				}
			}
		
		}
	}

}
