import java.util.Scanner;
public class ACM_ICPC_TEAM 
{
	
  	
	public static void main(String[] args) 
	{
      Scanner s=new Scanner(System.in);
     String N_M[]=s.nextLine().split(" ");
        int N=Integer.parseInt(N_M[0]);
     int M=Integer.parseInt(N_M[1]); 
    
     char r[][]=new char[N][M];
     Integer a[][]=new Integer[N][N];
     int count=0;
     if(N>=2 && N<=500 && M>=1 && M<=500)
     {
      for(int i=0;i<N;i++)
      {
    	  String str=s.nextLine();
    	  r[i]=str.toCharArray();    	  
      }
      for(int i=0;i<N;i++)//0
      {
      for(int k=i+1;k<N;k++)//1
      {
      	for(int j=0;j<M;j++)
      	{
      	 	if((r[i][j]=='1')||r[k][j]=='1')
      		{
      		count++;
      		}      		
      	}
        a[i][k]=count;
      count=0;
      }
      }
   int max_value=0,final_count=1;
      for(int i=0;i<N;i++)
      {
    	  for(int k=i+1;k<N;k++)
    	  	{
    		  if(a[i][k]>max_value)
    		  {
    			  max_value=a[i][k];
    			  final_count=1;
    		  }
    		  else if(a[i][k]==max_value)
    		  {
    			  final_count++;
    		  }
    			  
    		
    	  	}
      }
	  System.out.println(max_value);
	  System.out.println(final_count);
     }
      
	}

}
