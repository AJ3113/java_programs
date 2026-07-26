class insertionsort
{
public static void main(String args[])
{
    int arr[]={5,4,3,2,1};
    insertion(arr);
    System.out.println("Sorted array:");
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
static void insertion(int arr[])
{
for(int i=0;i<arr.length-1;i++)
{
    for(int j=i+1;j>0;j--)
    {
        if(arr[j]<arr[j-1])
        {
            swap(arr,j,j-1);
        }
        else{
            break;
        }
    }
}
}
static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}