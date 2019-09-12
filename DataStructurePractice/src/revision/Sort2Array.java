package revision;

public class Sort2Array {

	public static void main(String[] args) {
		int arr1[]= {-1,3,10,12,15,18,20};
		int len1=arr1.length;
		int arr2[]= {-5,-2,12,25,30};
		int len2=arr2.length;
		int arr3[]= new int[len1+len2];
		int i=0;
		int j=0;
		int k=0;
		while(i<len1 && j<len2)
		{
			if(arr1[i]>arr2[j])
			{
				arr3[k++]= arr2[j++];
			}
			
			else
			{
				arr3[k++]=arr1[i++];
			}
		}
		
		while(i<len1)
		{
			arr3[k++]=arr1[i++];
		}
		
		while(j<len2)
		{
			arr3[k++]= arr2[j++];
		}

				for(int x=0;x<arr3.length;x++)
				{
					System.out.print(arr3[x]+" ");
				}
	}

}
