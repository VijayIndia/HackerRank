import java.util.*;

public class Solution 
{
    public boolean input()
        {
            Scanner S=new Scanner(System.in);
            ArrayList<Character> m=new ArrayList<Character>();
            String str=S.nextLine();
            int strlength=str.length();
            char ch[]=str.toCharArray();
        for(int i=0;i<strlength;i++)
            {
                if(m.contains(ch[i]))
                    m.remove(m.indexOf(ch[i]));
                else
                    m.add(ch[i]);
            }
            if(m.size()<=1)
                return true;
           return false;             
        }
    public static void main(String[] args) 
    {
        boolean result=false;
        Solution obj=new Solution();
        result=obj.input();
        if(result)
           System.out.println("YES");
        else
           System.out.println("NO");
    }
}
