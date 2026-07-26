import java.util.*;
public class selectionsort
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    selectsort(a);
    System.out.println("Sorted array:");
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
}
 static void selectsort(int a[])
    {
      for(int i=0;i<a.length;i++)
      {
        int last=a.length-i-1;
        int maxindex=maximum(a,0,last);
        swap(a,maxindex,last);
      }  
    }
    static int maximum(int a[],int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(a[max]<a[i])
            {
                max=i;
            }
        }
        return max;
    }
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}