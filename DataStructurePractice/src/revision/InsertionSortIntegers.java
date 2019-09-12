package revision;

public class InsertionSortIntegers {

	public static void main(String[] args) {
		int arr[]= {38,52,9,18,6,62,13};
		int len = arr.length;
		int temp=0;
		for(int i=1;i<len;i++)
		{
			int j=i;
			while(j>=1 && arr[j]<arr[j-1])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+ " ");
		}

	}

}
