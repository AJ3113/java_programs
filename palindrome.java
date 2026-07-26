
import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int n,rev=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int num=n;
        while(num>0)
        {
           rev=rev*10+num%10;
           num/=10; 
        }
        if(rev==n)
        System.out.println("Palindrome");
        else
        System.out.println("Not a palindrome");
    } 
}