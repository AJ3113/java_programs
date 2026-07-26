import java.util.*;
 public class arraylengthindep{
    public static void main(String[] args) 
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
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        System.out.println("Answer:"+ans(arr,target));
           
    }
    static int ans(int []arr,int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return Binarysearch(arr,target,start,end);
    }
      static int Binarysearch(int arr[],int target,int start,int end)
            {
                while(start<=end)
                {
                    //int mid=(start+end)/2;//Migt happen that start+end exceeds the range
                    int mid= start+(end-start)/2;//better way to find mid
                    if(target<arr[mid])
                    {
                        end=mid-1;
                    }
                    else if(arr[mid]<target)
                    {
                        start=mid+1;
                    }
                    else{
                        return mid;
                    }
                }
                return -1;

            }
}