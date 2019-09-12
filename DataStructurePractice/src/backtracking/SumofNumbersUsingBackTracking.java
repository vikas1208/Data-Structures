package backtracking;

public class SumofNumbersUsingBackTracking {

	public static void main(String[] args) {
	//int arr[]= {8,2,-3,7,15,-5};
		int arr[]= {8,1,3};
	int n=arr.length;
	//int k=20;
	int k=4;
	boolean sum=find(arr,n,k,0,0);
	System.out.println(sum);

	}

	public static boolean find(int[] arr, int n, int k, int s, int idx) {
		if(idx==n) {
			return s==k;
		}
		
		return find(arr,n,k,s+arr[idx],idx+1)|| find(arr,n,k,s,idx+1);
	//	return find(arr,n,k,s+arr[idx],idx+1);
	}

	
}
