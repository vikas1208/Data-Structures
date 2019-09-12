package bitmanipulation;

public class CheckBits {

	public static void main(String[] args) {
		int N=23;
		int y=1;
		int count=0;
		
		/*
		 * for(int i=0;i<32;i++) { if((N>>i)%2==1) { count++; } }
		 */
		while(N!=0)
		{
			N=N*N-1;
			count++;
			N--;
		}
	
		System.out.println(count);
		}
		

	}


