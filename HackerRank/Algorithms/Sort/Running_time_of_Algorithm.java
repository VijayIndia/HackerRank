import java.util.Scanner;
public class Running_time_of_Algorithm
{
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		Integer arr[]=new Integer[T];
		int i=0,j=1,count=0;
		out:
		if(T<=1001 && T>=1)
		{
			while(i<T) 
				{
					arr[i]=s.nextInt();
						if(arr[i]>=-10000  && arr[i]<=10000)
							{
							i++;
							}
						else 
							break out;
				}
                       
			while(j<=(T-1))
			{                
				int v=arr[j];
				int k=j-1;
				int j_copy=j;
				in:
				while(k>=0 && arr[k]>v)
				{
					int temp=arr[k];
					arr[k]=v;
					arr[j_copy]=temp;							
					j_copy--;
					k--;
					count++;
				}	
              
                		
				j++;
			}
			   System.out.print(count);

				
		}	
	}

}
