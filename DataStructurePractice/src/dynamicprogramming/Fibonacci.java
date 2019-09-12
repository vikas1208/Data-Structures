package dynamicprogramming;

public class Fibonacci {

	public static int fibo1(int n) {
		if(n==1 || n==2)
		return 1;
		return fibo1(n-1)+fibo1(n-2);
	}
	
	public static int fibo2(int n) {
		int arr[]= new int[n+1];
		arr[1]=arr[2]=1;
		for(int i=3;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	
	public static int fibo3(int n) {
		int a =1;
		int b=1;
		int c=0;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

	
	public static void main(String[] args) {
	int n=7;
	System.out.println(fibo1(n));//recursion
	System.out.println(fibo2(n));// dynamic programming
	System.out.println(fibo3(n));//dynamic programming-space optimization
	}

	


	

}
