package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseSentence {

	public static void main(String[] args) throws IOException {
		Stack<String> st = new Stack<String>();
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String str1=br.readLine();
		  int tc=Integer.parseInt(str1);
		  for(int i=0;i<tc;i++)
		  {
			  String  str2[]=br.readLine().split(" ");
			  for(int j=0;j<str2.length;j++) 
			  	{ 
				  st.push(str2[j]);
				}
		  
		  while(!st.isEmpty()) 
		  {
			  System.out.print(st.peek()+" "); 
			  st.pop();
		    }
		  	 System.out.println(); 
		  }
		 
		/*
		 * String str="hello world"; String str1[]=str.split(" "); for(int
		 * i=0;i<str1.length;i++) { st.push(str1[i]); } while(!st.isEmpty()) {
		 * System.out.print(st.peek()+" "); st.pop();
		 * 
		 * } System.out.println();
		 * 
		 */
	}

}
