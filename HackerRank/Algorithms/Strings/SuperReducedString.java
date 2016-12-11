import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    public static void main(String[] args)
    {
        int flag=0;
        Stack s =new Stack();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.length()>100 || str.length()<0)
                    return;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(s.isEmpty() || ((char)s.peek())!=ch[i])
                s.push(ch[i]);
            else
                s.pop();
        }
        String output="";
        while(s.size()>0)
            {
                flag=1;
                output=s.pop()+output;
            }
        if(flag==1)
            System.out.println(output);
        else
            System.out.println("Empty String");
    }
}