import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
      Scanner s=new Scanner(System.in);
       int n=Integer.parseInt(s.nextLine());
        if(n<1 || n>1000)
            return;
        while(n>0)
            {
            String str=s.nextLine();
            if(str.length()>20 || str.length()<1)
              return;
            a.add(str);
            n--;
            }
        int m=Integer.parseInt(s.nextLine());
           if(m<1 || m>1000)
            return;
        ArrayList b=new ArrayList();
        while(m>0)
            {
            b.add(s.nextLine());
            m--;
            }
        for(int j=0;j<b.size();j++)
         {
            int count=0;
            for(int i=0;i<a.size();i++)
                {
                    if(b.get(j).equals(a.get(i)))
                         {   
                            count++;
                         }
                }
            System.out.println(count);
           }
    }
}