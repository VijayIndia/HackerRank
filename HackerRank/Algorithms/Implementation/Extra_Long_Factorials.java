import java.math.*;
import java.util.Scanner;
public class Modified_Kaprekar_number 
{
	static int N=0;
	String x;
	int prev_value=0;
	public void multiply(String str)
	{
		int i=0,prev_value=0,x=0,z=0;
		 String a=null;
		 while(5*(i+1)<str.length() && str.length()>5)
		  {
		       z=(Integer.parseInt(str.substring(str.length()-(5*(i+1)),str.length()-5*i))*(N-1))+prev_value;
		       if(a!=null)
			       a=String.valueOf(z%100000)+a;
		       else
			       a=String.valueOf(z%100000);
		      int k=1;
		       while((a.length()+k)<=5*(i+1))
		  	       {
			         a="0"+a;
			         k=1;			
		  	       }
		      prev_value=z/100000;
		      i++;
		  }
		 if(str.length()<=5)
		 {
			 x=(Integer.parseInt(str.substring(0,str.length()))*(N-1))+prev_value;
		 }
		 else if(str.length()>5)
		 {
				 x=(Integer.parseInt(str.substring(0,(str.length()-(5*(i))))))*(N-1)+prev_value;
 
		 }
		    if(a!=null)
			a=String.valueOf(x)+a;
		    else 
		    	a=String.valueOf(x);	
			N--;
			if(N>1)
			multiply(a);
			else
			System.out.println(a);

	}

	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);	   
		N=s.nextInt();
		Modified_Kaprekar_number m=new Modified_Kaprekar_number();
		if(N>1 && N<=100)
		  m.multiply(String.valueOf(N));
        else
           System.out.println("1"); 
       
	}

}
