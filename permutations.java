import java.util.*;
class permutations
{
    public static void main(String args[])
    {
        permutationsstr("","abc");
        ArrayList<String> ans=permutationslist("","abc");
       System.out.println(ans);
    }
    static void permutationsstr(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutationsstr(f+ch+s,up.substring(1));

        }
    }
        static ArrayList<String> permutationslist(String p,String up)
       {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           ans.addAll(permutationslist(f+ch+s,up.substring(1)));

        }
        return ans;
    }
} 