package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ChangingDirectories {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		int tc=Integer.parseInt(str1);
		for(int i=0;i<tc;i++)
		{	
			Stack<String> st = new Stack<String>();
			String str2=br.readLine();
			int N=Integer.parseInt(str2);
			String str3[]=br.readLine().split(" ");
			String operation="cd";
			if(operation.equals(str3[0]))
			{
				String str4[]=str3[1].split("/");
			}
			
			
			
			
		}
		
		

	}

}
