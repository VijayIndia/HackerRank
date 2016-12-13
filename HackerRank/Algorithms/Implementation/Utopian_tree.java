import java.util.*;

public class Solution 
{
 public static void input()
    {
    int result=0,testcase=0;
        Scanner in = new Scanner(System.in);
        testcase = in.nextInt();
    while(testcase>0)
       {
        result=operation(1,in.nextInt());
        System.out.println(result);
        testcase--;
        }
    }
    public static int operation(int height,int cycle)
       {  
         if(cycle>0)
           {
              height*=2;
              cycle--;

            }
           if(cycle>0)
            {
            height++;
            height=operation(height,--cycle);
            }
         
   
        return height;
       }
    public static void main(String[] args) 
    { 
        input();
    }
}
