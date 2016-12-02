import java.io.*;
import java.util.*;

public class Solution 
{
public static void input()
    {
    int totalcount=0,negativecount=0,positivecount=0,zerocount=0;
     Scanner in = new Scanner(System.in);
        int number =Integer.parseInt(in.nextLine());
        int arr[]=new int[number];
        for(int i=0;i<number;i++)
            {
                arr[i]=in.nextInt();
                if(arr[i]>0)
                      positivecount++;
                else if(arr[i]==0)
                      zerocount++;
                else if(arr[i]<0)
                      negativecount++;
            }
           System.out.println((float)positivecount/number);
           System.out.println((float)negativecount/number);
           System.out.println((float)zerocount/number);

    }
    public static void main(String[] args) 
    {
       input();
    
    }
}
