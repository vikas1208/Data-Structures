package dynamicprogramming;

public class KnapsackwithRepetition {
	

	public static int knapsackunlimited(int[] weight, int[] value, int w) {
		int dp[]=new int[w+1];
		for(int i=0;i<value.length;i++)
		{
			for(int j=0;j<=w;j++)
			{
				if(j>=weight[i]) {
					dp[j]=Math.max(dp[j], value[i]+dp[j-weight[i]]);
				}
			}
		}
		return dp[w];
		
	}

	public static void main(String[] args) {
		int weight[]= {5,10,15};
		int value[]= {10,30,20};
		int W=100;
		System.out.println(knapsackunlimited(weight,value,W));

	}
}
