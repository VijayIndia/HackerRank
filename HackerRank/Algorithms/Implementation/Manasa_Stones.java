import java.util.*;
public class Manasa_Stones 
{

	public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);
      int T=s.nextInt();
      out:
      if(T>=1 && T<=10)
      {
        while(T>0)
          {
    	  int no_of_digits=s.nextInt();
    	  int a=s.nextInt();
    	  int b=s.nextInt();
    	  Integer arr[]=new Integer[no_of_digits];
    	  no_of_digits=no_of_digits-1;
    	  int i=no_of_digits,j=0,k=0,total=0;
      if(no_of_digits<=1000 && a<=1000 && b<=1000 && a>=1 && b>=1 && no_of_digits>=1 )
      {
    	 if(a!=b)
    	 {
    	  while(i>=0)//0<3 //2 3 4
    	  {
    	  j=no_of_digits-i;//3-0
    	  k=i;
    	  	while(j>0)
    	   		{
    	                  total+=b;                
    	                  j--;  
    	  		}
    	  	while(k>0)
    	  		{
    	  			total+=a;
    	  			k--;
    	  		}
    	    arr[i]=total;
    	    total=0;
             i--;    	  
    	  }
    	  Arrays.sort(arr);
    	  for(int l=0;l<arr.length;l++)
    		  System.out.print(arr[l]+"\t");
    		  System.out.println();
    	 }
   	  else if(a==b)
   		  System.out.println(b*i);
      }
      else
    	  break out;
          T--;
      }
	}
   }
}
