package revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.crypto.Data;

public class Prac13 {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<count.length;i++)
			System.out.println(count[i]);
		
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else 
				hm.put(ch, 1);
		}
		
				for(Entry<Character,Integer> h:hm.entrySet());
				{
					System.out.println();
				}
					
	}

}
