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
        while(n>0)
          {
        String str=s.nextLine();
        int strlength=str.length(),count=0;
        char ch[]=str.toCharArray();
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<strlength;i++)
            {
                if(st.isEmpty() || st.peek()!=ch[i])
                    st.push(ch[i]);
            else
                count++;
            }
            System.out.println(count);
            n--;
          }
        }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        s.input();
    }
}
