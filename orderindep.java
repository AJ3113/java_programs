//order independent binary search
import java.util.*;
public class orderindep{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int ans=Binarysearch(arr,target);
        if(ans==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ans);
        }
    }
    static int Binarysearch(int arr[],int target)
    {
     int start=0;
     int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(arr[start]<arr[end])//check if array is ascending or not
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<arr[mid])
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}