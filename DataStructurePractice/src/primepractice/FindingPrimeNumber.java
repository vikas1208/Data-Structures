package primepractice;

public class FindingPrimeNumber {

	public static void main(String[] args) {
		int n=23;
		System.out.println(checkPrime(n));

	}

	public  static boolean checkPrime(int n) {
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		
		}
			return true;			
		
	
}
}