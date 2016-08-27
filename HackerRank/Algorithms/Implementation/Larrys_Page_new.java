import java.util.Scanner;


public class Larrys_Page_new 
{

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		 int T=s.nextInt();
		     out_1:
		    while(T>0 && T<=10)
		    	{
		    	int N=s.nextInt();//3
		    	if(!(N<=1000 && N>=3) )
		            break out_1;
		        Integer a[]=new Integer[N];
		    	int i=1,prev=-1,prev_value=0,count=0,flag=0;
		        for(int k=0;k<N;k++)
		            {
		            a[k]=s.nextInt();//3 1 2 
		            if(!(a[k]>=1 && a[k]<=N))
		                break out_1;
		            for(int c=0;c<k;c++)
		              {
		                if(a[k]==a[c])
		                  {                    
		                    break out_1;
		                  }
		              }
		              
		            } 
		   while(i<N-1)
		    {
			   //System.out.println("i="+i);
	        	int temp=a[i];
	        	prev_value=a[i-1];

		        if(prev_value<a[i] && a[i]<a[i+1])
		        {
		        	//Yes
		        }
		        else if(prev_value<a[i]   && prev_value>a[i+1])
		        {
		        	a[i]=a[i-1];//2
		        	a[i-1]=a[i+1];//1
		        	a[i+1]=temp;//3	        	
		        	//Yes
		        	i=i-1;
		        	while(i-1>=0 && a[i-1]>a[i])
		        	   i--;
		        }
		        else if(prev_value>a[i+1] && a[i]<a[i+1])
		        {
		        	a[i]=a[i+1];//2
		        	a[i+1]=a[i-1];//3
		        	a[i-1]=temp;//1		        	
		        	i=i-1;
		        	while(i-1>=0 && a[i-1]>a[i])
		        	   i--;
		        }
		        else if(prev_value!=0 && prev_value<a[i+1] && a[i]>a[i+1])
		        {
		        }
		        else if(prev_value!=0 && prev_value>a[i] && a[i]>a[i+1])
		        {      
		        	a[i]=a[i-1];
		        	a[i-1]=a[i+1];
		        	a[i+1]=temp;		        	
		        	i=i-1;
		        	while(i-1>=0 && a[i-1]>a[i])
		        	   i--;
		        }
		        else if(prev_value!=0 && prev_value>a[i] && a[i+1]>prev_value)
		        {
		        	a[i]=a[i+1];
		        	a[i+1]=a[i-1];
		        	a[i-1]=temp;
		        	i=i-1;
		        	while(i-1>=0 && a[i-1]>a[i])
		        	   i--;
		        }
		      
		        i++;
		    }
		   
		            out_new:
		            for(int x=0;x+1<N;x++)
		              {
		            	if(a[x]>a[x+1])
		                   {
		            		flag=1;
		            		System.out.println("NO");
		            		break out_new;
		            		}
		              }
		        if(flag==0)
		        {
		        	System.out.println("YES");
		        }
		        T--;
		  }
	}

}
