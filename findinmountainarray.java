class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr[mid]>mountainArr[mid+1])
            {
                //  Check in the left part
                end=mid;
            }
            else
            {
                start=mid+1;
                //check in the right part
            }
        }
        return start;
        //can return either start or end both becomes equal 
    }
    static int Binarysearch(int arr[],int target)
            {
                int start=0;
                int end=arr.length-1;
                boolean isAsc=arr[start]<arr[end];
                while(start<=end)
                {
                    
                    //int mid=(start+end)/2;//Migt happen that start+end exceeds the range
                    int mid= start+(end-start)/2;
                     //better way to find mid
                    if(arr[mid]==target)
                    {
                    return mid;
                    }
                    
                    if(isAsc)
                    {
                        if(target<arr[mid])
                        {
                            end=mid-1;
                        }
                        else if(arr[mid]<target)
                        {
                            start=mid+1;
                        }
                    }
                    else
                    {
                        if(target<arr[mid])
                        {
                            start=mid+1;
                        }
                        else if(arr[mid]<target)
                        {
                            end=mid-1;
                        }
                    }
                    
                }
                return -1;
            }
            int search(int arr[],int target)
            {
                int peak=peakIndexInMountainArray(arr);
                int firsttry=binarysearch(arr,target,0,peak);
                if(firsttry!=-1)
                return firsttry;
                else
               return binarysearch(arr,target,peak+1,arr.length-1);
            }
}