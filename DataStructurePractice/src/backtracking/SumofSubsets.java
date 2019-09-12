package backtracking;

public class SumofSubsets {

	public static void main(String[] args) {
		int arr[]= {5,10,-1,6,-2};
		int n=arr.length;
		int k=12;
		System.out.println(subset(arr,n,k));
	}

	 static boolean subset(int[] arr, int n, int k) 
	 {
		 for(int i=0;i<(1<<n);i++)
		 {
			 int sum=0;
			 for(int j=0;j<n;j++)
			 {
				 
				 if((arr[j]|(1<<j))==1)
				 {
					 sum=sum+arr[j];
				 }
				
			 }
			 if(sum==k)
				 return true;
		 }
		return false;
	}

}
