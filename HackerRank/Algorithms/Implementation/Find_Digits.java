import java.util.*;

public class Find_Digits {

    public static void input()
        {
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();
         int i=0,divisiblecount=0,n=0,number=0;
            for(int a0 = 0; a0 < t; a0++)
              {
                    i=0;divisiblecount=0;
                    number = in.nextInt();
                    n=number;
                    int arr[]=new int[10];
                    while(n>0)
                        {
                           arr[i]=n%10;
                           n=n/10;
                           if(arr[i]>0 && number%arr[i]==0)
                               divisiblecount++;
                           i++;
                         }
                    System.out.println(divisiblecount);
                }
        }
    public static void main(String[] args) 
    {       
        input();
    }
}
