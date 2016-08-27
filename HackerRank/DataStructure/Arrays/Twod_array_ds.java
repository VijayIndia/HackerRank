import java.io.*;
import java.util.*;

public class Twod_array_ds {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        Integer arr[][]=new Integer[6][6];
        int flag=0,value=0,value1=0;
        for(int k=0;k<6;k++)
        {
         for(int m=0;m<6;m++)
             {
        	arr[k][m]=s.nextInt();  

            }
        }
        for(int i=0;i<=3;i++)
            {
             for(int j=0;j<=3;j++)
                 {
            	 if(flag==1)
                 {
                 value1=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                 if(value1>value)
                    {
                     value=value1;
                    }
                   }
                 
            	 else if(flag==0)
                 {
                     value=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                   flag=1;
                 }
                  
                 }
            }
         System.out.println(value);
    }
}