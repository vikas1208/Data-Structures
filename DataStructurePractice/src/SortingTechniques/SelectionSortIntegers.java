package SortingTechniques;

public class SelectionSortIntegers {

	public static void main(String[] args) {
		int arr[]= {38,52,9,18,6,62,13};
		
	int min=0;
	int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			 min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}			
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
