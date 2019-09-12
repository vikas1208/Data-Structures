package binarysearch;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int arr[]= {-7,-5,-1,3,5,8,10,12,18};
		int n=arr.length;
		int k=-7;
	System.out.println(binarysearchrecur(arr,k,0,n-1));
		
	}

	public static boolean binarysearchrecur(int[] arr, int k, int first, int last) {
		
		if(first<=last)
		{
		int mid=first+(last-first)/2;
		if(arr[mid]==k)
			return true;
		
		if(arr[mid]<k)
			return binarysearchrecur(arr,k,mid+1,last);
		return binarysearchrecur(arr,k,first,mid-1);
	}
		return false;

  }
 }
 

