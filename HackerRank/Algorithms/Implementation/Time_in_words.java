import java.util.Scanner;
public class Time_in_words 
{

	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in); 
		int hour=s.nextInt();
		int minutes=s.nextInt();
String before_thirty[]={"o' clock","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen"};
String quarter[]={"quarter","half"};
if(hour>=1 && hour<=11 && minutes>=0 && minutes<=60)
{
if(minutes<=30)
{
	if(minutes==0)
		System.out.println(before_thirty[hour]+"\t"+before_thirty[minutes]);	
	else if(minutes%15==0)
		System.out.println(quarter[(minutes/15)-1]+" past "+before_thirty[hour]);
	else if(minutes%15!=0 && minutes<=13)
		System.out.println(before_thirty[minutes]+" minutes past "+before_thirty[hour]);
	else if(minutes%15!=0 && minutes>13 && minutes<20)
		System.out.println(before_thirty[minutes-10]+"teen minutes past "+before_thirty[hour]);
	else if(minutes==20)
		System.out.println("twenty minutes past "+before_thirty[hour]);
	else if(minutes%15!=0 && minutes>13 && minutes>20)
		System.out.println("twenty "+before_thirty[minutes-20]+" minutes past "+before_thirty[hour]);
		
	}
else if(minutes>30)
{
	int exact_minutes=60-minutes;//31
	if(exact_minutes==0)
		System.out.println(before_thirty[hour+1]+"\t"+before_thirty[exact_minutes]);	
	else if(exact_minutes%15==0)
		System.out.println(quarter[(exact_minutes/15)-1]+" to "+before_thirty[hour+1]);
	else if(minutes%15!=0 && exact_minutes<=13)
		System.out.println(before_thirty[exact_minutes]+" minutes to "+before_thirty[hour+1]);
	else if(minutes%15!=0 && exact_minutes>13 && exact_minutes<20)
		System.out.println(before_thirty[exact_minutes-10]+"teen minutes past "+before_thirty[hour+1]);
	else if(exact_minutes==20)
		System.out.println("twenty minutes to "+before_thirty[hour+1]);
	else if(exact_minutes%15!=0 && exact_minutes>20)
	    System.out.println("twenty "+before_thirty[exact_minutes-20]+" minutes to "+before_thirty[hour+1]);
	
	}
	}

}
}