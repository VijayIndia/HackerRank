import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public void input()
        {
        Scanner s=new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        String str="";
        int strlength=0,halflength=0,result=0;
        if(n>100 || n<1 )
            return;
          while(n>0)
             {
              str="";
              strlength=0;
              halflength=0;
              result=0;
                str=s.nextLine();
                strlength=str.length();
              if(strlength<1 || strlength>10000)
                    return;
                if(strlength%2!=0)
                     result=-1;
              else
                {
                halflength=strlength/2;
                String str1=str.substring(0,halflength);
                String str2=str.substring(halflength,strlength);
                result=operation(str1,str2);
                }
                System.out.println(result);
                n--;
             }
        }
    public int operation(String one,String two)
        {
            int onelength=one.length(),twolength=two.length();
            int count=0,index=0;
            char chone[]=one.toCharArray();
            char chtwo[]=two.toCharArray();
            Arrays.sort(chone);
            Arrays.sort(chtwo);
            List<Character> obj=new ArrayList<Character>();
            for(int i=0;i<onelength;i++)
                   obj.add(chone[i]);            
            for(int j=0;j<twolength;j++)
                {
                if(obj.contains(chtwo[j]))
                    {
                       index=obj.indexOf(chtwo[j]);
                       obj.remove(index);
                    }  
                }
            return obj.size();
        }
    public static void main(String[] args) 
    {
        Solution obj=new Solution();
        obj.input();
    }
}
