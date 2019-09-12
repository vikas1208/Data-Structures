package dynamicprogramming;

import java.io.*;

public class ArrangingDominos {
	
	public static long[] dp = new long[1000001];
	public static void dominos() {
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		dp[4]=5;
		long res=1000000007;
		for(int i=5;i<=1000000;i++)
		{
			dp[i]=(dp[i-1]+dp[i-2]+(dp[i-5]*8))%res;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		int tc=Integer.parseInt(str1);
		dominos();
		for(int j=0;j<tc;j++)	
		{
			String str2=br.readLine();
			int n=Integer.parseInt(str2);
			System.out.println(dp[n]);
		}
	//	int n=120;
		

	}

	

}
