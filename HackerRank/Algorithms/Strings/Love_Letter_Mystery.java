import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public int input(String str)
        {            
            String str1=null,str2=null;
            int strlength=str.length();
           
            int diff=0;
            int halfstrlength=strlength/2;
            str1=str.substring(0,halfstrlength);
            if(strlength%2==0)
                str2=str.substring(halfstrlength,strlength);
            else
                str2=str.substring(halfstrlength+1,strlength);
            for(int i=0;i<halfstrlength;i++)
               diff+=Math.abs(str1.charAt(i)-str2.charAt(halfstrlength-1-i));
            return diff;
        }

    public static void main(String[] args) 
        {
            Solution obj=new Solution();
            Scanner s=new Scanner(System.in);
            int n=Integer.parseInt(s.nextLine());    
            String str=null;
            int result=0,strlength=0;
            if(n>10 || n<1)
                return;
            while(n>0)
            {
                str=s.nextLine();
                strlength=str.length();
                if(strlength>Math.pow(10,4) || strlength <1)
                        return;
                Pattern p=Pattern.compile("[^a-z]");
                Matcher m=p.matcher(str);
                if(m.find())
                    return;
                result=obj.input(str);
                System.out.println(result);
                n--;
            }
        }
}
