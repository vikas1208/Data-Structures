package revision;

public class Bubblesort {

	public static void main(String[] args) {
		int arr[]= {4,2,1,6,11,7,8,6};
		int len= arr.length;
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
