import java.util.*;

public class Solution 
{
    public boolean input(String str)
        {            
            char ch[]=str.toCharArray();
            int strlength=str.length()-1;
            for(int i=0;i<strlength;i++)
                {
                if(Math.abs(ch[i+1]-ch[i])!=Math.abs(ch[strlength-i]-ch[strlength-i-1]))
                        return false;
                }    
            return true;
        }
    public static void main(String[] args) 
    {
        String str="";
        boolean result=false;
        Solution obj=new Solution();
        Scanner s=new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        while(n>0)
            {
            str=s.nextLine();
            result=obj.input(str);
            if(result)
                System.out.println("Funny");            
            else
                System.out.println("Not Funny");            
             n--;
            }
     }
}
