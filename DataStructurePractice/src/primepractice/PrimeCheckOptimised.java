package primepractice;

public class PrimeCheckOptimised {

	public static void main(String[] args) {
		int n=100;
		System.out.println(countprime(n));

	}

	public static int countprime(int n) {
	boolean p[]=new boolean[n+1];
	
	for(int i=0;i<=n;i++)
	{
		p[i]=true;
	}
	int count=0;
	for(int i=2;i<=n;i++)
	{
		if(p[i]==true)
		{ 
			count++;
			for(int j=2*i;j<=n;j=j+i)
			{
				p[j]=false;
			}
		}
	}
	
	
	for(int i=2;i<=n;i++)
	{
		if(p[i]==true)
			System.out.print(i+" ");
	}
	
		return count;
		
		
	}

	

}

