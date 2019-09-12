package revision;

import java.util.HashSet;

public class Prac12 {

	public static void main(String[] args) {
		int arr[]= {1, 9, 3, 10, 4, 20, 2};
		int len = arr.length;
		int ans=0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<len;i++)
		{
			hs.add(arr[i]);
		}
		for(int i=0;i<len;i++)
		{
			if(!hs.contains(arr[i]-1))
			{
				int j=arr[i];
				while(hs.contains(j))
				{
					j++;
				}
				if(ans<j-arr[i]) 
				{
					ans=j-arr[i];
				}
			}
		}
		
		System.out.println("The longest contiguous subsequnce is "+ans);

	}

}
