package revision;

import java.util.Arrays;

public class Prac6 {

	public static void main(String[] args) {
		int arr[]= {5,1,8,1,5,5,3,15,5,5,20,18,5,8,10,10,10};
		int n=arr.length;
		Arrays.sort(arr);
		int k=15;
		int ps1= BSR1(arr,k,0,n-1);
		int ps2= BSR2(arr,k,0,n-1);
		System.out.println(ps2-ps1+1);

	}

	public static int BSR1(int[] arr, int k, int first, int last)
	{
		int ans=0,mid;
		while(first<=last)
		{
			 mid=first+(last-first)/2;
			if(arr[mid]==k)
			{
				ans=mid;
				last=mid-1;
				
			}
			else if(arr[mid]<k)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		return ans;
	}
	
	public static int BSR2(int[] arr, int k, int first, int last)
	{
		int ans=0,mid;
		while(first<=last)
		{
			 mid=first+(last-first)/2;
			if(arr[mid]==k)
			{
				ans=mid;
				first=mid+1;
			}
			else if(arr[mid]<k)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		return ans;
	}

}
