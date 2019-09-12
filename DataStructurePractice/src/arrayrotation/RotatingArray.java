package arrayrotation;

public class RotatingArray {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int n=arr.length;
	int k=15%n;
	rotationarr(arr,k);
	}

	public static void rotationarr(int[] arr, int k) {
		for(int i=0;i<k;i++)
		{
			int temp=arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[0]=temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
