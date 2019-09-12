package practice;

public class Binary {

	public static void main(String[] args) {
		int arr[]= {-7,-1,2,3,6,8,10};
		int n=arr.length;
		int k=1;
		System.out.println(binary_search(arr,k,0,n-1));
	}

	public static boolean binary_search(int[] arr,int k,int first,int last)
	{
		
	if(first<=last)
	{
	int	mid=first+(last-first)/2;
	if(arr[mid]==k)
		return true;
		if(arr[mid]<=k)
		
			return binary_search(arr,k,mid+1,last);
		return 	binary_search(arr,k,first,mid-1);		
	
	}
	return false;
	}
}
