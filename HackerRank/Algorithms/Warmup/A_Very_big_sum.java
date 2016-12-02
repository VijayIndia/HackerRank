import java.util.*;

public class Solution 
{
    public static void input()
       {
        long sum=0;
        Scanner s=new Scanner(System.in);
        int number=Integer.parseInt(s.nextLine());
        String input_str=s.nextLine();
        String input_arr[]=input_str.split(" ");
        for(int i=0;i<number;i++)
            {
               sum+=Long.parseLong(input_arr[i]);
            }
        System.out.println(sum);
       }
    
    public static void main(String[] args) 
    {
        input();       
    }
}
