import java.io.*;
import java.util.*;

public class Arrays_DS 
{
    Array_DS()
        {
                Scanner s=new Scanner(System.in);
                    int N=s.nextInt();
                    out:
                    if(N>=1 && N<=1000)
                        {
                        int i=0;
                        Integer arr[]=new Integer[N];
                        while(i<N)
                             {
                                arr[i]=s.nextInt();
                                if(arr[i]>=1 && arr[i]<=10000)
                                    i++;
                                else 
                                    break out;
                             }
                        while(N-1>=0)
                             {
                                System.out.print(arr[N-1]+"\t");
                                N--;
                             }
                        }

        }

    public static void main(String[] args) 
    {
        Arrays_DS obj=new Arrays_DS();
    }
}
