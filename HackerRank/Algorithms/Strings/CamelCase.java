import java.util.*;
import java.util.regex.*;
class CamelCase
    {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()< 1 || s.length()>Math.pow(10,5))
            return;
        Pattern p=Pattern.compile("[A-Z]");
          Matcher m=p.matcher(s); 
          int count=1;
        while(m.find())
        {
        	count++;
        }    
        System.out.println(count);    

    }
        
    }
