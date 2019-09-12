package revision;

public class Prac3 {

	public static void main(String[] args) {
		int arr[]= {0,0,1,0,1,1,0,0,1,1};
		int len=arr.length;
		int i=0;
		int j=len-1;
		int temp=0;
		while(i<=j)
		{
			if(arr[i]==0)
			{
				i++;
			}
			else if(arr[j]==1)
			{
				j--;
			}
			else
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}

}
