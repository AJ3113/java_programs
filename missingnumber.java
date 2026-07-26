class Missingnumber
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        Missingnumber obj = new Missingnumber();
        int missing = obj.missingnumber(arr);
        System.out.println("The missing number is: " + missing);
        
    }
    public int missingnumber(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index)
            {
                return index;
            }
            else{
                return arr.length;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int f,int s)
    {
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}