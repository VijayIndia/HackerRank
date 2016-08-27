import java.util.Scanner;
public class Tree_Sapling
{
	
	public void Tree_Sapling(int x,int n,int limit)
	{
		//System.out.println("x="+x+"n="+n);
		if(limit>0 && n%2!=0 && n<=limit)
		{			
			Tree_Sapling(x*2,++n,limit);
		}
		else if(limit>0 && n%2==0 && n<=limit)
		{
			Tree_Sapling(x+1,++n,limit);
		}
		else if(n>limit)
		{
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    Tree_Sapling t=new Tree_Sapling();
		int N=s.nextInt();
	   while(N>=1 && N<=10)
	   {
		   int input=s.nextInt();
		 t.Tree_Sapling(1,1,(0<=input && input<=60)?input:-1);
	    N--;
	   }
	   s.close();
	}

}
