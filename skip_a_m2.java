import java.util.*;
class skip_a_m2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("enter the string: ");
        s=sc.nextLine();
        String st=skip(s);
        System.out.println("The new string: "+st);
        
    }
    static String skip(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a')
        {
            return skip(s.substring(1));
        }
        else
        {
           return  ch+skip(s.substring(1));
        }
    }
}
