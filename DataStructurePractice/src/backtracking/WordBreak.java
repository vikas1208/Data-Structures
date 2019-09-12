package backtracking;

import java.util.HashSet;

public class WordBreak {
	
	public static void wordbreak(String str,String result, HashSet<String> hs) {
		if(str.length()==0) {
			System.out.println(result);
			
		}
		for(int i=1;i<=str.length();i++)
		{
			String prefix=str.substring(0, i);
			if(hs.contains(prefix))
			{
				wordbreak(str.substring(i),result+prefix+" ",hs);
			}
		}
	}

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
			hs.add("smart");
			hs.add("art");
			hs.add("int");
			hs.add("inter");
			hs.add("intern");
			hs.add("view");
			hs.add("views");
			hs.add("sm");
			hs.add("s");
			
			String str="smartinterviews";
			
			wordbreak(str,"",hs);

	}



}
