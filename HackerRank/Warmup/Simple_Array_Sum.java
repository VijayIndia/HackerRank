import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main
    {
     Main()
        {
         int sum=0;
         try
             {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
             int N=Integer.parseInt(r.readLine());
             String arr[]=r.readLine().split(" ");
             for(int i=0;i<N;i++)
             {
                 sum+=Integer.parseInt(arr[i]);
             }
             System.out.println(sum);
         }
         catch(Exception e)
             {
             
              }
        }
    public static void main(String args[])
        {
        Main m=new Main();
        
        }
    }