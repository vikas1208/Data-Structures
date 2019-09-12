package practice;

public class SmallerElements {
    
	public static int finalAns=0;
    public static void main(String[] args) {
         int acount=0;
    int arr[]={5,10,3,8,12,15,1,7,18};
    int n= arr.length;
    finalAns=0;
    merge_sort(arr,0,n-1,acount);
    System.out.println(finalAns);
    for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge_sort(int[] arr, int first, int last,int count) {
        if(first==last)
            return;
        int mid=first+(last-first)/2;
        merge_sort(arr,first,mid,count);
        merge_sort(arr,mid+1,last,count);
        merge(arr,first,mid,last,count);
        
    }

    public static void merge(int[] arr, int first, int mid, int last,int count) {
        int temp[]=new int[last-first+1];
        int i=first,j=mid+1,k=0;
    
        while(i<=mid && j<=last)
        {
            if(arr[i]<arr[j])
            {
                temp[k++]=arr[i++];
        
            }
            else if(arr[i]==arr[j])
            {
                temp[k++]=arr[j++];
                i++;
                count=count+mid-i+1;
            }
            else
            {
                temp[k++]=arr[j++];
                count=count+mid-i+1;
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        //    count++;
        }
        while(j<=last)
        {
            temp[k++]=arr[j++];
        }
        for(int x=0;x<k;x++)
        {
            arr[first+x]=temp[x];
        }
        finalAns +=count;
       // System.out.println(count);
        
    }
    
}

