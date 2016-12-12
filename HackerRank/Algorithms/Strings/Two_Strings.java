import java.util.*;

public class Solution 
{

    public boolean operation(String one,String two)
        {
        int twolength=two.length();
        int onelength=one.length();
        char ch[]=one.toCharArray();
        Set<Character> onearr=new HashSet<Character>();
        for(int i=0;i<onelength;i++)
        		onearr.add(ch[i]);
        for(int j=0;j<twolength;j++)
               if(onearr.contains(two.charAt(j)))
                  return true;
          return false;
        }
    public void input()
       {
        String a="",b="";
        boolean result=false;
        Scanner s=new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        while(n>0)
          {
            a="";b="";
            result=false;
        a=s.nextLine();
        b=s.nextLine();
        int alength=a.length(),blength=b.length();
        if(alength>=blength)
           result=operation(a,b);   
        else
           result=operation(b,a);
        if(result)
            System.out.println("YES");
        else
            System.out.println("NO");
        n--;
        }
       }
    public static void main(String[] args) 
    {
    	Solution obj=new Solution();      
        obj.input();
        
    }
}
