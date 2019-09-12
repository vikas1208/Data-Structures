package binarysearch;

public class BinarySearchIterative {

	public static void main(String[] args) {
		int arr[]= {-7,-1,2,3,6,8,10};
		int n=arr.length;
		int k=-70;
		System.out.println(bin_search(arr,n,k));
	
	}

	public static boolean bin_search(int[] arr, int n, int k) {
		int first=0,last=n-1,mid;
		while(first<=last)
		{
		mid=first+(last-first)/2;
		if(arr[mid]==k)
			return true;
		if(arr[mid]<k)
			first=mid+1;
		else
			last=mid-1;
	
		}
		return false;
	}

}
