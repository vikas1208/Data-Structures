package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumarraysUsing2pointer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		int tc=Integer.parseInt(str1);
		for(int start=0;start<tc;start++)
		{
		String str2[]=br.readLine().split(" ");
		 int n=Integer.parseInt(str2[0]);
		 int k=Integer.parseInt(str2[1]);
		 String str3[]=br.readLine().split(" ");
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=Integer.parseInt(str3[i]);
		 }
		 Arrays.sort(arr);
//		int arr[]= {-7,-3,1,5,8,10,12,15,18};
//		int n=arr.length;
//		int k=24;											//arr[i]+arr[j]=k && i<>j using 2 pointer technique
	boolean status=sumarr(arr,k,0,n-1);
		if(status)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	}
	public static boolean sumarr(int[] arr, int k, int first, int last) {
		
		if(first<last)
		{
		int i=first,j=last;
		if(arr[i]+arr[j]==k)
			return true;
		 if(arr[i]+arr[j]<k)
		 {
			i++;
		return sumarr(arr,k,i,j);
		 }
		else
		{
			j--;
		return sumarr(arr,k,i,j);
		}
	}
return false;
}
}
