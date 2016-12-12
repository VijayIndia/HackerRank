import java.util.Scanner;
public class Main
{
    public int solveMeFirst(int f,int s)
    {
        int sum=f+s;
        return sum;
    }
	public void input()
	{	
		int first_input=0,second_input=0,result=0;
         	Scanner scan=new Scanner(System.in);
		first_input=scan.nextInt();
		second_input=scan.nextInt();
    		result=solveMeFirst(first_input,second_input);
                System.out.println(result);
	}
     public static void main(String []args)
     {         
            Main obj=new Main();
	    obj.input();       
     }
}
