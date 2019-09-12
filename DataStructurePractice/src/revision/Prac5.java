package revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Prac5 {

	public static void main(String[] args) {
		int arr[]= {5,1,8,1,5,5,3,15,5,5,20,18,5,8,10,10,10};
		int len=arr.length;
		Arrays.sort(arr);
		int v=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++)
		{
		//	int a=arr[i];
			
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
		
		for(Entry<Integer, Integer> h:hm.entrySet())
		{
				System.out.println(h.getKey()+"-->"+h.getValue());		
		}

	}

}
