import java.util.*;
class subsequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("enter the string: ");
        s=sc.nextLine();
        System.out.println(sub("",s));
        
    }
    static ArrayList<String >sub(String p,String s)
    {
        if(s.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=s.charAt(0);
            ArrayList<String> left=sub(p,s.substring(1));
            ArrayList<String> right=sub(p+ch,s.substring(1));
            left.addAll(right);
            return left;
    }
     static void  subseq(String p,String s)
    {
        if(s.isEmpty())
        {
           System.out.println(p);
           return;
        }
        char ch=s.charAt(0);
             subseq(p,s.substring(1));
            subseq(p+ch,s.substring(1));
}
}
