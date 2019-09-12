package dynamicprogramming;

public class MaxSumSubarrays {

	
    public static void main(String args[]) 
    { 
       int arr[]= {-2,-3,4,-1,-2,1,5,-3}; 
       int ps[]= new int[arr.length];
       int a=0;
       for(int i=0;i<arr.length;i++)
       {
    	   a=a+arr[i];
    	   ps[i]=a;
       }
     int maxsum=arr[0];
       for(int i=0;i<ps.length;i++)
    	   for(int j=0;j<i;j++)
    	   {
    		   if(ps[i]-ps[j]>maxsum)
    		   {
    			   maxsum=ps[i]-ps[j];
    		   }
    	   }
       System.out.println(maxsum);
    }
	

}
