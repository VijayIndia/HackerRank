import java.util.Scanner;
public class Diagonal_Difference 
{

	Diagonal_Difference()
	{
		 Scanner s=new Scanner(System.in);
		 int N=s.nextInt();
		 int Left_diagonal=0,Right_diagonal=0;
         Integer arr[][]=new Integer[N][N];
         for(int i=0;i<N;i++)
         {
        	 for(int j=0;j<N;j++)
        	 {
        		 arr[i][j]=s.nextInt();
        		 if(i==j)
        		 {
        			 Left_diagonal+=arr[i][j];
        		 }
        		 if(i+j==N-1)
        		 {
        			 Right_diagonal+=arr[i][j];
        		 }
        	 }
         } 
         int ans=(Left_diagonal>Right_diagonal)?Left_diagonal-Right_diagonal:Right_diagonal-Left_diagonal;

         System.out.println(ans);
	}
	public static void main(String[] args) 
	{
		Diagonal_Difference obj=new Diagonal_Difference();
	}

}
