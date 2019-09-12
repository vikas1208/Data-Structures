package revision;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {-1,1,2,4,6,6,7,8,11};
		int len=arr.length;
		int k=4;
		System.out.println(binary_search(arr,k,0,len-1));

	}

	public static boolean binary_search(int[] arr, int k, int first, int last) {
		if(first<=last)
		{
		int mid=first+(last-first)/2;
		if(arr[mid]==k)
			return true;
			if(arr[mid]<k)
				return binary_search(arr,k,mid+1,last);
					return binary_search(arr,k,first,mid-1);
		}
		return false;
	}

}
