package dynamicprogramming;

public class StairCase {

	public static int stair(int n) {
		int arr[]=new int[n+1];
		arr[0]=1;
		arr[1]=1;
	//	arr[2]=2;
		for(int i=2;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr[n];
	}
	
	public static int stair1(int n) {
		int a=1;
		int b=1;
		int c=0;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int n=10;
		System.out.println(stair(n));  // dynamic programming
		System.out.println(stair1(n)); // dynamic programming space optimised

	}

	



}
