package revision;

public class Prac2 {

	public static void main(String[] args) {
		int arr[]= {-7,-3,1,5,8,10,12,15,18};
		int len = arr.length;
		int i=0;
		int j=len-1;
		int k=123;
		while(i<=j)
		{
			if(arr[i]+arr[j]==k) {
				System.out.println("The sum exist");
				break;
				
			}
			else if(arr[i]+arr[j]<k)
			{
				i++;
			}
			else {
				j--;
			}
		}

	}

}
