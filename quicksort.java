
import java.util.*;
class quicksort
{
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        System.out.println("Array after sorting: "+Arrays.toString(arr));
    }
    static int  partition(int arr[],int low,int high)
        {
            int start=low;
            int end=high;
            int pivot=arr[low];
            while(start<=end){
            if(arr[start]<=pivot)
            {
                start++;
            }
            if(arr[end]>pivot)
            {
                end--;
            }
            if(start<=end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            }
            int temp=arr[low];
            arr[low]=arr[end];
            arr[end]=temp;
            return end;

        }
         static void quicksort(int arr[],int low,int high)
        {
            if(low<high)
            {
                int pivot=partition(arr,low,high);
                quicksort(arr,low,pivot-1);
                quicksort(arr,pivot+1,high);
            }
        }
}