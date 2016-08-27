import java.util.Scanner;
public class Insertion_Sort_Part1
{
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		Integer arr[]=new Integer[T];
		int i=0;////2(0) 4(1) 6(2) 8(3)
		out:
		if(T<=1000 && T>=1)
		{
		while(i<T)
		{
			arr[i]=s.nextInt();
			if(arr[i]>=-1000  && arr[i]<=10000)
				{
				  i++;
				}
			else 
				break out;
		}
		int v=arr[T-1];//3
		int T_copy=T;//5
		T_copy=T_copy-2;//3
		while(T_copy>=0 && arr[T_copy]>v)
		{
			arr[T_copy+1]=arr[T_copy];
			for(int j=0;j<T;j++)
				System.out.print(arr[j]+"\t");			
			T_copy--;
			System.out.println();
		}
		if(T_copy>=0 && arr[T_copy]<v)
		{
			arr[T_copy+1]=v;			
		}
		else
			arr[0]=v;
		for(int j=0;j<T;j++)
			System.out.print(arr[j]+"\t");	
		}	
	}

}
