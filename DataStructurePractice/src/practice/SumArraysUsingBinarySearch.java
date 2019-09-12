package practice;

public class SumArraysUsingBinarySearch {

	public static void main(String[] args) {
		int arr[]= {-7,-1,5,10,12,18};
		int n=arr.length;
		int k=15;													//arr[i]+arr[j]=k using binary search
																	//b=k-arr[i]
		boolean flag = false;
		for(int i=0;i<n;i++)
		{
			boolean status=search(arr,k-arr[i],i+1,n-1);
			
			if(status==true)
			{
				System.out.println("True");
				flag= true;
				break;
			}
			
		}
		if(flag == false)
			System.out.println("False");
	}

	public static boolean search(int[] arr, int k, int first, int last)
	{
	
		if(first<=last)
		{
			int	mid=first+(last-first)/2;
			if(arr[mid]==k)
				return true;
			if(arr[mid]<k)
				return search(arr,k,mid+1,last);
			else
				return search(arr,k,first,mid-1);
		
		}
		return false;
	}

}
