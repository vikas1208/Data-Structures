package bitmanipulation;

public class CalculatingPower {
	static int ans=1;
	static int power(int b, int e)
	{
		for(int i=0;i<e;i++)
		{
			ans=ans*2;
		}
		return ans;
		
	}
	
	
	
	
	public static void main(String []arggs)
	{
		int base=2;
		int exponent=4;
		
	 System.out.println("Result:"+power(2,4));
	}
}
