package bitmanipulation;

public class SetBits {

	public static void main(String[] args) {
		int x=3;
		int y=2;
		double sum=0;
		
		 
		  
		
		  for(int i=y;i<x+y;i++) 
		  { 
			//  int var=0; var=1<<i;
		//	  sum=sum+var; 
			  
			  sum=sum+Math.pow(2, i);
		  }
		 
		 
		
//	 sum=(1<<x)-1<<y;
	//	sum=(1<<(x+y))-(1<<y);
	System.out.println(sum);
	}

}
