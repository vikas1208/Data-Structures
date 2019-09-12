package SortingTechniques;

public class InsertionSortStrings {

	public static void main(String[] args) {
		
		String arr[]= {"rupesh","shivam","rahul","ritika","vikas","abhishek"};
		String temp="";
		int j;
		for(int i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
		while(j>0 && arr[j-1].compareTo(temp)>0)
		{
			arr[j]=arr[j-1];
			j=j-1;
		}
			arr[j]=temp;
			
		}
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
	}

}
