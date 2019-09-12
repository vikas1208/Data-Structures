package revision;

import java.util.HashMap;

public class Prac9 {
	
	class Pair{
		int first,second;
		 public Pair(int first,int second)
		 {
			 this.first=first;
			 this.second=second;
		 }
	}
	
	
	public static boolean sumcheck(int[] arr, int len,Prac9 a) {
		HashMap<Integer,Pair> hm = new HashMap<Integer,Pair>();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				int sum=arr[i]+arr[j];
				if(!hm.containsKey(sum)) {
					hm.put(sum, a.new Pair(arr[i],arr[j]));
				}
				
				else {
					Pair p=hm.get(sum);
						System.out.println(p.first+" + "+p.second+"-->"+arr[i]+" + "+arr[j]);
						return true;
				}
			}
		}
		return false;
		
	}


	public static void main(String[] args) {
		Prac9 a = new Prac9();
		int arr[]= {3,4,7,1,2,9,8};
		int len=arr.length;
		sumcheck(arr,len,a);

	}

	
}
