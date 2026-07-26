import java.util.*;
public class sortedmatrixsearch{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the rows and columns:");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int [m][n];
        System.out.println("Enter the elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        System.out.println("Element found at:"+Arrays.toString(search(a,target)));
        
        }
        static int[] binarysearch(int a[][],int row,int start,int end,int target)
        {
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(a[row][mid]==target)
                {
                    return new int[]{row,mid};
                }
                else if(a[row][mid]>target)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
             }
             return new int[]{-1,-1};
            }
        static int[] search(int a[][],int target)
        {
            int row=a.length; 
            int col=a[0].length;
            if(row==1)
            {
                return binarysearch(a,0,0,col-1,target);
            }
            //run the loop till two rows are remaining
            int rowstart=0;
            int rowend=row-1;
            int colmid=col/2;
            while(rowstart<rowend-1)
            {
                int mid=rowstart+(rowend-rowstart)/2;
                if(a[mid][colmid]==target)
                {
                    return new int[]{mid,colmid};
                }
                else if(a[mid][colmid]<target)
                {
                    rowstart=mid+1;
                }
                else{
                    rowend=mid-1;
                }
            }
            //now we have two rows
            //check whether the target is in the col of the 2 rows
            if(a[rowstart][colmid]==target)
            return new int[]{rowstart,colmid};
            if(a[rowstart+1][colmid]==target)
            return new int[]{rowstart+1,colmid};
            //search in 1st half
            //2nd,3rd half,4th half
            if(target<a[rowstart][colmid])
            {
                return binarysearch(a,rowstart,0,colmid-1,target);
            }
            //search in 2nd half
            if(colmid+1<col &&target>=a[rowstart][colmid+1]&&target<=a[rowstart][col-1])
            {
                return binarysearch(a,rowstart,colmid+1,col-1,target);
            }
            if(target<=a[rowstart+1][colmid])
            {
                return binarysearch(a,rowstart+1,0,colmid-1,target);
            }
            else{
                return binarysearch(a,rowstart+1,colmid+1,col-1,target);
            }

        }
        }