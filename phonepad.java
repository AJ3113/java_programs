import java.util.*;
class phonepad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.next();
        pad("",s);
        System.out.println("List: "+padret("",s).size());
        System.out.println("List: "+padcount("",s));
    }
    static void pad(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';//this will convert '2' into 2
    for(int i=(digit-1)*3;i<digit*3;i++)
    {
        char ch=(char)('a'+i);
        pad(p+ch,up.substring(1));
    }
    }
    static ArrayList<String> padret(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';//this will convert '2' into 2
        ArrayList<String> list=new ArrayList<>();
    for(int i=(digit-1)*3;i<digit*3;i++)
    {
        char ch=(char)('a'+i);
        list.addAll(padret(p+ch,up.substring(1)));
    }
    return list; 
    }
    static int padcount(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
    {
        char ch=(char)('a'+i);
        count+=padcount(p+ch,up.substring(1));
    }
        return count;
    }
}