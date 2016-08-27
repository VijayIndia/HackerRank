import java.util.Scanner;


public class Staircase 
{
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
       for(int i=1;i<=N;i++)
       {
    	   int x=N-i;
    	   while(x>0)
    		   {
    		    System.out.print(" ");
    		   x--;
    		   }
    	   int j=i;
    	   while(j>0)
    	   {
    		   System.out.print("#");
    		   j--;
    	   }
    	   System.out.println();
       }
	}

}
