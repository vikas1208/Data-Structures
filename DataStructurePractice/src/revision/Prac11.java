package revision;

import java.util.Arrays;

public class Prac11 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8,9,12};
		int len=arr.length;
		Arrays.sort(arr);
		int count=1;
		int final_count=0;
		for(int i=1;i<len;i++)
		{
			if(arr[i]-arr[i-1]==1 || arr[i]-arr[i-1]==0)
			{
				count++;
			}
			else
			{
				count=1;
				continue;
				
			}
			if(count>final_count)
			{
				final_count=count;
			}	
		}
		System.out.println("The maximum subarray length is "+final_count);

	}

}
