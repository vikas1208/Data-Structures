package primepractice;

public class FindingNumberOfPrimesOptimised {

	public static void main(String[] args) {
	int n=49;
    System.out.println(findPrimes(n));
	}

	public static int findPrimes(int n) {
		
		boolean p[]=new boolean[n+1];
		for(int j=2;j<=n;j++)
			p[j]=true;
		
		for(int i=2;i*i<=n;i++)
		{
			for(int j=i*i;j<=n;j=j+i)
				p[j]=false;
		}
		int count=0;
		for(int i=2;i<=n;i++)
			if(p[i])
				count++;
		return count;
	}

}
