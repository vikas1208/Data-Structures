package backtracking;

public class FibonacciSeries {

	public static void main(String[] args) {
		   int number = 5;
	        int sum = fibo(number);
	        System.out.println("fibo = " + sum);

	}

	public static int fibo(int n) {
		//if(n==0||n==1)
		if(n==0)
			return 1;
		
		else
			//return fibo(n-1)+fibo(n-2);
			return n*fibo(n-1);
			
	}

}
