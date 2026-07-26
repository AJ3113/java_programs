import java.util.*;
class arraysorted
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
        if(isarraysorted(arr,0)){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
    }
    }
    static boolean isarraysorted(int arr[],int i)
    {
        if(i==arr.length-1)
            return true;
        else
        return arr[i]<arr[i+1] && isarraysorted(arr,i+1);
    }
}