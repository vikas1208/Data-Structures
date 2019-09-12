package SortingTechniques;

public class SelectionSortStrings {

	public static void main(String[] args) {
		String str[]= {"rupesh","shivam","rahul","ritika","vikas","abhishek"};
		String temp="";
		int min=0;
		for(int i=0;i<str.length;i++)
		{
			min=i;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[min].compareTo(str[j])>0)
				{
					min=j;
				}
			}
			
			temp=str[i];
			str[i]=str[min];
			str[min]=temp;
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		
		
		
		
	}

}
