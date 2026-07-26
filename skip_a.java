import java.util.*;
class skip_a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("enter the string: ");
        s=sc.nextLine();
        skip("",s);
        
    }
    static void skip(String p,String s)
    {
        if(s.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        if(ch=='a')
        {
            skip(p,s.substring(1));
        }
        else
        {
            skip(p+ch,s.substring(1));
        }
    }
}
