import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void input()
        {
        int linecount=0,number=0,leftcount=0,i=0;
         Scanner in = new Scanner(System.in);
         number =Integer.parseInt(in.nextLine());
         leftcount=number-1;         
         while(linecount<number)
             {
             i=0;
             for(;i<leftcount;i++)
                    System.out.print(" ");
             for(;i<number;i++)
                   System.out.print("#");
             leftcount--;
             linecount++;
             System.out.println();
             }  
        
        }

    public static void main(String[] args) 
    {
       input();
    }
}
