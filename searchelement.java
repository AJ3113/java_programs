import java.util.*;
class searchelement
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
        System.out.println("Enter the target alement: ");
        int target=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("The occurence of the target number: "+findelement(arr,target,0,list));
    }
    
    static ArrayList  findelement(int arr[],int target,int i,ArrayList<Integer> list)
    {
        if(i==arr.length){
         return list;
        }
        if(arr[i]==target)
            list.add(i+1);
        
         return findelement(arr,target,i+1,list);

    }
}