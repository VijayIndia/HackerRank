import java.util.*;

public class MakeAnagrams 
{
    public int input()
        {
        int count=0;
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int alength=a.length(),blength=b.length();
        char achar[]=a.toCharArray();
        char bchar[]=b.toCharArray();
        List<Character> alist=new ArrayList<Character>();
        for(int i=0;i<alength;i++)
               alist.add(achar[i]);
        for(int j=0;j<blength;j++)
            if(alist.contains(bchar[j]))   
               {
                alist.remove(alist.indexOf(bchar[j]));
               }
            else
                count++;
            count+=alist.size();
        return count;
        }
    
    public static void main(String[] args) 
    {
        MakeAnagrams obj=new MakeAnagrams();
        int ans=obj.input();
        System.out.println(ans);
    }
}
