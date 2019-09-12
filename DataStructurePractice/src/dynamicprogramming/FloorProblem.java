package dynamicprogramming;

public class FloorProblem {

	public static int floor1(int n) {
	
		int arr[]=new int[n+1];
		arr[0]=arr[1]=arr[2]=arr[3]=arr[4]=1;
		for(int i=5;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-5];
		}
		return arr[n];
	}
	public static int floor2(int n) {
		
		int a=1,b=1,c=1,d=1,e=1;
		int res=0;
		for(int i=5;i<=n;i++)
		{
			res=a+e;
			a=b;
			b=c;
			c=d;
			d=e;
			e=res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int n=8;
		System.out.println(floor1(n));
		System.out.println(floor2(n));//space optimised

	}



}
