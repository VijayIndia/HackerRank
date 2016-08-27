import java.util.Scanner;
public class Main
{
    public int solveMeFirst(int f,int s)
    {
        int sum=f+s;
        return sum;
    }
     public static void main(String []args)
     {
         int first_input=0,second_input=0;
         Scanner scan=new Scanner(System.in);
         try
             {            
            first_input=scan.nextInt();
            second_input=scan.nextInt();
             }
         catch(Exception e)
             {
             
             }
         finally
             {           
             scan.close();
             }
            Main obj=new Main();
            int result=obj.solveMeFirst(first_input,second_input);
            System.out.println(result);
       
         
     }
}
