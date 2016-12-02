import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void operation()
        {
        String newhour=null,result=null;
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        int timelength=time.length();
        String split[]=time.split(":");
        int hour=Integer.parseInt(split[0]);
        int minutes=Integer.parseInt(split[1]);
        int seconds=Integer.parseInt(split[2].substring(0,split[2].length()-2));
            if((hour<1 || hour>12)|| (minutes<0 || minutes>59) || (seconds<0 || seconds>59) )
                        return;
            if(time.contains("AM") && hour!=12)
                result=time.substring(0,timelength-2);
            else 
            { 
            if(time.contains("PM"))
                {
                if(hour==12)
                    newhour=String.valueOf(hour);   
                else
                    newhour=String.valueOf(hour+12);
                }
            else if(hour==12)
                newhour="00";
            result=newhour+time.substring(2,timelength-2);
            }
        System.out.println(result);    
        }
    public static void main(String[] args)
    {
        operation();        
    }
}
