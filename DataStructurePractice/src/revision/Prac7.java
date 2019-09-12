package revision;

public class Prac7 {

	public static void main(String[] args) {
		char arr[]= {'a','e','i','z','x','a','b','e','d','t'};
		int arr1[]= {5,1,8,1,5,5,3,15,5,5,20,18,5,8,10,10,10};
		int count[]= new int[26];
		for(int i=0;i<arr1.length;i++)
		{
			count[arr1[i]-1]++;
		}
		for(int i=0;i<count.length;i++)
		{
			System.out.println(count[i]);
		}

	}

}
