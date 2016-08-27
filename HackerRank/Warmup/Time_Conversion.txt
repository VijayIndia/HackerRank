import java.util.Scanner;


public class Time_Conversion 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String b=s.nextLine();
        String ar[]=b.split(":");//07,05,45PM    ===  07,05,45AM
        String ar2[]=(ar[2].contains("AM"))?(ar[2].split("AM")):(ar[2].split("PM"));//45
        int hour=Integer.parseInt(ar[0]);
        if(ar[2].contains("AM"))
        {
        	ar[0]=(hour==12)?"00":ar[0];
        		
        	System.out.println(ar[0]+":"+ar[1]+":"+ar2[0]);
        }
        else if(ar[2].contains("PM"))
        {
        	ar[0]=((hour!=12)?(((hour+12)<=23)?String.valueOf(hour+12):"00"):"12");
        	System.out.println(ar[0]+":"+ar[1]+":"+ar2[0]);
        }
	}

}
