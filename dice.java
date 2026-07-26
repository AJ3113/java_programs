import java.util.*;
class dice
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target: ");
       int target=sc.nextInt();
        dicecheck("",target);
        System.out.println("Answer in list: "+dicecheckret("",target));
    }
    static void dicecheck(String p,int target)
    {
    if(target==0)
    {
        System.out.println(p);
        return;
    }
    for(int i=1;i<=6 && i<=target;i++)
    {
        dicecheck(p+i,target-i);
    }
    }
    static ArrayList<String> dicecheckret(String p,int target)
    {
    if(target==0)
    {
        ArrayList<String>ans=new ArrayList<String>();
        ans.add(p);
        return ans;
    }
    ArrayList<String>list=new ArrayList<>();
    for(int i=1;i<=6 && i<=target;i++)
    {
        list.addAll(dicecheckret(p+i,target-i));
    }
    return list;
    }
}