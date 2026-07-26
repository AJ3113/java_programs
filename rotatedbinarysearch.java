
import java.util.*;
class rotatedbinarysearch
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[];
        arr=new int[n];
         System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target=sc.nextInt();
        int index=search(arr,target,0,arr.length-1);
        if(index==-1)
        System.out.println("Element not present");
        else
        System.out.println("Element present at index: "+index);
    }
static int search(int arr[],int target,int s,int e)
{
    if(s>e)
    {
        return -1;
    }
    int m=s+(e-s)/2;
    if(arr[m]==target)
    {
        return m;
    }
    if(arr[s]<=arr[m])
    {
        if(target>=arr[s] && target<=arr[m])
    {
        return search(arr,target,s,m-1);
    }
    else
    {
        return search(arr,target,m+1,e);
    }
    }
    if(target>=arr[m]&& target<=arr[e])
    {
        return search(arr,target,m+1,e);
    }
    return search(arr,target,s,m-1);
}
}