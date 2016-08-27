import java.util.Scanner;
public class Sherlock_and_theSquares 
{
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T>=1 && T<=100)
		{
		int i=s.nextInt();
		int j=s.nextInt();
		if(i<=1000000000 && 1<=i && i<=j && j<=1000000000)
		{
		int count=0,f=(int)Math.sqrt(i);
			while(f*f<=j)
			{
					if(f*f<=j && f*f>=i)
						{
						//System.out.println(st[0]);
						count++;
						}
					f++;
			}
		System.out.println(count);
		}
		T--;
		}
		s.close();
     
	}

}
