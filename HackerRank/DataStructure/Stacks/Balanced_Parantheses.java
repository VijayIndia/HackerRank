import java.util.*;

public class Solution 
{
    public void input()
        {
           Scanner in = new Scanner(System.in);
           int n=Integer.parseInt(in.nextLine());
           while(n>0)
               {
               Stack<Integer> st=new Stack<Integer>();
               String str=in.nextLine();
               int strlength=str.length();
               int i=0;
               while(i<strlength)
                   {
                    int j=((int)str.charAt(i));
                    if(!st.empty() && ((st.peek()+1)==j || ((st.peek()+2)==j)))
                        st.pop();
                    else  
                        st.push(j);
                   i++;
                   }
                if(st.empty())
                    System.out.println("YES");
                else
                    System.out.println("NO");
                n--;
               }
        
        }

    public static void main(String[] args) 
    {
      Solution obj=new Solution();
      obj.input();
    }
}
