package revision;

public class SelectionSortIntegers {

	public static void main(String[] args) {
		int arr[]= {38,52,9,18,6,62,13};
		int len = arr.length;
		int min=0;
		int temp=0;
		for(int i=0;i<len;i++)
		{	
			min=i;
			for(int j=i+1;j<len;j++) 
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;	
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
