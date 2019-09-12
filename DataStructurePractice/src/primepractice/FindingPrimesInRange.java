package primepractice;

import java.util.ArrayList;

public class FindingPrimesInRange {

	public static void main(String[] args) {
		int low=1;
		int high=10;
	int ans=	primeRange(low,high);
	if(low==1)
	{
		System.out.println(ans-1);
	}
	else
	{
		System.out.println(ans);
	}
	}

	public static int primeRange(int low, int high) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		boolean p[]=new boolean[high+1];
	
		for(int i=2;i<=high;i++)
			p[i]=true;
		for(int i=2;i*i<=high;i++)
		{
			if(p[i])
			for(int j=i*i;j<=high;j+=i)
				p[j]=false;
		}
		for(int i=2;i<=high;i++)
		{
			if(p[i]==true)
				al.add(i);
		}
		int count=0;
		/*
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); count++; }
		 */
		
		boolean arr[]=new boolean[high-low+1];
		for(int i=0;i<high-low+1;i++)
			arr[i]=true;
		for(int i=0;i<al.size();i++)
		{
			for(int j=al.get(i)*al.get(i);j<=high;j+=al.get(i))
			{
				if(j<low)
					continue;
				else
					arr[j-low]=false;
			}
		}
			for(int i=0;i<high-low+1;i++)
			{
				if(arr[i]==true)
				{
					//System.out.println(i+low);
				count++;
				}
			}
		return count;
	}

}
