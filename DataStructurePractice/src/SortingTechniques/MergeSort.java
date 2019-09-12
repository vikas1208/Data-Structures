package SortingTechniques;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {4,2,1,6,11,7,8};
		int n=arr.length;
		merge_sort(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void merge_sort(int[] arr, int first, int last) {
		if(first==last)
			return;
		int mid =first+(last-first)/2;
		merge_sort(arr,first,mid);
		merge_sort(arr,mid+1,last);
		merge(arr,first,mid,last);
		
	}

	public static void merge(int[] arr, int first, int mid, int last) {
		int temp[]=new int[last-first+1];
		int i=first,j=mid+1,k=0;
		while(i<=mid && j<=last)
		{
			if(arr[i]<=arr[j])
			
				temp[k++]=arr[i++];
			else
			
				temp[k++]=arr[j++];
		}
			while(i<=mid)
			
				temp[k++]=arr[i++];
			
			while(j<=last)
			
				temp[k++]=arr[j++];
			
			for(int x=0;x<k;x++)
			{
				arr[first+x]=temp[x];
			}
			
		
		
	}

}
