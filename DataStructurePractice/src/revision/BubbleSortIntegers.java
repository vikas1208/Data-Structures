package revision;

public class BubbleSortIntegers {

	public static void main(String[] args) {
	int arr[]= {36,19,12,99,5};
	int len = arr.length;
	int temp=0;
	for(int i=0;i<len;i++)
	{
		for(int j=1;j<len;j++)
		{
			if(arr[j]<arr[j-1])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
