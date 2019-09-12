package dynamicprogramming;

public class MinimumNumberOfCoinsUsingtwod {
	
	public static int minimumcoins(int total, int[] coins) {
		int mat[][]= new int[coins.length+1][total+1];
		
		for(int i=0;i<=coins.length;i++)
		{
			mat[i][0]=0;
		}
		
		  for(int j=0;j<=total;j++) 
		  { 
			  mat[0][j]=0;
			}
		 
		for(int i=1;i<=coins.length;i++)
		{
			for(int j=1;j<=total;j++)
			{
				if(j<coins[i-1])
				{
					mat[i][j]=mat[i-1][j];
				}
				
				else
				{
					mat[i][j]=(int) Math.min(mat[i-1][j]==0 ? 1e6 : mat[i-1][j], 1+mat[i][j-coins[i-1]]);
				}
			}
		}
		return mat[coins.length][total];
		
	}

	public static void main(String[] args) {
	int total=11;
	int coins[]= {9,6,5,1};
	System.out.println(minimumcoins(total,coins));

	}



}
