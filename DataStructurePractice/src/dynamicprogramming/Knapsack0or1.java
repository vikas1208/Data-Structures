package dynamicprogramming;

public class Knapsack0or1 {
	
public static int knapsackfunc(int[] value, int[] weight, int W) {
		int K[][]=new int[value.length+1][W+1];
		for(int i=0;i<=value.length;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0||j==0)
				{
					K[i][j]=0;
					continue;
				}
				if(j-weight[i-1]>=0)
				{
				
					K[i][j]=Math.max(K[i-1][j], value[i-1]+K[i-1][j-weight[i-1]]);
				}
				else {
					K[i][j]=K[i-1][j];
				}
			}
		}
		return K[value.length][W];
		
	}

	public static void main(String[] args) {
		int weight[]= {1,3,4,5};
		int value[]= {1,4,5,7};
		System.out.println(knapsackfunc(value,weight,7));

	}

	

}
