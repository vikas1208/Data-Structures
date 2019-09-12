package dynamicprogramming;

public class MinimumNumberOfCoins {
	

	public static int minimumnumber(int[] coins, int total) {
		int mat[][]=new int[coins.length][total+1];
		int dp[]= new int[total+1];
		dp[0]=0;
		for(int i=1;i<=total;i++)
		{
			dp[i]=Integer.MAX_VALUE;
		}
		for(int i=1;i<=total;i++)
		{
			for(int j=0;j<coins.length;j++)
			{
				if(coins[j]<=i)
				{
					int sub_result=dp[i-coins[j]];
					if(sub_result!=Integer.MAX_VALUE && sub_result+1<dp[i])
					{
						dp[i]=sub_result+1;
					}
				}
		
			}
		}
		return dp[total];
	}


	public static void main(String[] args) {
		int total=8;
		int coins[]= {3,4,6,7,9};
		System.out.println(minimumnumber(coins,total));

	}

}
