package SortingTechniques;

public class BubbleSortStrings {

	public static void main(String[] args) {
		String str1[]= {"rupesh","shivam","rahul","ritika","vikas","abhishek"};
		String temp="";
		for(int i=0;i<str1.length;i++)
		{
			int flag=0;
			for(int j=0;j<str1.length-1-i;j++)
			{
				if(str1[j].compareTo(str1[j+1])>0)
				{
					temp=str1[j];
					str1[j]=str1[j+1];
					str1[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]+" ");
		}

	}

}
