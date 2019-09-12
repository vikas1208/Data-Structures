package SortingTechniques;

public class MergeSortIntegers {

	public static void main(String[] args) {
	//	int arr[]= {5,10,3,8,12,15,1,7,18,9};
		int arr[]= {4,2,1,6,11,7,8};
		int n=arr.length;
		System.out.println(merge_sort(arr,0,n-1));
		/*
		 * for(int i=0;i<n;i++) { System.out.print(arr[i]+" "); }
		 */
		
	}

	public static int merge_sort(int[] arr, int first, int last) {
		int inv_count = 0;
		if(first<last)
		{	
		int mid=first+(last-first)/2;
		inv_count=merge_sort(arr,first,mid);
		inv_count+=merge_sort(arr,mid+1,last);
		inv_count+=merge(arr,first,mid,last);	
		}
		return inv_count;
	}

	public static int merge(int[] ar, int first, int mid, int last) {
		 
			int temp[]= new int[last-first+1];
			int count=0;
			int i = first, j = mid+1, k = 0;
			while(i <= mid && j <= last){
			if(ar[i] <= ar[j])
			temp[k++] = ar[i++];
			else
			temp[k++] = ar[j++];
			count=count+ar[mid]-1;
			}
			while(i <= mid)
			temp[k++] = ar[i++];
			while(j <= last)
			temp[k++] = ar[j++];
			for(int x = 0; x < k; x++)
			ar[first+x] = temp[x];
			
		return count;

	}

}
