package revision;

import java.util.HashSet;

public class Prac8 {

	public static void main(String[] args) {
		int arr1[]= {10,5,3,4,6};
		int arr2[]= {8,7,9,3};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
		}
		
		boolean status=disjoint(hs,arr2);
		if(status)
			System.out.println("The two sets are disjoint");
		else
			System.out.println("The two sets are not-disjoint");
	}

	public static boolean disjoint(HashSet<Integer> hs, int[] arr2) {
		for(int i=0;i<arr2.length;i++)
		{
			if(hs.contains(arr2[i]))
				
			{
				return false;
			}
			
		}
		return true;
		
	}

}
