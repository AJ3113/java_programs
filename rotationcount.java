public class rotationcount
{
public static void main(String[] args) {
    {
        int[] arr={0,1,2,3,4,5,6};
        System.out.println(countrotation(arr));
    }
}
static int countrotation(int num[])
{
int pivot=findpivot(num);
    return pivot+1;

}
 static int findpivot(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            //if elements in the mid,start and end are same
            if(arr[mid]==arr[start]&& arr[mid]==arr[end])
            {
                //skip the duplicates
                if(start<end &&arr[start]>arr[start+1])
                //check if start is pivot
                    return start;
                start++;
                if(end<start && arr[end]<arr[end-1])
                //check for end as well
                    return end-1;
                end--;
            }
            //left is sorted so pivot should be in right
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end]))
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
