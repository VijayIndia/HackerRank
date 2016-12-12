import java.io.*;
import java.util.*;

public class Solution 
{

   public boolean input()
   {
	   
	   Scanner s=new Scanner(System.in);
	   String str=s.nextLine().toLowerCase().replaceAll("[^a-zA-Z]","");
	   int strlength=str.length();
	   Set<Character> obj=new HashSet<Character>();
	   for(int i=0;i<strlength;i++)
		   	obj.add(str.charAt(i));
	   if(obj.size()==26)
		   return true;
	  return false;
	   
   }
    public static void main(String[] args) 
    {
    	Solution obj=new Solution();      
        boolean ans=obj.input();
        if(ans)
        	System.out.println("pangram");
        else
            System.out.println("not pangram");

    }
}
