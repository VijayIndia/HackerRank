import java.util.Scanner;
public class Library_fine_new 
{

	
	public static void main(String[] args) 
	{
      Scanner s=new Scanner(System.in);
      int act_date=s.nextInt();
      int act_month=s.nextInt();
      int act_year=s.nextInt();
      int exp_date=s.nextInt();
      int exp_month=s.nextInt();
      int exp_year=s.nextInt();
      if(exp_year==act_year && act_month==exp_month)
      {
    	  if(act_date>exp_date)
    	  {
    		  System.out.println((act_date-exp_date)*15);
    	  }
    	  else
    		  System.out.println(0);

      }
      else if(exp_year==act_year && act_month!=exp_month)
      {
    	  if(act_month>exp_month)
    	  {
    		  System.out.println((act_month-exp_month)*500);
    	  }
    	  else
    		  System.out.println(0);
      }
      else if(act_year>exp_year)
      {
    	  System.out.println(10000);
    	  
      }
      else
    	  System.out.println(0);
      
      
	}

}
