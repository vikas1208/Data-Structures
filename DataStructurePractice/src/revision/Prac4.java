package revision;

public class Prac4 {

	public static void main(String[] args) {
		int arr[]= {-7,-1,5,10,12,18};
		int len =arr.length;
		int k=30;
		for(int i=0;i<len;i++)
		{
			boolean status= BSR(arr,k-arr[i],i+1,len-1);
			System.out.println(status);
		}

	}

	public static boolean BSR(int[] arr, int k, int first, int last) {
			
		if(first<=last)
		{
			int mid=first+(last-first)/2;
			if(arr[mid]==k)
				return true;
			if(arr[mid]<k)
				return BSR(arr,k,mid+1,last);
						return BSR(arr,k,first,mid-1);
		}
		return false;
	}

}
