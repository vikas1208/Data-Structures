package SortingTechniques;

public class BubbleSortIntegers {

	public static void main(String[] args) {
	int arr1[]= {36,19,12,99,5};
	int temp=0;
	for(int i=0;i<arr1.length;i++)
	{
		int flag=0;
		for(int j=0;j<arr1.length-1-i;j++)
		{
			if(arr1[j]>arr1[j+1])
			{
				temp=arr1[j];
				arr1[j]=arr1[j+1];
				arr1[j+1]=temp;
				flag=1;	
			}
		}
		if(flag==0)
		{
			break;
		}
	}
		
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	}

}
