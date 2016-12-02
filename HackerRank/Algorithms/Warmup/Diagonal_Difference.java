import java.util.Scanner;
public class Diagonal_Difference 
{
 public static void input()
    {
       int leftdiagonal=0,rightdiagonal=0;
       Scanner s=new Scanner(System.in);
       int number=Integer.parseInt(s.nextLine());
       int maxarraysize=number-1;
        String elementarr[][]=new String[number][number];
       for(int i=0;i<number;i++)
           {
            elementarr[i]=s.nextLine().split(" ");
            leftdiagonal+=Integer.parseInt(elementarr[i][i]);
            rightdiagonal+=Integer.parseInt(elementarr[i][maxarraysize-i]);
           }
       System.out.println(Math.abs(leftdiagonal-rightdiagonal));          
    }
	public static void main(String[] args) 
	{
        input();
        }

}
