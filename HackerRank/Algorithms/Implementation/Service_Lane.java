import java.util.Scanner;
public class Service_Lane {

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
       
        try
        {
        int N=s.nextInt();//Length of road
        Integer arr[]=new Integer[N];
        int T=s.nextInt();//Number of Testcases
        int x=0;
        if(N>=2 && N<=100000 && T<=1000)
        {
        	int y=0;
        while(x<N && ((y=s.nextInt())>=1) && (y<=3)  )
        	{
        	  arr[x]=y;
        	  x++;
        	}
        while(T>=1)
        {
        int i=s.nextInt();//Entry Segment
        int j=s.nextInt();//Exit Segment
        int small_element=5;
        
      if(j-i+1>=2 && j-i<1000 && 0<=i && i<j && j<N)
      	{                    
        out:
        while(i<=j)
        {
        	if(arr[i]>1 && arr[i]<small_element)//
        	{
        		small_element=arr[i];
        		//System.out.println("Inside if"+small_element);
        	}
        	else if(arr[i]==1)
        		{
        		small_element=1;
        		//System.out.println("Inside else if"+small_element);
        		break out;
        		}
        	i++;
        
        	
        }
        System.out.println(small_element);
        T--;
      }
        
        }
        }
	}
        catch(Exception e)
            {}
        finally
            {
            s.close();
        }
    }
}
