package revision;

public class Prac10 {

	public static void main(String[] args) {
		int arr[]= {0,0,0,0,1,0,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0,0};
		int len=arr.length;
		int min=0,act_min=0;
		int max=0,act_max=0;
		int result=0,final_res=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=-1;
			}
		}
		int prefix[]=new int[len];
		prefix[0]=arr[0];
		for(int i=1;i<prefix.length;i++)
		{
			prefix[i]=arr[i]+prefix[i-1];
		}
		
		for(int i=0;i<prefix.length;i++)
		{
			int x=prefix[i];
			min=i;
			for(int j=i+1;j<prefix.length;j++)
			{
				if(prefix[j]==x && j>max)
				{
					max=j;
					result=max-min;
					if(final_res < result)
					{
						final_res=result;
						act_min=min+1;
						act_max=max;
					}
					
				}	
			}
		}
		if(final_res>0)
		System.out.println("The longest subarray is of length "+final_res+ "  and the start "
				+ "index is "+ act_min+" and the end index is "+act_max);
		else
			System.out.println("No subarray exist");
	}

}
