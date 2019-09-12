package practice;

public class FindingFrequencyUsing2BinarySearch {

	public static void main(String[] args) {
		int arr[]= {5,1,8,1,5,5,3,15,5,5,20,18,5,8,10,10,10};
		int n= arr.length;
		merge(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int p1=BS1(arr,5,n);
		System.out.println(p1);
		int p2=BS2(arr,5,n);
		System.out.println(p2);
		int frequency=p2-p1+1;
		System.out.println(frequency);
	}

	public static int BS1(int[] arr, int k, int n) {
		int ans=0;
		int first=0,last=n-1;
		while(first<=last)
		{
			int mid=first+(last-first)/2;
			if(arr[mid]==k)
		{
			 ans=mid;
			last=mid-1;	
		}
		 if(arr[mid]<k)
			first=mid+1;
		else
			last=mid-1;
	}
		return ans;
	}
	
	public static int BS2(int[] arr, int k, int n) {
		int ans=0;
		int first=0,last=n-1;
		while(first<=last)
		{
			int mid=first+(last-first)/2;
			if(arr[mid]==k)
			{
				ans=mid;
				first=mid+1;
			}
			if(arr[mid]>k)
			{
				last=mid-1;
			}
			else
			{
				first=mid+1;
			}
			
		}
		return ans;
	}

	public static void merge(int[] arr, int first, int last) {
		if(first==last)
			return;
		int mid=first+(last-first)/2;
		merge(arr,first,mid);
		merge(arr,mid+1,last);
		mergearrays(arr,first,mid,last);
		
	}

	public static void mergearrays(int[] arr, int first, int mid, int last) {
		int temp[]=new int[last-first+1];
		int i=first,j=mid+1,k=0;
		
		while(i<=mid && j<=last)
		{
			if(arr[i]<arr[j])
			{
				temp[k++]=arr[i++];
			}
			else
			{
				temp[k++]=arr[j++];
			}
		}
		
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		
		while(j<=last)
		{
			temp[k++]=arr[j++];
		}
		
		for(int x=0;x<k;x++)
		{
			arr[first+x]=temp[x];
		}
	}

}
