package revision;

public class InsertionSort {

	public static void main(String[] args) {
	int arr[]= {1,4,2,6,11,7,8,6,-1};
	int len=arr.length;
	int j=0;
	int temp=0;
		for(int i=1;i<len;i++)
			{
				j=i;
				while(j>=1 && arr[j]<arr[j-1])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					j=j-1;
				}
			}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
